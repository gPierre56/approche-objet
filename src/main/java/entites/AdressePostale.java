package entites;

public class AdressePostale {

	private int numeroRue;
	private String libelleRue;
	private int CP;
	private String ville;
	private static int nbDepartement = 101;

	public AdressePostale(int numeroRue, String libelleRue, int CP, String ville) {
		this.numeroRue = numeroRue;
		this.libelleRue = libelleRue;
		this.CP = CP;
		this.ville = ville;

	}

	public int getNumeroRue() {
		return numeroRue;
	}

	public void setNumeroRue(int numeroRue) {
		this.numeroRue = numeroRue;
	}

	public String getLibelleRue() {
		return libelleRue;
	}

	public void setLibelleRue(String libelleRue) {
		this.libelleRue = libelleRue;
	}

	public int getCP() {
		return CP;
	}

	public void setCP(int cP) {
		CP = cP;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public static int getNbDepartement() {
		return nbDepartement;
	}

	public static void setNbDepartement(int nbDepartement) {
		AdressePostale.nbDepartement = nbDepartement;
	}

	@Override
	public String toString() {
		return "AdressePostale [numeroRue=" + numeroRue + ", libelleRue=" + libelleRue + ", CP=" + CP + ", ville="
				+ ville + "]";
	}
}
