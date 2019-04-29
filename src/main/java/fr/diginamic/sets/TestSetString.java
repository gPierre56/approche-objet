package fr.diginamic.sets;

import java.util.HashSet;

public class TestSetString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> set = new HashSet<String>();
		int max = 0;
		String plusLong = "";

		set.add("USA");
		set.add("France");
		set.add("Allemagne");
		set.add("UK");
		set.add("Italie");
		set.add("Japon");
		set.add("Chine");
		set.add("Russie");
		set.add("Inde");

		for (String string : set) {
			if (string.length() > max) {
				max = string.length();
				plusLong = string;
			}
		}

		System.out.println(plusLong);

	}

}
