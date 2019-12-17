import java.util.ArrayList;


public class Valor extends Abstracta {
	protected double valor;

	public Valor(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return this.valor;
	}

	@Override
	public ArrayList<Valor> getValores() {
		ArrayList<Valor> valores = new ArrayList<Valor>();
		valores.add(this);
		return valores;
	}


}
