package fr.diginamic.heritage.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import fr.diginamic.tp6.ISurface;

public class Maison implements ISurface {

	private Piece[] pieces;
	private int cpt;

	// Fonction qui ajoute des objets de type piece tout en gérant la capacité du
	// tableau
	public void ajouterPiece(Piece piece) {
		// incrémentation du nb de pieces de la maison
		this.cpt++;
		// augmentation de la taille du tableau de piece de 1 a chaque ajout
		if (cpt > this.pieces.length) {
			Piece[] tmp = new Piece[cpt];
			if (pieces.length > 0) {

				for (int i = 0; i < pieces.length; i++) {
					tmp[i] = pieces[i];
				}
			}
			tmp[cpt - 1] = piece;
			pieces = tmp;
		}

		else {
			pieces[cpt - 1] = piece;
		}

	}

	// addition des superficies du tableau de pieces de chaque maison pour donner la
	// superficie totale des pièces
	public double calculerSurface() {
		double superficie = 0;
		for (int i = 0; i < pieces.length; i++) {
			superficie = pieces[i].superficie + superficie;
		}
		return superficie;
	}

	// superficie globale pour un type de piece donné
	public void donnerSuperficieType(Piece typePiece) {
		List<Piece> j = new ArrayList<Piece>();
		for (int i = 0; i < pieces.length; i++) {

			if (pieces[i].getClass().isInstance(typePiece)) {

				j.add(pieces[i]);
			}
		}
		double resultat = 0;
		for (int i = 0; i < j.size(); i++) {
			resultat = resultat + j.get(i).superficie;

		}

		System.out.println("Superficie totale pour le type " + typePiece.getClass().getSimpleName() + " : " + resultat);

	}

	// Méthode qui retourne le nombre de pièces d'un type donné
	public void donnerNbPieces(Piece typePiece) {
		int resultat = 0;
		for (int i = 0; i < pieces.length; i++) {
			if (typePiece.getType() == pieces[i].getType()) {
				resultat += 1;
			}
		}

		System.out
				.println("Il y a actuellement " + resultat + " pièces de type " + typePiece.getClass().getSimpleName());
	}

	public Maison(Piece[] pieces) {
		super();
		this.pieces = pieces;
		this.cpt = 0;
	}

	@Override
	public String toString() {
		return "Maison [pieces=" + Arrays.toString(pieces) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(pieces);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Maison other = (Maison) obj;
		if (!Arrays.equals(pieces, other.pieces))
			return false;
		return true;
	}

	public Piece[] getPieces() {
		return pieces;
	}

	public void setPieces(Piece[] pieces) {
		this.pieces = pieces;
	}

}
