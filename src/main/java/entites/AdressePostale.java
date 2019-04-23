package entites;

public class AdressePostale {

	public int numeroRue;
	public String libelleRue;
	public int CP;
	public String ville;
	public static int nbDepartement;

	public AdressePostale(int numeroRue, String libelleRue, int CP, String ville) {
		this.numeroRue = numeroRue;
		this.libelleRue = libelleRue;
		this.CP = CP;
		this.ville = ville;
		this.nbDepartement = 101;
	}

	@Override
	public String toString() {
		return "AdressePostale [numeroRue=" + numeroRue + ", libelleRue=" + libelleRue + ", CP=" + CP + ", ville="
				+ ville + "]";
	}
}
