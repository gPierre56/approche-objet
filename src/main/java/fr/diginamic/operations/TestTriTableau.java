package fr.diginamic.operations;

import fr.diginamic.utils.TriTableau;

public class TestTriTableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] tab = { 3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8 };

		TriTableau.trierTableau(tab);
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}

	}

}
