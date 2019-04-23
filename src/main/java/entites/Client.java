package entites;

public class Client {

	private static int cpt = 1;
	private int id;
	private int numeroCompte;
	private String nom;
	private String prenom;
	private AdressePostale adresse;

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

	public void clientToUC() {
		System.out.println(this.prenom.toUpperCase() + " " + this.nom.toUpperCase());
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public String getNom() {
		return this.nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public int getNumeroCompte() {
		return this.numeroCompte;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", numeroCompte=" + numeroCompte + ", nom=" + nom + ", prenom=" + prenom
				+ ", adresse=" + adresse + "]";
	}

}
