package object;

public class Shop extends Ob {
	public Shop() {
		setImage(" ♥ ");
		collider = true;
	}

	public Shop(int x, int y) {
		setImage(" ♥ ");
		collider = true;
		this.x = x;
		this.y = y;
	}

}
