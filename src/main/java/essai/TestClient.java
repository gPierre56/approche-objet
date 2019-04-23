package essai;

import entites.AdressePostale;
import entites.Client;

public class TestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Client c1 = new Client(1, "Pierre", "Guillaume");
		Client c2 = new Client(2, "Dupont", "Jean");

		Client c3 = new Client(56, "Random", "John", new AdressePostale(456, "rue au pif", 45879, "Random city"));

		System.out.println(c1);
		System.out.println(c2);

		System.out.println(c3);

		// affichage du nom et prénom en majuscule

		c1.clientToUC();

		// modif du nom

		c1.setNom("Bellamy");
		System.out.println(c1);

		// modif du prénom

		c1.setPrenom("Laurence");
		System.out.println(c1);

		// modif num compte

		c1.setNumeroCompte(56);
		System.out.println(c1);

		// getter nom

		System.out.println(c1.getNom());

		// getter prénom

		System.out.println(c1.getPrenom());

		// getter numCompte

		System.out.println(c1.getNumeroCompte());

	}

}
