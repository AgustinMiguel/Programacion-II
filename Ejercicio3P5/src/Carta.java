import java.util.ArrayList;

public class Carta {
	protected Niño remitente;
	protected ArrayList<String> regalos;
	
	public Carta(Niño remitente){
		this.remitente = remitente;
		this.regalos = new ArrayList<String>();
	}
	public void addRegalo(String regalo){
		regalos.add(regalo);
	}
	
	public void vaciar(){
		regalos.removeAll(regalos);
		regalos.add("Carbon");
	}
	
	public boolean vacia(){
		return (regalos.get(0) == "Carbon");
		
	}

}
