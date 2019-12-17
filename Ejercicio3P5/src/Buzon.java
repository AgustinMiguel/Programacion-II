import java.util.ArrayList;
import java.util.HashSet;

public class Buzon {
	protected ArrayList<Ni�o> ni�osBuenos;
	protected HashSet<Carta> cartas;
	public Buzon(){
		this.ni�osBuenos = new ArrayList<Ni�o>();
		this.cartas = new HashSet<Carta>();
	}
	public void addNi�o(Ni�o ni�o){
		ni�osBuenos.add(ni�o);
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
		for(Ni�o i : ni�osBuenos){
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
	public int ni�osMalos(){
		int suma = 0;
		for(Carta i: cartas){
			if(i.vacia()){
				suma++;
			}
		}
		return suma;
	}
}
