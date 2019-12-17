import java.util.Comparator;
public abstract class Comparador implements Comparator<Expresion>{
	protected Expresion expresion1;
	protected Expresion expresion2;
	
	public Comparador(Expresion expresion1, Expresion expresion2) {
		this.expresion1 = expresion1;
		this.expresion2 = expresion2;
	}
}
