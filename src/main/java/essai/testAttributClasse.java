package essai;

import entites.AdressePostale;

public class testAttributClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdressePostale a = new AdressePostale(25, "rue exemple", 54841, "ville exemple");
		AdressePostale b = new AdressePostale(47, "rue demo", 12478, "ville demo");

		AdressePostale.setNbDepartement(103);

		System.out.println(a.getNbDepartement());
		System.out.println(b.getNbDepartement());
		System.out.println(AdressePostale.getNbDepartement());

	}

}
