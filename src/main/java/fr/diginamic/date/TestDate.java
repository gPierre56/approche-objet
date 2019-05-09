package fr.diginamic.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) throws ParseException {

		Date date = new Date(119, 3, 30);

		System.out.println(date);

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2019);
		cal.set(Calendar.MONTH, 3);
		cal.set(Calendar.DAY_OF_MONTH, 30);
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 30);
		cal.set(Calendar.SECOND, 55);
		Date date2 = cal.getTime();
		System.out.println(date2);

		SimpleDateFormat formatteur = new SimpleDateFormat("EEEEE dd/MM/yyy HH:mm:ss");
		String date3 = formatteur.format(date2);
		System.out.println(date3);

		SimpleDateFormat formatteurStandard = new SimpleDateFormat("dd/MM/yyyy");
		String chaine = "04/05/2019";
		Date maDateStandard = formatteurStandard.parse(chaine);
		System.out.println(maDateStandard);

	}

}
