import java.util.ArrayList;

public class Division extends Expresion {
	protected String operador;
	public Division(Abstracta izquierda, Abstracta derecha) {
		super(izquierda, derecha);
		this.operador = "/";
	}

	public double getValor() {
		if (derecha.getValor() != 0){
			return this.izquierda.getValor()/derecha.getValor();
			}
		return this.error;
	}

	public ArrayList<String> getOperadores() {
		ArrayList<String> operador = new ArrayList<String>();
		operador.add(this.operador);
		return operador;
	}

}