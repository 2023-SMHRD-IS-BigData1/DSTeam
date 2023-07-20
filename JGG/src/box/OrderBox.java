package box;

import java.util.Scanner;
import object.JJangGu;

public class OrderBox extends Box{

	Scanner sc = new Scanner(System.in);
	JJangGu player;

	// 짱구 명령어
	public OrderBox(JJangGu p) {
		player = p;
		h = 4;
		s = new String[h];

		s[0] = "  짱구 기술";
		s[1] = "  1. 때리기";
		s[2] = "  2. 변신";
	}

	public char inOrder() {
		System.out.print("  명령어를 선택하세요 : ");
		return sc.next().charAt(0);
	}

	public char setMainOrder() {
		drawBox();
		return inOrder();
	}

}
