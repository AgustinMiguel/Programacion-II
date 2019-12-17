import java.util.ArrayList;
import java.util.HashSet;

public class Buzon {
	protected ArrayList<Niño> niñosBuenos;
	protected HashSet<Carta> cartas;
	public Buzon(){
		this.niñosBuenos = new ArrayList<Niño>();
		this.cartas = new HashSet<Carta>();
	}
	public void addNiño(Niño niño){
		niñosBuenos.add(niño);
	}
	public void addCarta(Carta carta){
		cartas.add(carta);
	}
	public int cartasRecibidas(Condicion c){
		int cantidad = 0;
		for (Carta i: cartas){
			if(c.seCumple(i)){
				cantidad++;
			}
		}
		return cantidad;
	}
	public void agregarCarta(Carta carta){
		boolean esta = false;
		for(Niño i : niñosBuenos){
			if(carta.remitente.equals(i)){
				esta = true;
			}
			if(esta){
				addCarta(carta);
			}
			else{
				carta.vaciar();
				addCarta(carta);
			}
		}
	}
	public int niñosMalos(){
		int suma = 0;
		for(Carta i: cartas){
			if(i.vacia()){
				suma++;
			}
		}
		return suma;
	}
}
