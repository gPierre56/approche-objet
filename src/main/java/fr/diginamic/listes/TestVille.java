package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestVille {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Ville> listeVille = new ArrayList<Ville>();
		String villeLaPlusPeuplee = "";
		int tmp = 0;
		int index = 0;

		listeVille.add(new Ville("Nice", 343000));
		listeVille.add(new Ville("Carcassonne", 47800));
		listeVille.add(new Ville("Narbonne", 53400));
		listeVille.add(new Ville("Lyon", 484000));
		listeVille.add(new Ville("Foix", 9700));
		listeVille.add(new Ville("Pau", 77200));
		listeVille.add(new Ville("Marseille", 850700));
		listeVille.add(new Ville("Tarbes", 40600));

		// recherche de la ville la plus peuplée

		for (Ville ville : listeVille) {

			if (ville.getNbHabitant() > tmp) {
				tmp = ville.getNbHabitant();
				villeLaPlusPeuplee = ville.getNom();
			}
		}

		System.out.println("La ville la plus peuplé de la liste est : " + villeLaPlusPeuplee);

		// suppresion de la ville la moins peuplé

		tmp = Integer.MAX_VALUE;

		for (int i = 0; i < listeVille.size(); i++) {
			if (listeVille.get(i).getNbHabitant() < tmp) {
				tmp = listeVille.get(i).getNbHabitant();
				index = i;
			}
		}

		System.out.println("Suppresion de la ville : " + listeVille.get(index));
		listeVille.remove(index);
		System.out.println(listeVille);

		// mise en majuscules des ville de plus de 100k habitants

		Iterator<Ville> iter = listeVille.iterator();

		while (iter.hasNext()) {
			Ville ville = (Ville) iter.next();
			if (ville.getNbHabitant() >= 100000) {
				ville.setNom(ville.getNom().toUpperCase());
			}

		}

		System.out.println(listeVille);

	}

}
