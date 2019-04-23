package essai;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personne p1 = new Personne();
		Personne p2 = new Personne();

		p1.setNom("Pierre");
		p1.setPrenom("Guillaume");
		p1.setAdresse(new AdressePostale(14, "Impasse Edith Piaf", 56930, "Pluméliau"));

		p2.setNom("Bellamy");
		p2.setPrenom("Richard");
		p2.setAdresse(new AdressePostale(55, "rue de Java", 44000, "Nantes"));
//		p2.adresse.CP = 44000;
//		p2.adresse.libelleRue = "rue de Java";
//		p2.adresse.numeroRue = 55;
//		p2.adresse.ville = "Nantes";

		System.out.println(p1);
		System.out.println(p2);

	}

}
