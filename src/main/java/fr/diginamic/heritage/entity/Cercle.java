package fr.diginamic.heritage.entity;

public class Cercle extends Forme {

	private double rayon;

	@Override
	public double calculerSurface() {
		double surface = Math.PI * Math.pow(this.rayon, 2);
		return surface;
	}

	@Override
	public double calculerPerimetre() {
		double perimetre = 2 * Math.PI * this.rayon;
		return perimetre;
	}

	@Override
	public String toString() {
		return "Cercle [rayon=" + rayon + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(rayon);
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
		Cercle other = (Cercle) obj;
		if (Double.doubleToLongBits(rayon) != Double.doubleToLongBits(other.rayon))
			return false;
		return true;
	}

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

}
