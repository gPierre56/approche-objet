package fr.diginamic.heritage.entity;

/**
 * @author Guillaume
 *
 */
public class Rectangle extends Forme {

	private double longueur;
	private double largeur;

	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	/** Calcul de l'aire du rectangle */
	@Override
	public double calculerSurface() {
		double surface = this.largeur * this.longueur;
		return surface;
	}

	/** calcul du perimetre du rectangle */
	@Override
	public double calculerPerimetre() {
		double perimetre = 2 * longueur + 2 * largeur;
		return perimetre;
	}

	@Override
	public String toString() {
		return "Rectangle [longueur=" + longueur + ", largeur=" + largeur + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(largeur);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(longueur);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Rectangle other = (Rectangle) obj;
		if (Double.doubleToLongBits(largeur) != Double.doubleToLongBits(other.largeur))
			return false;
		if (Double.doubleToLongBits(longueur) != Double.doubleToLongBits(other.longueur))
			return false;
		return true;
	}

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

}
