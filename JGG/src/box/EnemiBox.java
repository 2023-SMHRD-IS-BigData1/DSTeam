package box;

import object.Enemi;

public class EnemiBox extends Box {

	private Enemi ob;

	public EnemiBox() {
	}

	public EnemiBox(Enemi ob) {
		this.ob = ob;
		h = 4;
		s = new String[h];
	}

	private void setGage() {
		
		
		s[0] = "  이름 : " + ob.getName();
		s[1] = "  공격력 : " + ob.getMinAtk() + " ~ " + ob.getMaxAtk();
		setS3();
	}
	private void setS3() {
		switch (ob.getOrder()) {
		case '1':
			s[2] = "  다음행동 : " + "떄리기!\n";
			break;
		case '2':
			s[2] = "  다음행동 : " + "회피!\n";
			break;
		case '3':
			s[2] = "  다음행동 : " + "꿀밤!\n";
			break;
	
		}
	}

	// MonsterBox 출력
	public void drawBox() {
		setGage();
		drawMid();
	}
}
