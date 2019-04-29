package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import fr.diginamic.sets.Pays;

public class TestMapPays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Pays> map = new HashMap<String, Pays>();
		double tmp = Double.MAX_VALUE;
		Object otmp = null;
		String ktmp = "";

		map.put("USA", new Pays("USA", 327167434, 55805));
		map.put("France", new Pays("France", 67795000, 38476));
		map.put("Allemagne", new Pays("Allemagne", 82979100, 47589));
		map.put("UK", new Pays("UK", 65105246, 43770));
		map.put("Italie", new Pays("Italie", 60483973, 29866));
		map.put("Japon", new Pays("Japon", 126330302, 39058));
		map.put("Chine", new Pays("Chine", 1417913092, 7989));
		map.put("Russie", new Pays("Russie", 146780700, 11099));
		map.put("Inde", new Pays("Inde", 1296834042, 1626));

		for (String string : map.keySet()) {
			System.out.println(string);
		}

		for (Pays pays : map.values()) {
			System.out.println(pays);
		}

		for (Entry<String, Pays> pays : map.entrySet()) {
			if (pays.getValue().getNbHabitants() < tmp) {
				tmp = pays.getValue().getNbHabitants();
				ktmp = pays.getKey();
				otmp = pays.getValue();
			}
		}

		map.remove(ktmp, otmp);
		System.out.println(map);

	}

}
