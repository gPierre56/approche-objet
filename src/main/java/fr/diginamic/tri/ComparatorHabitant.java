package fr.diginamic.tri;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Pays> {

	@Override
	public int compare(Pays p1, Pays p2) {

		int resultat = p1.getNbHabitants().compareTo(p2.getNbHabitants());
		return resultat;

	}

}
