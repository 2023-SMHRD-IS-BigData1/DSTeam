package screen;

import box.*;
import object.Enemi;
import object.JJangGu;

import java.util.Scanner;

//서로 싸우는 경우를 구현한 화면 class
public class Battle {
	private Scanner sc = new Scanner(System.in);
	private JJangGu player;
	private Enemi[] enemi;
	private boolean playerTurn;
	private EnemiBox[] sbox1;
	// private StateBox sbox2;
	private GageBox[] gbox1;
	private GageBox gbox2;
	private OrderBox obox1;
	private int enemiLen;
	

	// 생성자, Player, Monster[]을 this에 참조하고, playerTurn을 받아 몬스터를 발견하면 선공, 발견 당하면 후공으로
	// 정함
	public Battle(JJangGu player, Enemi[] enemi, boolean playerTurn) {
		this.player = player;
		this.enemi = enemi;
		this.playerTurn = playerTurn;
		enemiLen = enemi.length;

		// 출력 화면을 위한 Box 생성
		sbox1 = new EnemiBox[enemiLen];
		gbox1 = new GageBox[enemiLen];
		for (int i = 0; i < enemiLen; i++) {
			sbox1[i] = new EnemiBox(this.enemi[i]);
			gbox1[i] = new GageBox(this.enemi[i]);
		}
		gbox2 = new GageBox(this.player);
		obox1 = new OrderBox(this.player);
	}

	// Box 화면 출력
	public void PrintScreen() {
		for (int i = 0, size = enemiLen; i < size; i++) {
			gbox1[i].drawBox();
			sbox1[i].drawBox();
			System.out.println();
		}
		gbox2.drawBox();
	}

	// 싸움이 끝나는지 확인
	public boolean checkEnd() {
		boolean b = true;
		for (int i = 0; i < enemiLen; i++)
			b = b && enemi[i].getHp() == 0;
		b = b || player.getHp() == 0;
		return b;
	}

	// 몬스터의 수가 많을 경우 대상을 지정함
	public int chooseEnemi() {
		
		while (true) {
			for (int i = 1; i <= enemiLen; i++) {
				
				if (enemi[i - 1].getHp() == 0)
					System.out.println(i + ". 죽음");
				else
					System.out.println(i + " . " + enemi[i-1].getName());
			}
			
			System.out.print("  대상을 지정하세요(숫자로) : ");

			int num = sc.next().charAt(0) - '1';
			if (num < 0)
				num = 0;
			else if (num > enemiLen)
				num = enemiLen;

			if (enemi[num].getHp() != 0)
				return num;
			else
				System.out.println("  악당을 무찔러서 공격할 수 없다.");
		}

		
	}

	// 사용할 아이템을 고름

	public void chooseSkil() {
		System.out.println("  변신!!!!!");
		
			if (enemiLen == 1)
				player.skill(enemi[0]);
			else
				player.skill(enemi[chooseEnemi()]);
	}

	// 싸움을 구현
	public void battle() {

		// Player의 턴일 경우
		if (playerTurn) {
			// 메인 명령을 받음
			switch (obox1.setMainOrder()) {
			case '1':// 공격
				if (enemiLen == 1)
					player.attack(enemi[0]);
				else
					player.attack(enemi[chooseEnemi()]);
				break;

			case '2':// 스킬
				chooseSkil();
				break;
			}
		}
		// 몬스터의 턴일 경우
		else {
			// 죽지 않은 몬스터만 활동 가능
			for (int i = 0; i < enemiLen; i++)
				if (enemi[i].getHp() != 0)
					// 미리 결정한 명령을 가저옴
					switch (enemi[i].getOrder()) {
					case '1':// 공격
						if (player.getHp() != 0)
							enemi[i].attack(player);
						break;
					case '2':// 회피
						System.out.println(enemi[i].getName() + "이(가) 비웃습니다.");
						break;
					case '3': 
						if (player.getHp() != 0)
							enemi[i].Doubleattack(player);
						
					}
			// 몬스터의 턴이 끝나기 직전 다음에 행동할 명령을 지정
			for (int i = 0; i < enemiLen; i++)
				if (enemi[i].getHp() != 0)
					enemi[i].setOrder();

		}

		// 턴 전환
		playerTurn = !playerTurn;
	}
}
