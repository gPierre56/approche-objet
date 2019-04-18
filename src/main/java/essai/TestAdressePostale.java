package essai;

import entites.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AdressePostale a1 = new AdressePostale();
		a1.libelleRue = "rue des champignons";
		a1.CP = 56225;
		a1.numeroRue = 45;
		a1.ville = "Sainte champignonnière";
		
		AdressePostale a2 = new AdressePostale();
		a2.ville = "st jean sur caillou";
		a2.CP = 44521;
		a2.numeroRue = 78;
		a2.libelleRue = "rue du bar";
		
		System.out.println(a1);
		System.out.println(a2);
		
		
	}

}
