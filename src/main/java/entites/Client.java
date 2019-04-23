package entites;

public class Client {

	static int cpt = 1;
	int id;
	int numeroCompte;
	String nom;
	String prenom;
	AdressePostale adresse;

	public Client(int numeroCompte, String nom, String prenom) {

		this.numeroCompte = numeroCompte;
		this.nom = nom;
		this.prenom = prenom;
		id = cpt++;

	}

	public Client(int numeroCompte, String nom, String prenom, AdressePostale adresse) {
		this(numeroCompte, nom, prenom);
		this.adresse = adresse;

	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", numeroCompte=" + numeroCompte + ", nom=" + nom + ", prenom=" + prenom
				+ ", adresse=" + adresse + "]";
	}

}
