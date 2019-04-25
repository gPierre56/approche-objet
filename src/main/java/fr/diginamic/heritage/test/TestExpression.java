package fr.diginamic.heritage.test;

import fr.diginamic.heritage.entity.Expression;

public class TestExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "x+2";
		int indexOperateur = test.indexOf("+");

		Expression exp = new Expression();

		if (indexOperateur != -1) {
			String gauche = test.substring(0, indexOperateur);
			String droite = test.substring(indexOperateur + 1, test.length());
		}

	}

}
