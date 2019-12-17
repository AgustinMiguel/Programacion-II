import java.util.ArrayList;
public class Establecimiento extends SistemaElectoral {
	protected ArrayList<SistemaElectoral> establecimiento;
	protected String nombre;
	public Establecimiento(String nombre){
		this.nombre = nombre;
		this.establecimiento = new ArrayList<SistemaElectoral>();
	}
	public void addEstablecimiento(SistemaElectoral establecimiento){
		this.establecimiento.add(establecimiento);
	}
	public int cantidadVotos() {
		int votos = 0;
		for(SistemaElectoral i : establecimiento){
			votos += i.cantidadVotos();
		}
		return votos;
	}

	public int cantidadVotos(Condicion c) {
		int votos = 0;
		for(SistemaElectoral i : establecimiento){
			votos += i.cantidadVotos(c);
		}
		return votos;
	}
}
