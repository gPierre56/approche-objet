package fr.diginamic.heritage.entity;

public class Gobelin extends Creature {

	public Gobelin() {
		this.force = (int) (7 + Math.random() * (12 - 7));
		this.hp = (int) (10 + Math.random() * (15 - 10));
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
