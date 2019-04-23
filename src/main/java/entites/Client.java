package entites;

public class Client {
	
	int numeroCompte;
	String nom;
	String prenom;
	
	public Client(int param1, String param2, String param3) {
		System.out.println(param1);
		numeroCompte = param1;
		nom = param2;
		prenom = param3;
		System.out.println(numeroCompte + " " +  nom + " " + prenom);
		
	}

}
