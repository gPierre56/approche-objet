package fr.diginamic.operations;

public class CalculMoyenne {

	public static double[] tab;
	public int cpt = 0;

	public CalculMoyenne(int taille) {
		if (taille <= 0) {
			System.out.println("Longueur incorrecte");
		} else {
			CalculMoyenne.tab = new double[taille];
			this.cpt = 0;
		}
	}

	public void ajoutNombre(double nombre) {
		if (cpt == tab.length) {
			System.out.println("Impossible, tableau plein");
		} else {
			tab[this.cpt] = nombre;
			this.cpt++;
		}
	}

	public double donnerMoyenne() {
		double resultat = 0;
		if (this.cpt == 0) {
			return resultat;
		} else {
			for (int i = 0; i < tab.length; i++) {
				resultat = resultat + tab[i];
			}
			resultat = resultat / this.cpt;
			return resultat;
		}

	}

}
