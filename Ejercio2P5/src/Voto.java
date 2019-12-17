import java.time.LocalDate;
public class Voto {
	protected LocalDate fecha;
	protected Candidato candidato;
	public Voto(LocalDate fecha, Candidato candidato) {
		this.fecha = fecha;
		this.candidato = candidato;
	}
	public Voto(LocalDate fecha) {
		super();
		this.fecha = fecha;
		this.candidato = null;
	}
	
}
