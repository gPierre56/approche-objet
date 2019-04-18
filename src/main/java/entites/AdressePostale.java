package entites;

public class AdressePostale {

	public int numeroRue;
	public String libelleRue;
	public int CP;
	public String ville;
	
	
	@Override
	public String toString() {
		return "AdressePostale [numeroRue=" + numeroRue + ", libelleRue=" + libelleRue + ", CP=" + CP + ", ville="
				+ ville + "]";
	}
}
