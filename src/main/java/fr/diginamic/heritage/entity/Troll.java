package fr.diginamic.heritage.entity;

public class Troll extends Creature {

	public Troll() {
		this.force = (int) (12 + Math.random() * (20 - 12));
		this.hp = (int) (20 + Math.random() * (30 - 20));
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
