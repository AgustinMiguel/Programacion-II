import java.util.ArrayList;

public class Ciudad extends ElementoSistema {
	protected ArrayList<Niño> niños;
	protected Buzon buzon;
	
	public Ciudad(Buzon buzon){
		this.niños = new ArrayList<Niño>();
		this.buzon = buzon;
	}
	
	public void addNiño(Niño niño){
		niños.add(niño);
	}

	public int cartasRecibidas() {
		return buzon.cartas.size();
	}

	public int cartasRecibidas(Condicion c) {
		return buzon.cartasRecibidas(c);
	}
}
