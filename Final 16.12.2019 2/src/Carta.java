import java.util.ArrayList;

public class Carta {
	protected Ni�o remitente;
	protected ArrayList<String> regalos;
	public Carta(Ni�o ni�o){
		this.remitente = ni�o;
		this.regalos = new ArrayList<String>();
	}
	public ArrayList<String> carbonizar(){
		ArrayList<String> carbon = new ArrayList<String>();
		carbon.add("Trozo de carbon");
		this.regalos = carbon;
		return regalos;
	}
}
