
public class ComparadorResultado extends Comparador {

	public ComparadorResultado(Expresion expresion1, Expresion expresion2) {
		super(expresion1, expresion2);
	}
	public int compare(Expresion expresion1, Expresion expresion2) {
		Double aux1 = expresion1.getValor();
		Double aux2 = expresion2.getValor();
		return Double.compare(aux1, aux2);
	}

}
