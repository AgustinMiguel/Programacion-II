import java.util.ArrayList;
import java.util.Collections;

public class Software {
	protected ArrayList<Expresion> expresiones;
	protected Comparador comparador;
	public Software(ArrayList<Expresion> expresiones, Comparador comparador) {
		this.expresiones = expresiones;
		this.comparador = comparador;
	}
	public void setComparador(Comparador comparador){
		this.comparador = comparador;
	}
	public void addExpresion (Expresion expresion){
		expresiones.add(expresion);
	}
	
	public ArrayList<Expresion> getExpresiones(){
		ArrayList<Expresion> aux = new ArrayList<Expresion>(expresiones);
		Collections.sort(aux, comparador);
		return aux;
	}
}
