package fr.diginamic.tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {

	public static void main(String[] args) {

		List<Pays> listePays = new ArrayList<Pays>();

		listePays.add(new Pays("USA", 327167434D, 55805D));
		listePays.add(new Pays("France", 67795000D, 38476D));
		listePays.add(new Pays("Allemagne", 82979100D, 47589D));
		listePays.add(new Pays("UK", 65105246D, 43770D));
		listePays.add(new Pays("Italie", 60483973D, 29866D));
		listePays.add(new Pays("Japon", 126330302D, 39058D));
		listePays.add(new Pays("Chine", 1417913092D, 7989D));
		listePays.add(new Pays("Russie", 146780700D, 11099D));
		listePays.add(new Pays("Inde", 1296834042D, 1626D));

		Collections.sort(listePays);
		System.out.println(listePays);

	}

}
