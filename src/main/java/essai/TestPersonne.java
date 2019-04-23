package essai;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personne p1 = new Personne();
		Personne p2 = new Personne();
		
		p1.nom = "Pierre";
		p1.prenom = "Guillaume";
//		p1.adresse = new AdressePostale();
		p1.adresse.CP = 56930;
		p1.adresse.libelleRue = "Impasse Edith Piaf";
		p1.adresse.numeroRue = 14;
		p1.adresse.ville = "Pluméliau";

		
		p2.nom = "Bonnamy";
		p2.prenom = "Richard";
//		p2.adresse = new AdressePostale();
		p2.adresse.CP = 44000;
		p2.adresse.libelleRue = "rue de Java";
		p2.adresse.numeroRue = 55;
		p2.adresse.ville = "Nantes";
		
		System.out.println(p1);
		System.out.println(p2);

	}

}
