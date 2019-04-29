package fr.diginamic.heritage.entity;

import java.util.ArrayList;
import java.util.List;

import fr.diginamic.tp6.ISurface;

public class Maison implements ISurface {

	private List<Piece> pieces = new ArrayList<Piece>();

	// Fonction qui ajoute des objets de type piece tout en gérant la capacité du
	// tableau
	public void ajouterPiece(Piece piece) {

		pieces.add(piece);

	}

	// addition des superficies du tableau de pieces de chaque maison pour donner la
	// superficie totale des pièces
	public double calculerSurface() {
		double superficie = 0;
		for (int i = 0; i < pieces.size(); i++) {
			superficie = pieces.get(i).superficie + superficie;
		}
		return superficie;
	}

	// superficie globale pour un type de piece donné
	public void donnerSuperficieType(Piece typePiece) {
		List<Piece> j = new ArrayList<Piece>();
		for (int i = 0; i < pieces.size(); i++) {

			if (pieces.get(i).getClass().isInstance(typePiece)) {

				j.add(pieces.get(i));
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
		for (int i = 0; i < pieces.size(); i++) {
			if (typePiece.getType() == pieces.get(i).getType()) {
				resultat += 1;
			}
		}

		System.out
				.println("Il y a actuellement " + resultat + " pièces de type " + typePiece.getClass().getSimpleName());
	}

	public Maison(List<Piece> pieces) {
		super();
		this.pieces = pieces;

	}

	@Override
	public String toString() {
		return "Maison [pieces=" + pieces + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pieces == null) ? 0 : pieces.hashCode());
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
		if (pieces == null) {
			if (other.pieces != null)
				return false;
		} else if (!pieces.equals(other.pieces))
			return false;
		return true;
	}

	public List<Piece> getPieces() {
		return pieces;
	}

	public void setPieces(List<Piece> pieces) {
		this.pieces = pieces;
	}

}
