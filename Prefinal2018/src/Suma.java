import java.util.ArrayList;

public class Suma extends Expresion {
	protected String operador;
	public Suma(Abstracta izquierda, Abstracta derecha) {
		super(izquierda, derecha);
		this.operador = "+";
	}

	public double getValor() {
		return this.izquierda.getValor()+this.derecha.getValor();
	}

	public ArrayList<String> getOperadores() {
		ArrayList<String> operador = new ArrayList<String>();
		operador.add(this.operador);
		return operador;
	}

}
