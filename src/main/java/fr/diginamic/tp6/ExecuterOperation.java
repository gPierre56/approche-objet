package fr.diginamic.tp6;

public class ExecuterOperation {

	public int execute(int a, int b, IOperation operation) {
		return operation.calcul(a, b);
	}

}
