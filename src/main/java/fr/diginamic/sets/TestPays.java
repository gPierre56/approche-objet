package fr.diginamic.sets;

import java.util.HashSet;

public class TestPays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Pays> set = new HashSet<Pays>();
		double max = 0;
		double min = Double.MAX_VALUE;
		String tmp = "";
		Object Otmp = null;

		set.add(new Pays("USA", 327167434, 55805));
		set.add(new Pays("France", 67795000, 38476));
		set.add(new Pays("Allemagne", 82979100, 47589));
		set.add(new Pays("UK", 65105246, 43770));
		set.add(new Pays("Italie", 60483973, 29866));
		set.add(new Pays("Japon", 126330302, 39058));
		set.add(new Pays("Chine", 1417913092, 7989));
		set.add(new Pays("Russie", 146780700, 11099));
		set.add(new Pays("Inde", 1296834042, 1626));

		for (Pays pays : set) {
			if (pays.getPib() > max) {
				max = pays.getPib();
				tmp = pays.getNom();
			}
		}

		System.out.println("Le pays avec le PIB par habitant le plus important est le/la/les : " + tmp);
		max = 0;

		for (Pays pays : set) {
			if ((pays.getPib() * pays.getNbHabitants()) > max) {
				max = pays.getPib() * pays.getNbHabitants();
				tmp = pays.getNom();
			}
		}

		System.out.println("Le pays avec le PIB le plus important est le/la/les : " + tmp);

		// suppression du pays avec le plus petit PIB

		for (Pays pays : set) {
			if ((pays.getPib() * pays.getNbHabitants()) < min) {
				max = pays.getPib() * pays.getNbHabitants();
				Otmp = pays;
				tmp = pays.getNom();
			}
		}

		for (Pays pays : set) {
			if (pays.getNom() == tmp) {
				pays.setNom(tmp.toUpperCase());
			}
		}

		System.out.println(set);

		set.remove(Otmp);

	}

}
