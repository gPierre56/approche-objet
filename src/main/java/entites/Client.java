package entites;

public class Client {

	int numeroCompte;
	String nom;
	String prenom;
	AdressePostale adresse;

	public Client(int param1, String param2, String param3) {
		System.out.println(param1);
		numeroCompte = param1;
		nom = param2;
		prenom = param3;
		System.out.println(numeroCompte + " " + nom + " " + prenom);

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
