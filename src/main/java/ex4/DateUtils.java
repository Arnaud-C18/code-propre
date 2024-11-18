package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/** Afficher une date a un certain format */
public class DateUtils {

	static String PATTERN = "dd/MM/yyyy HH:mm:ss";

	/**
	 * Afficher la date choisi au format choisi
	 * @param pattern le pattern choisi
	 * @param date la date choisie
	 * @return la date choisie au format choisi
	 */
	public static String format(String pattern, Date date) {
		
		SimpleDateFormat formateur = new SimpleDateFormat(pattern);
		return formateur.format(date);
	}

	/**
	 * Afficher la date choisi au format par defaut "dd/MM/yyyy HH:mm:ss"
	 * @param date la date choisie
	 * @return la date choisie au format "dd/MM/yyyy HH:mm:ss"
	 */
	public static String formatDefaut(Date date) {
        return format(PATTERN, date);
    }
}
