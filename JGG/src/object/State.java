package object;

import java.util.Random;

public abstract class State extends Ob {
	protected Random rd = new Random();
	protected String name;
	protected int hp;
	protected int sp;
	protected int maxHp;
	protected int maxAtk;
	protected int minAtk;
	protected boolean checkDefence = false;

	public void checkHp() {
		if (hp > maxHp)
			hp = maxHp;
		if (hp <= 0) {
			hp = 0;
			setShow(false);
		}
	}

	public void attack(State ob) {
		int damage = minAtk + rd.nextInt(maxAtk - minAtk + 1);
		ob.hp -= damage;
		ob.checkHp();
		System.out.println(  name + "이(가) " + damage + "의 피해를 입혔다.");
	}
	
	public void Doubleattack(State ob) {
		int damage =  minAtk + rd.nextInt(maxAtk - minAtk + 1)+3;
		ob.hp -= damage;
		ob.checkHp();
		System.out.println(  name + "이(가) "+" ᕙ( ︡’︡ 益 ’︠)ง▬▬█ " + damage + "의 피해를 입혔다.");
	}

	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public int getMaxHp() {
		return maxHp;
	}

	public int getMinAtk() {
		return minAtk;
	}

	public int getMaxAtk() {
		return maxAtk;
	}

	public boolean isCheckDefence() {
		return checkDefence;
	}

	public void setCheckDefence(boolean checkDefence) {
		this.checkDefence = checkDefence;
	}
}
