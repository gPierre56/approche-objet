package fr.diginamic.heritage.entity;

public class Pigiste extends Intervenant {

	private int nbJoursTravaillés;
	private double salaireJour;

	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return this.nbJoursTravaillés * this.salaireJour;
	}

	@Override
	public String afficherDonnees() {
		String donnees = "Nom :" + nom + "\nPrénom : " + prenom + "\nSalaire : " + getSalaire() + "\nStatut : Salarié";
		return donnees;
	}

	public Pigiste(String nom, String prenom, int nbJoursTravaillés, double salaireJour) {
		this.nom = nom;
		this.prenom = prenom;
		this.nbJoursTravaillés = nbJoursTravaillés;
		this.salaireJour = salaireJour;
	}

	@Override
	public String toString() {
		return "Pigiste [nbJoursTravaillés=" + nbJoursTravaillés + ", salaireJour=" + salaireJour + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + nbJoursTravaillés;
		long temp;
		temp = Double.doubleToLongBits(salaireJour);
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
		Pigiste other = (Pigiste) obj;
		if (nbJoursTravaillés != other.nbJoursTravaillés)
			return false;
		if (Double.doubleToLongBits(salaireJour) != Double.doubleToLongBits(other.salaireJour))
			return false;
		return true;
	}

	public int getNbJoursTravaillés() {
		return nbJoursTravaillés;
	}

	public void setNbJoursTravaillés(int nbJoursTravaillés) {
		this.nbJoursTravaillés = nbJoursTravaillés;
	}

	public double getSalaireJour() {
		return salaireJour;
	}

	public void setSalaireJour(double salaireJour) {
		this.salaireJour = salaireJour;
	}

}
