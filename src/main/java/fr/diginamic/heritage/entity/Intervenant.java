package fr.diginamic.heritage.entity;

/**
 * @author Guillaume
 *
 */
public abstract class Intervenant {

	protected String nom;
	protected String prenom;

	/** Méthode d'affichage du salaire à redéfinir dans les classes filles */
	public abstract double getSalaire();

	public abstract String afficherDonnees();

}
