package fr.diginamic.operations;

import java.util.ArrayList;
import java.util.List;

public class CalculMoyenne {

	public List<Double> tab = new ArrayList<Double>();

	// obsolete avec une liste

//	public CalculMoyenne(int taille) {
//		if (taille <= 0) {
//			System.out.println("Longueur incorrecte");
//		} else {
//			CalculMoyenne.tab = new double[taille];
//			this.cpt = 0;
//		}
//	}

	public void ajoutNombre(double nombre) {
		tab.add(nombre);
	}

	public double donnerMoyenne() {
		double resultat = 0;

		for (Double double1 : tab) {
			resultat += double1;
		}
		resultat = resultat / tab.size();
		return resultat;

	}

}
