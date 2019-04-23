package fr.diginamic.operations;

public class TestMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalculMoyenne calcul = new CalculMoyenne(2);

		calcul.ajoutNombre(10);
		calcul.ajoutNombre(20);
		calcul.ajoutNombre(15);

		System.out.println(calcul.donnerMoyenne());
	}

}
