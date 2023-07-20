package object;

import java.util.Random;
import screen.Field;

//몬스터의 종류를 결정하는 class, 상태 정보를 가지므로 State 상속
public class Enemi extends State {
	Random rd = new Random();
	private int enemiMove;
	private char order;
	
	//생성자, 해당 좌표 값을 갖는 몬스터 생성, 몬스터 타입 지정
    public void setEnemi(int x, int y){
		setXY(x,y);
		hp = maxHp;
		setOrder();
	}
    
	//명령어 확률적으로 설정
	public void setOrder() {
		int r= rd.nextInt(100)+1;
		
		if(r>50)
			order='1';
		else if(r>20)
			order='2';
		else
			order='3';
	}
	
	//필드 이동, 적을 만나면 true 반환
	private boolean move(Field f,int moveX,int moveY) {
		this.moveX=x+moveX;
		this.moveY=y+moveY;
		
		if(this.moveX<f.getW() && this.moveX>=0 && this.moveY<f.getH() && this.moveY>=0)
			if(f.checkNullObData(this.moveX, this.moveY,0)) {
				f.resetOb(this);
			    x=this.moveX;
			    y=this.moveY;
			    f.sortObData(x,y);
			    f.sortObData(x-moveX,y-moveY);
			}
			else if(f.getObData(this.moveX, this.moveY, 0) instanceof JJangGu)
				return true;
			else if(!f.getObData(this.moveX, this.moveY, 0).collider) {
				f.resetOb(this);
				x=this.moveX;
				y=this.moveY;
				f.sortObData(x,y);
				f.sortObData(x-moveX,y-moveY);
			}
		return false;
	}
	
	//확률적으로 필드 이동방향 결정
	public boolean run(Field f) {
		enemiMove=rd.nextInt(4);
		switch(enemiMove) {
		case 0:
			return move(f,-1,0);
		case 1:
			return move(f,1,0);
		case 2:
			return move(f,0,-1);
		case 3:
			return move(f,0,1);
	    }
		return false;
	}
	public void printTurn() {System.out.println("\t\t\t" + name + "의 턴");}
	public char getOrder() {return order;}
}
