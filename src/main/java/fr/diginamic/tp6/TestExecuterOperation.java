package fr.diginamic.tp6;

public class TestExecuterOperation {

	public static void main(String[] args) {

		ExecuterOperation ex = new ExecuterOperation();
		Multiplication m = new Multiplication();
		Addition a = new Addition();

		int x = 2;
		int y = 5;

		System.out.println(ex.execute(x, y, m));

	}

}
