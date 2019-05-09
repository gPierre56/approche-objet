package fr.diginamic.heritage.test;

import java.util.ArrayList;

import fr.diginamic.heritage.entity.Chambre;
import fr.diginamic.heritage.entity.Cuisine;
import fr.diginamic.heritage.entity.Maison;
import fr.diginamic.heritage.entity.MaisonException;
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

		Maison maison = new Maison(new ArrayList<Piece>());

		try {
			maison.ajouterPiece(chambre);
			maison.ajouterPiece(chambre2);
			maison.ajouterPiece(sdb);
			maison.ajouterPiece(cuisine);
			maison.ajouterPiece(salon);
		} catch (MaisonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		maison.calculerSurface();
		System.out.println(maison);
		maison.donnerSuperficieType(chambre);
		maison.donnerNbPieces(chambre);
		System.out.println(aff.afficher(maison).calculerSurface());

	}

}
