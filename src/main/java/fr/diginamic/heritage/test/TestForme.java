package fr.diginamic.heritage.test;

import fr.diginamic.heritage.entity.Carre;
import fr.diginamic.heritage.entity.Cercle;
import fr.diginamic.heritage.entity.Rectangle;
import fr.diginamic.heritage.util.AffichageForme;
import fr.diginamic.tp6.AffichageSurface;

public class TestForme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AffichageForme a = new AffichageForme();
		AffichageSurface aff = new AffichageSurface();

		Cercle cercle = new Cercle(5);
		Rectangle rectangle = new Rectangle(10, 6);
		Carre carre = new Carre(5);

		a.afficher(cercle);
		a.afficher(rectangle);
		a.afficher(carre);
		System.out.println(aff.afficher(cercle).calculerSurface());
	}

}
