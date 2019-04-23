package essai;

import entites.Cercle;
import fr.diginamic.utils.CercleFactory;
import fr.diginamic.utils.CercleService;

public class TestCercle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CercleService cercleService = new CercleService();

		Cercle c1 = new Cercle(5);
		Cercle c2 = new Cercle(10);

		System.out.println(c1.getPerimetre());
		System.out.println(c1.getSurface());

		System.out.println(c2.getPerimetre());
		System.out.println(c2.getSurface());

		Cercle c4 = CercleFactory.creerCercle(15);

		System.out.println(c4.getSurface());

		cercleService.doubler(c2);
		System.out.println(c2.getRayon());

	}

}
