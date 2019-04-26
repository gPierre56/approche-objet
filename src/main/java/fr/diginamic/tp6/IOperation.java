package fr.diginamic.tp6;

/**
 * Cette interface impose une signature à toute classe souhaitant effectuer une
 * opération sur deux entiers
 * 
 * @author Guillaume
 *
 */

public interface IOperation {

	/**
	 * Cette méthode effecture un calcul sur deux entiers et retourne un résultat
	 * 
	 * @param a entier
	 * @param b entier
	 * @return int
	 */
	int calcul(int a, int b);

}
