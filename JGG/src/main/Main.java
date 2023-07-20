package main;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;
import member.Controller;
import member.MemberDTO;
import member.SignIn;
import object.Boss;
import object.Buriburi;
import object.Enemi;
import object.JJangGu;
import object.RoseTrio;
import object.Shop;
import object.Teacher;
import screen.Battle;
import screen.Field;
import object.JJangGu;
import screen.Store;

public class Main {
	static void runGame(

			Stage stage, Field f, JJangGu player, Enemi[] enemi

	) {
		Sleep t = new Sleep();
		boolean playerTurn = true;
		boolean meet = false;
		int checkMoveX = 0;
		int checkMoveY = 0;
		int size = enemi.length;
		int cnt = 0;
		int index = 0;

		// Field 설정 및 그리기
		while (true) {

			meet = false;

			// 플레이어의 턴
			if (playerTurn) {
				// 화면 출력
				f.cls();
				stage.printLv();
				f.drawField();
				player.setMoveOrder();

				while (player.readMoveOrder()) {
					meet = player.runMoveOrder(f);
					if (player.isCheckShop())
						break;

					if (meet) {
						checkMoveX = player.getMoveX();
						checkMoveY = player.getMoveY();
						break;
					}

					// 화면 출력
					f.cls();
					stage.printLv();
					f.drawField();
					player.printRead();
					t.sleep();
				}
			}
			// 몬스터의 턴
			else {
				for (int i = 0; i < size; i++) {
					if (enemi[i].getHp() != 0) {
						meet = enemi[i].run(f);

						if (meet) {
							checkMoveX = enemi[i].getX();
							checkMoveY = enemi[i].getY();
							break;
						}

						// 화면 출력
						f.cls();
						stage.printLv();
						f.drawField();
						enemi[i].printTurn();
						t.sleep();
					}
				}
			}
			playerTurn = !playerTurn;

			// 포털에 갈 경우 break
			if (player.isCheckShop())
				break;

			// 몬스터를 만나면 배틀페이즈
			if (meet) {
				// 몬스터 정보 불러오기
				int obNum = f.checkObNum(checkMoveX, checkMoveY);
				Enemi[] e = new Enemi[obNum];
				for (int i = 0; i < obNum; i++) {
					e[i] = (Enemi) f.getObData(checkMoveX, checkMoveY, i);
					if (e[i].getName().equals("원장선생님")) {
						MP3Player mp3 = new MP3Player();
						mp3.play(".\\bgm\\boss.mp3");
					}
				}
				Battle bs = new Battle(player, e, !playerTurn);
				System.out.println();
				t.sleep(500);
				System.out.println("\t\t\t" + "적이 나타났다!!!");
				t.sleep(500);
				System.out.println("\t\t\t" + "떡잎방범대 출동~!!!");
				t.sleep(1000);

				while (true) {
					// 화면 출력
					f.cls();
					bs.PrintScreen();
					// 싸움
					bs.battle();
					t.sleep(1500);

					// 전투가 끝났는지 확인
					if (bs.checkEnd())
						break;
				}
				t.sleep(1000);

				if (player.getHp() == 0)
					f.clearObData(player.getX(), player.getY());
				else
					f.clearObData(checkMoveX, checkMoveY);
			}
			// 죽은 경우 break
			if (player.getHp() == 0) {
				player.printSa();
				t.sleep(3000);
				break;
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		SignIn si = new SignIn();
		Sleep time = new Sleep();
		Controller con = new Controller();
		JJangGu player = new JJangGu();
		Stage stage = new Stage();
		Field f;
		Shop shop = new Shop();
		JJangGu jg = new JJangGu();
		ArrayList<String> list = new ArrayList<String>();
		MP3Player mp3 = new MP3Player();

		Stage title = new Stage();
		Enemi[] enemi;
		player = new JJangGu();

		title.printStartScreen1();
		mp3.play(".//bgm//jg_startfull.mp3");

		time.sleep(2500);

		while (true) {
			System.out.print("[1]회원가입  [2]로그인 >> ");
			int input = sc.nextInt();

			if (input == 1) {
				si.IdCheck();
				si.signIn();
				
			} else if (input == 2) {
				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("PW : ");
				String pw = sc.next();

				MemberDTO dto = new MemberDTO(id, pw);
				con.login(dto);

				if (con.login(dto) > 0) {
					System.out.println("환영합니다!\n");
					break;
				} else {
					System.out.println("로그인 실패!\n");
				}

			}

			else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}

		while (true) {
			System.out.print("[1]게임시작  [2]내 배지 확인 >> ");
			int input = sc.nextInt();

			if (input == 1) {
				break;

			} else if (input == 2) {
				System.out.print("ID를 입력해주세요 : ");
				String id = sc.next();

				MemberDTO dto = new MemberDTO(id, null);
				con.badge(dto);

			}

			else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}

		if (mp3.isPlaying()) {
			mp3.stop();
			mp3.play(".//bgm//simburm.mp3");
		}

		title.printStartScreen2();
		time.sleep(2500);
		title.printStartScreen3();
		time.sleep(2500);
		title.printStartScreen4();
		time.sleep(2500);
		System.out.println("\t\t\t" + "======================");
		System.out.println("\t\t\t" + "  3만원을 획득하였습니다!");
		System.out.println("\t\t\t" + "======================");
		time.sleep(2500);

		 // stage1
	      stage.setLv(1);
	      stage.setFieldSize(8, 4);
	      f = new Field(stage.getw(), stage.geth());
	      mp3.play(".//bgm//chase2.mp3");
	      
	      player.setXY(0, 0);
	      int[][] wallMask1 = { 
	       { 0, 0, 1, 0, 0, 0, 0, 0 },
	       { 1, 0, 0, 0, 1, 1, 0, 0 }, 
	       { 0, 0, 1, 0, 0, 1, 0, 0 },
	       { 0, 0, 0, 0, 0, 0, 0, 0 } };

	      enemi = new Enemi[5];
	      enemi[0] = new RoseTrio(7, 1);
	      enemi[1] = new Buriburi(4, 2);
	      enemi[2] = new Buriburi(2, 1);
	      enemi[3] = new Teacher(4, 0);
	      enemi[4] = new RoseTrio(0, 3);
	      shop = new Shop(6, 2);

	      // Field에 오브젝트 넣기
	      f.addObData(player);
	      f.addWallMaskObData(wallMask1);
	      f.addObData(enemi);
	      f.addObData(shop);

	      // 게임 진행
	      runGame(stage, f, player, enemi);

	      // stage 종료
	      if (player.isCheckShop()) {
	         stage.stage1Clear();
	       
	        
	      } else {
	         stage.stageFail();
	         return;
	      }
	      time.sleep(2000);

	      stage.setLv(2);
	      stage.setFieldSize(8, 8);
	      f = new Field(stage.getw(), stage.geth());
	      if(mp3.isPlaying()) {
	    	  mp3.stop();
	    	  mp3.play(".//bgm//chase2.mp3");
	      }
	      
	      // 오브젝트 좌표 직접 설정
	      player.reset(0, 0);
	      int[][] wallMask2 = { 
	      { 0, 1, 0, 0, 0, 0, 0, 0 }, 
	      { 0, 1, 0, 0, 1, 1, 0, 0 }, 
	      { 0, 0, 0, 1, 0, 0, 1, 0 },
	      { 1, 0, 1, 0, 0, 0, 0, 0 }, 
	      { 1, 0, 0, 0, 1, 0, 1, 0 }, 
	      { 0, 0, 1, 0, 0, 0, 0, 0 },
	      { 0, 0, 0, 0, 0, 1, 0, 0 }, 
	      { 0, 0, 0, 1, 0, 0, 0, 0 } };

	      enemi = new Enemi[7];
	      enemi[0] = new Buriburi(2, 0);
	      enemi[1] = new RoseTrio(1, 6);
	      enemi[2] = new Buriburi(4, 5);
	      enemi[3] = new RoseTrio(7, 0);
	      enemi[4] = new Boss(4, 3);
	      enemi[5] = new RoseTrio(6, 6);
	      enemi[6] = new Teacher(1, 3);
	      shop = new Shop(4, 2);

	      f.addObData(player);
	      f.addWallMaskObData(wallMask2);
	      f.addObData(enemi);
	      f.addObData(shop);

	      runGame(stage, f, player, enemi);

	      // stage 종료
	      if (player.isCheckShop()) {
	         stage.stage2Clear();
	        
	      } else {
	         stage.stageFail();
	         return;
	      }

	      stage.setLv(3);
	      stage.setFieldSize(8, 8);
	      f = new Field(stage.getw(), stage.geth());
	      if(mp3.isPlaying()) {
	    	  mp3.stop();
	          mp3.play(".//bgm//chase2.mp3");
	      }
	      // 오브젝트 좌표 직접 설정
	      player.reset(0, 0);
	      int[][] wallMask3 = { 
	      { 0, 0, 0, 0, 0, 1, 0, 0 }, 
	      { 0, 1, 0, 0, 0, 0, 0, 0 }, 
	      { 0, 0, 0, 0, 1, 1, 0, 0 },
	      { 0, 1, 0, 0, 0, 0, 0, 0 }, 
	      { 0, 0, 1, 0, 0, 1, 1, 0 }, 
	      { 0, 0, 0, 0, 0, 0, 0, 0 },
	      { 0, 1, 0, 1, 0, 0, 1, 0 }, 
	      { 0, 0, 0, 0, 0, 1, 0, 0 } };

	      enemi = new Enemi[10];
	      enemi[0] = new RoseTrio(2, 1);
	      enemi[1] = new Boss(3, 3);
	      enemi[2] = new Buriburi(5, 5);
	      enemi[3] = new RoseTrio(7, 1);
	      enemi[4] = new Buriburi(0, 5);
	      enemi[5] = new Teacher(3, 7);
	      enemi[6] = new Boss(7, 7);
	      enemi[7] = new Buriburi(0, 7);
	      enemi[8] = new RoseTrio(0, 2);
	      enemi[9] = new Teacher(4, 0);
	      shop = new Shop(6, 7);


		f.addObData(player);
		f.addWallMaskObData(wallMask3);
		f.addObData(enemi);
		f.addObData(shop);

		runGame(stage, f, player, enemi);

		// stage 종료
		if (player.isCheckShop()) {
			stage.stage3Clear();

			mp3.play(".\\bgm\\success.mp3");
			time.sleep(1700);
			stage.printEndingScreen1();
			time.sleep(1700);
			stage.printEndingScreen2();
			time.sleep(1700);
			stage.printEndingScreen3();
			time.sleep(1700);
			stage.printEndingScreen4();
			time.sleep(1700);
			stage.printEndingScreen5();
			System.out.println("\t\t\t" + "====================end==================");
			time.sleep(1700);
			System.out.println("\t\t\t" + "     ★심부름 배지★를 획득했습니다!!!");
			System.out.println("\t\t\t" + "   배지를 보관 하시려면 ID를 입력해주세요~");
			System.out.print("\t\t\t\t" + "ID : ");
			String id = sc.next();

			MemberDTO dto = new MemberDTO(id, null);
			con.badgeUpdate(dto);
			if (mp3.isPlaying()) {
				mp3.stop();
				mp3.play(".\\bgm\\ending_credit.mp3");
			}
			stage.endingCredit();

		}

		else {
			mp3.stop();
			stage.stageFail();
		}
		// 야채가게 함수 호출

	}

}
