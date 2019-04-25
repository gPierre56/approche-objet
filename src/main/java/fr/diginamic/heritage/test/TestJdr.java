package fr.diginamic.heritage.test;

import java.util.Scanner;

import fr.diginamic.heritage.entity.Personnage;

public class TestJdr {

	public static void main(String[] args) {

		Personnage p1 = null;

		System.out.println("***** Come and play *****");

		Scanner sc = new Scanner(System.in);

		int choix = 666;

		while (choix != 0) {
			System.out.println("Choisissez une action : ");

			// si aucun personnage n'a été instancié, les deux choix possibles sont d'en
			// créer un ou d'arreter le jeu
			if (p1 == null) {

				System.out.println("1 - créer un personnage.");
				System.out.println("0 - Sortir");
				choix = sc.nextInt();

				if (choix == 1) {
					p1 = new Personnage();
					System.out.println("Voici votre personnage : \n" + p1.toString());
				}
			}
			// si personnage existant
			if (p1 != null && choix != 0) {
				System.out.println("1 - Combattre");
				System.out.println("2 - Afficher score");
				System.out.println("0 - Sortir");
				choix = sc.nextInt();
				// option de combat
				if (choix == 1 && p1.getHp() <= 0) {
					System.out.println("Action impossible");
				}
				if (choix == 1 && p1.getHp() > 0) {
					System.out.println("Choisissez votre adversaire : ");
					System.out.println("1 - Un loup, pour les mauviettes.");
					System.out.println("2 - Un gobelin, pour les chochottes");
					System.out.println("3 - Un troll, pour les bonhommes");
					System.out.println("0 - S'enfuir comme un lâche");
					choix = sc.nextInt();

					// passage du parametre de créature en fonction du choix de l'utilisateur
					if (choix == 1) {
						p1.combattre("Loup");
					} else if (choix == 2) {
						p1.combattre("Gobelin");
					} else if (choix == 3) {
						p1.combattre("Troll");
					}
					// affichage du score
				} else if (choix == 2) {
					p1.afficherScore();
				}
			}
		}

	}

}
