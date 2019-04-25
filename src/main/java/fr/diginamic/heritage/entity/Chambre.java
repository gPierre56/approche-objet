package fr.diginamic.heritage.entity;

public class Chambre extends Piece {

	public Chambre(double superficie, int numEtage) {
		super(superficie, numEtage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Chambre [superficie=" + superficie + ", numEtage=" + numEtage + "]";
	}

	@Override
	public int getType() {
		// TODO Auto-generated method stub
		return 1;
	}

}
