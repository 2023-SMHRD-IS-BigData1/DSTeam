package object;

public class Teacher extends Enemi{

	public Teacher() {this(0,0);}
	public Teacher(int x, int y) {
		name = "나미리선생님";
		setImage("T");
		maxHp = 25;
		minAtk = 8;
		maxAtk = 12;
		sp=2;
		
		setEnemi(x,y);
	}
	
}
