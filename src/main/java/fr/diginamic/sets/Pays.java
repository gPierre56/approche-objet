package fr.diginamic.sets;

public class Pays {

	private String nom;
	private double nbHabitants;
	private double Pib;

	public Pays(String nom, double nbHabitants, float pib) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		Pib = pib;
	}

	@Override
	public String toString() {
		return "Pays [nom=" + nom + ", nbHabitants=" + nbHabitants + ", Pib=" + Pib + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(Pib);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(nbHabitants);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
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
		Pays other = (Pays) obj;
		if (Double.doubleToLongBits(Pib) != Double.doubleToLongBits(other.Pib))
			return false;
		if (Double.doubleToLongBits(nbHabitants) != Double.doubleToLongBits(other.nbHabitants))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(double nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	public double getPib() {
		return Pib;
	}

	public void setPib(double pib) {
		Pib = pib;
	}

}
