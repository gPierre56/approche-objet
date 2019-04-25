package fr.diginamic.heritage.entity;

public class Loup extends Creature {

	public Loup() {
		this.force = (int) (5 + Math.random() * (10 - 5));
		this.hp = (int) (5 + Math.random() * (10 - 5));
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
