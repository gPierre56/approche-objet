package fr.diginamic.utils;

public class TriTableau {

	public static void trierTableau(int[] tab) {

		boolean tab_ok = false;
		while (!tab_ok) {
			tab_ok = true;

			for (int i = 0; i < tab.length - 1; i++) {
				if (tab[i] > tab[i + 1]) {
					tab[i] = tab[i] + tab[i + 1];
					tab[i + 1] = tab[i] - tab[i + 1];
					tab[i] = tab[i] - tab[i + 1];
					tab_ok = false;

				}

			}
		}

	}

}
