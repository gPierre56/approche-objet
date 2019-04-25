package fr.diginamic.heritage.entity;

public class SalleDeBain extends Piece {

	public SalleDeBain(double superficie, int numEtage) {
		super(superficie, numEtage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SalleDeBain [superficie=" + superficie + ", numEtage=" + numEtage + "]";
	}

	@Override
	public int getType() {
		// TODO Auto-generated method stub
		return 3;
	}

}
