package fr.diginamic.heritage.entity;

public class Cuisine extends Piece {

	public Cuisine(double superficie, int numEtage) {
		super(superficie, numEtage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cuisine [superficie=" + superficie + ", numEtage=" + numEtage + "]";
	}

	@Override
	public int getType() {
		// TODO Auto-generated method stub
		return 2;
	}

}
