package fr.diginamic.heritage.entity;

public class Creature extends Unite {

	@Override
	public String toString() {
		return "Résumé de la créature : \n \nHP : " + this.hp + "\nForce : " + this.force;
	}

}
