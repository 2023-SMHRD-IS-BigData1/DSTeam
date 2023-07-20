package box;

import object.JJangGu;
import object.State;

public class GageBox extends Box {

	private State ob;
	private String gage = "█";
	

	public GageBox(State ob) {

		int num = 1;
		this.ob = ob;

		if (ob instanceof JJangGu)
			num++;

		s = new String[num];
		h = 4 + (num * 2);
	}

	private void setGage() {
		
	
		s[0] =  "  hp : " + ob.getHp() + "/" + ob.getMaxHp();
		System.out.println();
		
	}

	private void drawS(int index) {
		System.out.print(s[index]);

		int size = ((w - 1) * 3) - s[index].length();
		for (int j = 0; j < size; j++) {
		}
		System.out.println();
	}
	
	
	// 체력게이지 출력
	private void drawGage(double i) {
		double a = i;
		
		int b = (int) (((w - 2) * 3) * a);
		System.out.print("  ");
		for (int j = 0; j < b; j++) {
			System.out.print(gage);
		}

		int c = ((w - 1) * 3) - b;
		for (int j = 0; j < c; j++) {
		}
		System.out.println();
		
	}

	protected void drawMid() {
		setGage();
		drawS(0);
		drawGage((double) ob.getHp() / ob.getMaxHp());
		System.out.println();
	}

	public void drawBox() {
		setGage();
		drawMid();
	}

}
