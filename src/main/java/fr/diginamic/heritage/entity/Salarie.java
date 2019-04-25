package fr.diginamic.heritage.entity;

public class Salarie extends Intervenant {

	private int salaireMois;

	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return this.salaireMois;
	}

	@Override
	public String afficherDonnees() {
		String donnees = "Nom :" + nom + "\nPrénom : " + prenom + "\nSalaire : " + salaireMois + "\nStatut : Salarié";
		return donnees;
	}

	public Salarie(String nom, String prenom, int salaire) {
		this.nom = nom;
		this.prenom = prenom;
		this.salaireMois = salaire;
	}

	@Override
	public String toString() {
		return "Salarie [salaire=" + salaireMois + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + salaireMois;
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
		Salarie other = (Salarie) obj;
		if (salaireMois != other.salaireMois)
			return false;
		return true;
	}

	public void setSalaire(int salaire) {
		this.salaireMois = salaire;
	}

}
