
public class Votante {
	protected int dni;

	public Votante(int dni) {
		this.dni = dni;
	}
	public void votar(Mesa mesa, Voto voto){
		mesa.votar(this, voto);
		}
	}
