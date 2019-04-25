package fr.diginamic.heritage.entity;

public class Salon extends Piece {

	public Salon(double superficie, int numEtage) {
		super(superficie, numEtage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Salon [superficie=" + superficie + ", numEtage=" + numEtage + "]";
	}

	@Override
	public int getType() {
		// TODO Auto-generated method stub
		return 4;
	}

}
