package object;

public class Wall extends Ob{
	   public Wall(){
	      setImage("▒▒▒");
	      collider=true;
	   }
	   public Wall(int x, int y){
	      setImage("▒▒▒");
	      collider=true;
	      this.x=x;
	      this.y=y;
	   }
	}