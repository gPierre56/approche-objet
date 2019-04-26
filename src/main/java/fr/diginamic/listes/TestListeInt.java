package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> liste1 = new ArrayList<Integer>();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int indexMin = 0;

		liste1.add(-1);
		liste1.add(5);
		liste1.add(7);
		liste1.add(3);
		liste1.add(-2);
		liste1.add(4);
		liste1.add(8);
		liste1.add(5);

		// parcours de toute la liste
		for (Integer integer : liste1) {
			System.out.println(integer);
		}

		// recherche puis affichage du max
		for (int i = 0; i < liste1.size(); i++) {

			if (liste1.get(i) > max) {
				max = liste1.get(i);

			}
		}

		System.out.println("Le max est : " + max);

		// recherche puis suppression du minimum

		for (int i = 0; i < liste1.size(); i++) {

			if (liste1.get(i) < min) {
				min = liste1.get(i);
				indexMin = i;

			}
		}

		liste1.remove(indexMin);

		Iterator<Integer> iter = liste1.iterator();

		while (iter.hasNext()) {
			int index = 0;
			Integer integer = (Integer) iter.next();
			if (integer < 0) {
				liste1.set(index, integer * -1);
			}
			index++;

		}

		for (Integer integer : liste1) {
			System.out.println(integer);
		}

	}

}
