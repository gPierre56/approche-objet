package fr.diginamic.heritage.entity;

import fr.diginamic.tp6.ISurface;

/**
 * @author Guillaume
 *
 */
public abstract class Forme implements ISurface {
	/** méthodes abstraites de la classe mère */

	public abstract double calculerSurface();

	public abstract double calculerPerimetre();

}
