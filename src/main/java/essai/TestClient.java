package essai;

import entites.AdressePostale;
import entites.Client;

public class TestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Client c1 = new Client(1, "Pierre", "Guillaume");
		Client c2 = new Client(2, "Dupont", "Jean");

		Client c3 = new Client(56, "Random", "John", new AdressePostale(456, "rue au pif", 45879, "Random city"));

		System.out.println(c3);
	}

}
