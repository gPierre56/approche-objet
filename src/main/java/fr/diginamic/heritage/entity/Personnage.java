package fr.diginamic.heritage.entity;

import java.lang.reflect.Constructor;

public class Personnage extends Unite {

	private int score;

	public Personnage() {

		this.score = 0;
		this.force = (int) (12 + Math.random() * (18 - 12));
		this.hp = (int) (20 + Math.random() * (50 - 20));
	}

	public int getHp() {
		return this.hp;
	}

	// Boucle de combat
	public void combattre(String adversaire) {

		System.out.println("Vos stats : \n" + this.toString());

		Creature creature = null;
		int tour = 1;

		try {

			Class<?> structureClasse = Class.forName("fr.diginamic.heritage.entity." + adversaire);

			Constructor constructor = structureClasse.getConstructor();

			creature = (Creature) constructor.newInstance();

			System.out.println("Voici votre adversaire : \n");
			System.out.println(creature.getClass().getSimpleName());
			System.out.println(creature);

		} catch (Exception e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}
		// continuer tant que l'un des deux est en vie
		while (this.hp > 0 && creature.hp > 0) {

			System.out.println("Tour " + tour);
			// calcul force joueur
			int attaqueJoueur = this.force + (int) (1 + Math.random() * (10 - 1));
			// calcul force adversaire
			int attaqueAdversaire = creature.force + (int) (1 + Math.random()) * (10 - 1);
			System.out.println(attaqueJoueur);
			System.out.println(attaqueAdversaire);

			// si joueur > adversaire
			if (attaqueJoueur > attaqueAdversaire) {
				creature.hp -= attaqueJoueur - attaqueAdversaire;
				System.out.println("Vous avez l'avantage, vous infligez " + (attaqueJoueur - attaqueAdversaire)
						+ (" points de dégats à l'adversaire, il lui reste " + creature.hp + " points de vie."));

				// si adversaire > joueur
			} else if (attaqueAdversaire > attaqueJoueur) {
				this.hp -= attaqueAdversaire - attaqueJoueur;
				System.out.println("L'adversaire a l'avantage, il vous inflige " + (attaqueAdversaire - attaqueJoueur)
						+ " points de dégats, il vous reste " + this.hp + " points de vie.");

			}
			tour++;
		}

		if (this.hp <= 0) {
			System.out.println("Votre personnage s'est pris une grosse branlée, son score est de : " + this.score
					+ ", pas très fameux.");
		}

		else {
			if (adversaire == "Loup") {
				this.score++;
			} else if (adversaire == "Gobelin") {
				this.score += 2;
			}

			else if (adversaire == "Troll") {
				this.score += 5;
			}
			System.out.println("Sacré combat, votre score est désormais de : " + this.score);
		}
	}

	public void afficherScore() {
		System.out.println("Votre score est de : " + this.score);
	}

	@Override
	public String toString() {
		return "Résumé du personnage : \n \nHP : " + this.hp + "\nForce : " + this.force + "\nScore : " + this.score;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + score;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personnage other = (Personnage) obj;
		if (score != other.score)
			return false;
		return true;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getScore() {
		return score;
	}

}
