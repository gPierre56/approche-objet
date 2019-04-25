package fr.diginamic.heritage.test;

import fr.diginamic.heritage.entity.Pigiste;
import fr.diginamic.heritage.entity.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Salarie s = new Salarie("Dubois", "Jean", 1300);
		Pigiste p = new Pigiste("Lafaille", "Olivier", 5, 50);

		System.out.println(s.getSalaire());
		System.out.println(p.getSalaire());

		System.out.println(s.afficherDonnees());
		System.out.println(p.afficherDonnees());

	}

}
