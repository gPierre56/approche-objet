package entites;

public class Cercle {

	public double rayon;

	public Cercle(double rayon) {

		this.rayon = rayon;
	}

	public double getPerimetre() {
		return 2 * Math.PI * this.rayon;
	}

	public double getSurface() {
		return Math.PI * Math.pow(this.rayon, 2);
	}

}
