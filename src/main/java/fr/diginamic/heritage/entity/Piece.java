package fr.diginamic.heritage.entity;

/**
 * @author Guillaume
 *
 */
public abstract class Piece {

	protected double superficie;
	protected int numEtage;

	public Piece(double superficie, int numEtage) {
		super();
		this.superficie = superficie;
		this.numEtage = numEtage;
	}

	public abstract int getType();

}
