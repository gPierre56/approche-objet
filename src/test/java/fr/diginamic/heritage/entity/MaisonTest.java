package fr.diginamic.heritage.entity;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class MaisonTest {

	List<Piece> listePieces = new ArrayList<Piece>();
	Maison maison = new Maison(listePieces);
	Piece sdb2 = new SalleDeBain(25, 0);
	Piece c3 = new Chambre(50, 0);
	Piece c2 = new Chambre(150, 1);

	@Test(expected = MaisonException.class)
	public void testAjouterPiece() throws MaisonException {
		List<Piece> listePieces2 = new ArrayList<Piece>();
		Piece c1 = new Chambre(150, 1);

		maison.ajouterPiece(c1);

		listePieces2.add(c1);
		Assert.assertEquals(listePieces, listePieces2);
		c1 = null;

		maison.ajouterPiece(c1);

	}

	@Test
	public void testCalculerSurface() throws MaisonException {
		maison.ajouterPiece(sdb2);
		maison.ajouterPiece(c2);

		Assert.assertEquals(175, maison.calculerSurface(), 0);

	}

}
