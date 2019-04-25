package fr.diginamic.heritage.util;

import fr.diginamic.heritage.entity.Forme;

public class AffichageForme {

	public void afficher(Forme f) {

		System.out.println(f.calculerSurface());
		System.out.println(f.calculerPerimetre());
	}

}
