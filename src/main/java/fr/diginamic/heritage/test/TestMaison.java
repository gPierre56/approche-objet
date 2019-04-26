package fr.diginamic.heritage.test;

import fr.diginamic.heritage.entity.Chambre;
import fr.diginamic.heritage.entity.Cuisine;
import fr.diginamic.heritage.entity.Maison;
import fr.diginamic.heritage.entity.Piece;
import fr.diginamic.heritage.entity.SalleDeBain;
import fr.diginamic.heritage.entity.Salon;
import fr.diginamic.tp6.AffichageSurface;

public class TestMaison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AffichageSurface aff = new AffichageSurface();

		SalleDeBain sdb = new SalleDeBain(50, 2);
		Salon salon = new Salon(25, 0);
		Cuisine cuisine = new Cuisine(30, 0);
		Chambre chambre = new Chambre(15, 1);
		Chambre chambre2 = new Chambre(1, 1);

		Maison maison = new Maison(new Piece[0]);

		maison.ajouterPiece(chambre);
		maison.ajouterPiece(chambre2);
		maison.ajouterPiece(sdb);
		maison.ajouterPiece(cuisine);
		maison.ajouterPiece(salon);

		maison.calculerSurface();
		System.out.println(maison);
		maison.donnerSuperficieType(chambre);
		maison.donnerNbPieces(chambre);
		System.out.println(aff.afficher(maison).calculerSurface());

	}

}
