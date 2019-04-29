package fr.diginamic.tri;

public class Pays implements Comparable<Pays> {

	private String nom;
	private Double nbHabitants;
	private Double Pib;

	public Pays(String nom, Double nbHabitants, Double pib) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		Pib = pib;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Pib == null) ? 0 : Pib.hashCode());
		long temp;
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
		if (Pib == null) {
			if (other.Pib != null)
				return false;
		} else if (!Pib.equals(other.Pib))
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

	@Override
	public String toString() {
		return "Pays [nom=" + nom + ", nbHabitants=" + nbHabitants + ", Pib=" + Pib + "]";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Double getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(Double nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	public Double getPib() {
		return Pib;
	}

	public void setPib(Double pib) {
		Pib = pib;
	}

	// tri par nom de pays
//	@Override
//	public int compareTo(Pays o) {
//		Pays p = (Pays) o;
//		return nom.compareTo(p.nom);
//	}

	// tri par PIB/hab
	@Override
	public int compareTo(Pays o) {
		Pays p = (Pays) o;
		return Pib.compareTo(p.Pib);
	}

}
