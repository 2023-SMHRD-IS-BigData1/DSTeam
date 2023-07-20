package object;

	public abstract class Ob {
		protected int x;
		protected int y;
		protected int z=0;
		protected int moveX;
		protected int moveY;
		protected String image="   ";
		protected boolean show=true;
		protected boolean collider=false;
		public Ob(){}
		public Ob(int x, int y){
			this.x=x;
			this.y=y;
		}
		public void setXY(int x, int y) {
			this.x=x;
			this.y=y;
		}
		public int getX() {return x;}
		public int getY() {return y;}
		public int getZ() {return z;}
		public int getMoveX() {return moveX;}
		public int getMoveY() {return moveY;}
		public void setZ(int z) {this.z=z;}
		public String getImage() {return image;}
		public void setImage(String image) {this.image=image;}
		public boolean isShow() {return show;}
		public void setShow(boolean show) {this.show = show;}
	}

