package object;


public class RoseTrio extends Enemi{

	public RoseTrio() {this(0,0);}
	public RoseTrio(int x, int y) {
		name = "장미트리오";
		setImage("R");
		maxHp = 25;
		minAtk = 4;
		maxAtk = 8;
		sp=2;
		
		setEnemi(x,y);
	}
	
	
	
	
	
}
