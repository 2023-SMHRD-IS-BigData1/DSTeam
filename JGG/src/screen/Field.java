package screen;

import javazoom.jl.player.MP3Player;
import object.Ob;
import object.Wall;

public class Field {
	private int w;
	private int h;
	protected Ob[][][] obData;//핵심, [가로][세로][3칸]으로 구성되며 Ob를 참조함
	
	//생성자, 가로, 세로를 입력받아 obData를 동적할당
	public Field(int w, int h){
		this.w=w;
		this.h=h;
		obData=new Ob[w][h][3];
		
	}
	
	//칸 안에 들어가는 Ob를 출력
	private void drawOb(int x, int y) {
		//[x][y][0]에 아무것도 없으면 "   " 출력
		if(obData[x][y][0]==null)
			System.out.print("   ");
		
		//출력할 이미지의 길이가 3인지 확인
		else if(obData[x][y][0].getImage().length()==3)
		    System.out.print(obData[x][y][0].getImage());
		
		//아니면 한 칸씩 이미지 출력
		else
			for(int i=0; i<3; i++)
				if(obData[x][y][i]==null)
				    System.out.print(" ");
			    else if(obData[x][y][i].isShow())
				    System.out.print(obData[x][y][i].getImage());
			    else
			    	System.out.print(" ");
	}
	
	//상단 출력
	private void drawTop() {
		System.out.print("\t\t\t" + "┌───");
		for(int i=0; i<(getW()-1); i++)
			System.out.print("┬───");
		System.out.println("┐");
	}
	
	//중간 출력, Ob도 같이 출력하기 위해 drawOb(int x, int y) 사용
	private void drawMid() {
		for(int y=0; y<(getH()-1); y++) {
			System.out.print("\t\t\t" + "│");
		    for(int x=0; x<getW(); x++) {
			    drawOb(x, y);
			    System.out.print("│");
		    }
		    System.out.println();
		    
		    System.out.print("\t\t\t" + "├───");
		    for(int j=0; j<(getW()-1); j++)
			    System.out.print("┼───");
		    System.out.println("┤");
		}
		
		System.out.print("\t\t\t" + "│");
	    for(int x=0; x<getW(); x++) {
		    drawOb(x, getH()-1);
		    System.out.print("│");
	    }
	    System.out.println();
	}
	
	//하단 출력
	private void drawBottom() {
		System.out.print("\t\t\t" + "└───");
		for(int i=0; i<(getW()-1); i++)
			System.out.print("┴───");
		System.out.println("┘");
	}
	
	//obData에 데이터를 넣음, 해당 데이터의 x,y을 이용해 obData[x][y][빈 공간]에 참조
	public void addObData(Ob ob){
		for(int i=0; i<3; i++)
			if(obData[ob.getX()][ob.getY()][i]==null) {
		        obData[ob.getX()][ob.getY()][i]=ob;
		        ob.setZ(i);
		        break;
			}
	}
	
	//함수 오버로드, 배열로 데이터를 받음
	public void addObData(Ob[] ob){
		int size=ob.length;
		for(int i=0; i<size && ob[i]!=null; i++) {
			for(int j=0; j<3; j++)
				if(obData[ob[i].getX()][ob[i].getY()][j]==null) {
			        obData[ob[i].getX()][ob[i].getY()][j]=ob[i];
			        ob[i].setZ(j);
			        break;
				}
		}
	}
	
	 public void addWallMaskObData(int[][]mask) {
	      Wall[] wall=new Wall[w*h];
	      for(int i=0, num=0; i<this.getW(); i++)
	         for(int j=0; j<this.getH(); j++, num++)
	             wall[num]=new Wall(i,j);
	             
	      for(int i=0, num=0; i<this.getW(); i++)
	         for(int j=0; j<this.getH(); j++, num++)
	            if(mask[j][i]==1)
	               addObData(wall[num]);
	   }
	
	
	
	//Ob의 좌표값이 변경되었을 경우 obData[바뀐 x][바뀐 y][?]로 알맞게 변경
	public void resetOb(Ob ob) {
		int i;
		for(i=0; i<3; i++)
			if(obData[ob.getMoveX()][ob.getMoveY()][i]==null) {
		        obData[ob.getMoveX()][ob.getMoveY()][i]=ob;
		        break;
			}
		clearObData(ob.getX(),ob.getY(),ob.getZ());
        ob.setZ(i);
	}
	
	//해당 x,y의 모든 Ob 삭제
	public void clearObData(int x, int y) {
		for(int i=0; i<3; i++)
		obData[x][y][i]=null;
	}
	
	//함수 오버로딩, 해당 x,y,z의 Ob 삭제
	public void clearObData(int x, int y, int z) {
		obData[x][y][z]=null;
	}
	
	//x,y,z 위치의 Ob 리턴
	public Ob getObData(int x, int y, int z) {
		return obData[x][y][z];
	}
	
	//z값을 알맞게 배치
	public void sortObData(int x, int y) {
		Ob[] buf= {null,null,null};
		int bufLen=0;
		for(int i=0; i<3; i++)
			if(!checkNullObData(x,y,i)) {
				buf[bufLen]=obData[x][y][i];
				bufLen++;
			}
		clearObData(x,y);
		addObData(buf);
	}
	
	//해당 위치에 몇 개의 Ob가 있는지 리턴
	public int checkObNum(int x, int y) {
		int num=0;
		
		for(int i=0; i<3; i++)
			if(obData[x][y][i]!=null)
				num++;
		
		return num;
	}
	
	//해당 위치가 null인지 검사
	public boolean checkNullObData(int x, int y, int z) {
		return obData[x][y][z]==null;
	}
	
	//Field 출력
	public void drawField() {
		drawTop();
		drawMid();
		drawBottom();
	}
	
	//줄바꿈을 이용하여 화면이 바뀌는 것처럼 보이게 함
	public void cls() {
		for(int i=0; i<80; i++)
			System.out.println();
	}
	public int getW() {return w;}
	public int getH() {return h;}
}
