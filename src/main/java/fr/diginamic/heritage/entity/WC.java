package fr.diginamic.heritage.entity;

public class WC extends Piece {

	public WC(double superficie, int numEtage) {
		super(superficie, numEtage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "WC [superficie=" + superficie + ", numEtage=" + numEtage + "]";
	}

	@Override
	public int getType() {
		// TODO Auto-generated method stub
		return 5;
	}

}
