package essai;

import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personne p1 = new Personne();
		Personne p2 = new Personne();
		
		p1.nom = "Pierre";
		p1.prenom = "Guillaume";
		p1.adresse = "14 impasse Edith Piaf";
		
		p2.nom = "Bonnamy";
		p2.prenom = "Richard";
		p2.adresse = "rue inconnue";
		
		System.out.println(p1);
		System.out.println(p2);

	}

}
