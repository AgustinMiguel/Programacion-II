import java.util.ArrayList;
public class Mesa extends SistemaElectoral{
	protected ArrayList<Voto> votos;
	protected ArrayList<Votante> padron;
	
	public Mesa(){
		this.votos = new ArrayList<Voto>();
		this.padron = new ArrayList<Votante>();
	}
	
	public void addVotante(Votante votante){
		padron.add(votante);
	}
	
	public int cantidadVotos() {
		return votos.size();
	}

	public int cantidadVotos(Condicion c) {
		int total = 0;
		for (Voto i : votos){
			if(c.seCumple(i)){
				total++;
			}
		}
		return total;
	}
	public void votar(Votante votante, Voto voto){
		for (Votante i : padron){
			if(i.dni == votante.dni){
				votos.add(voto);
			}
		}
	}
	
}
