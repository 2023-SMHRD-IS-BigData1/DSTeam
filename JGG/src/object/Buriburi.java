package object;

public class Buriburi extends Enemi{
	
	public Buriburi() {this(0,0);}
	public Buriburi(int x, int y) {
		name = "부리부리대마왕";
		setImage("B");
		maxHp = 25;
		minAtk = 6;
		maxAtk = 10;
		sp=2;
		
		setEnemi(x,y);
	}
	

}
