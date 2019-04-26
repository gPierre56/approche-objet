package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> liste1 = new ArrayList<String>();
		int max = 0;
		String plusLongueVille = "";

		liste1.add("Nice");
		liste1.add("Carcassone");
		liste1.add("Narbonne");
		liste1.add("Lyon");
		liste1.add("Foix");
		liste1.add("Pau");
		liste1.add("Marseille");
		liste1.add("Tarbes");

		// recherche et affichage de la ville qui a le nom le plus long
		for (int i = 0; i < liste1.size(); i++) {
			if (liste1.get(i).length() > max) {
				max = liste1.get(i).length();
				plusLongueVille = liste1.get(i);
			}
		}

		System.out.println("La ville la plus longue est :" + plusLongueVille);

		// toutes les villes en majuscule
		for (int i = 0; i < liste1.size(); i++) {
			liste1.set(i, liste1.get(i).toUpperCase());
		}

		System.out.println(liste1);

		Iterator<String> iter = liste1.iterator();

		while (iter.hasNext()) {
			String string = iter.next();
			if (string.substring(0, 0).equalsIgnoreCase("n")) {
				iter.remove();
			}

		}

		System.out.println(liste1);

	}

}
