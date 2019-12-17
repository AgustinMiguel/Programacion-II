import java.util.ArrayList;


public abstract class Expresion extends Abstracta implements Cloneable  {
	protected Abstracta izquierda;
	protected Abstracta derecha;
	protected static int error = -23;
	
	public Expresion(Abstracta izquierda, Abstracta derecha) {
		super();
		this.izquierda = izquierda;
		this.derecha = derecha;
	}
	public abstract double getValor();
	
	public void setError(int error){
		this.error = error;
	}
	public ArrayList<Valor> getValores(){
		ArrayList<Valor> valores = new ArrayList<Valor>();
		valores.addAll(izquierda.getValores());
		valores.addAll(derecha.getValores());
		return valores;
	}
	
	public abstract ArrayList<String> getOperadores();
	
	public String toString(){
		return "pija";
	}
}
