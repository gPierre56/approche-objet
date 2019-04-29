package fr.diginamic.sets;

import java.util.HashSet;

public class TestSetDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Double> set = new HashSet<Double>();
		Double max = Double.MIN_VALUE;

		set.add(1.5);
		set.add(8.25);
		set.add(-7.32);
		set.add(13.3);
		set.add(-12.45);
		set.add(48.5);
		set.add(0.01);
		set.add(13.3);

		System.out.println(set);

		for (Double double1 : set) {
			if (double1 > max) {
				max = double1;
			}
		}

		System.out.println(max);

	}

}
