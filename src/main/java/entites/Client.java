package entites;

public class Client {

	int numeroCompte;
	String nom;
	String prenom;
	AdressePostale adresse;

	public Client(int numeroCompte, String nom, String prenom) {

		this.numeroCompte = numeroCompte;
		this.nom = nom;
		this.prenom = prenom;

	}

	public Client(int numeroCompte, String nom, String prenom, AdressePostale adresse) {
		this.numeroCompte = numeroCompte;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;

	}

	@Override
	public String toString() {
		return "Client [numeroCompte=" + numeroCompte + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse
				+ "]";
	}

}
