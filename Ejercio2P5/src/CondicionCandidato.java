
public class CondicionCandidato extends Condicion {
	protected Candidato candidato;
	public boolean seCumple(Voto voto) {
		return candidato.equals(voto.candidato);
	}

}
