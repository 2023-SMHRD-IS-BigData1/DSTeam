package object;

import javazoom.jl.player.MP3Player;

public class Boss extends Enemi{
	
	public Boss() {this(0,0);}
	public Boss(int x, int y) {
		name = "원장선생님";
		setImage("S");
		maxHp = 100;
		minAtk = 10;
		maxAtk = 15;
		sp=2;
		
		setEnemi(x,y);
	}
	

}
