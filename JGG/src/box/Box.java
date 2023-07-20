package box;

public class Box {

	protected int w = 12; // 가로
	protected int h = 12; // 세로

	protected String[] s;

	// 중간
	protected void drawMid() {

		int size1 = h;

		for (int i = 0; i < size1 - 1; i++) {
			System.out.println(s[i]);

//			int size2 = (w * 3) - s[i].length();
//			for (int j = 0; j < size2; j++) {
//			}
		}
		size1 = s.length;
		for (int y = 0; y < s.length; y++) {

			for (int i = 0; i < (w - 1); i++) {

			}
		}

	}

	// box출력
	public void drawBox() {
		drawMid();
	}
}
