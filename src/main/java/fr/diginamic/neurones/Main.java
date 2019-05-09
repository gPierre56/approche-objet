package fr.diginamic.neurones;

import org.neuroph.core.data.DataSet;
import org.neuroph.core.data.DataSetRow;
import org.neuroph.nnet.MultiLayerPerceptron;

public class Main {

	public static void main(String[] args) {

		MultiLayerPerceptron neuralNetwork = new MultiLayerPerceptron(2, 2, 1);

		DataSet dataSet = new DataSet(2, 1);
		DataSetRow rOne = new DataSetRow(new double[] { 0, 0 }, new double[] { 0 });
		DataSetRow rTwo = new DataSetRow(new double[] { 0, 1 }, new double[] { 1 });
		DataSetRow rThree = new DataSetRow(new double[] { 1, 0 }, new double[] { 1 });
		DataSetRow rFour = new DataSetRow(new double[] { 1, 1 }, new double[] { 1 });
		dataSet.addRow(rOne);
		dataSet.addRow(rTwo);
		dataSet.addRow(rThree);
		dataSet.addRow(rFour);
		for (int i = 0; i < 50; i++) {
			neuralNetwork.learn(dataSet);
		}

		neuralNetwork.setInput(0, 0);
		neuralNetwork.calculate();
		System.out.println(neuralNetwork.getOutput()[0]);

		neuralNetwork.setInput(0, 1);
		neuralNetwork.calculate();
		System.out.println(neuralNetwork.getOutput()[0]);

		neuralNetwork.setInput(1, 0);
		neuralNetwork.calculate();
		System.out.println(neuralNetwork.getOutput()[0]);

		neuralNetwork.setInput(1, 1);
		neuralNetwork.calculate();
		System.out.println(neuralNetwork.getOutput()[0]);

	}

}
