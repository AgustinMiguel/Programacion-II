import java.util.ArrayList;

public class Ciudad extends ElementoSistema {
	protected ArrayList<Ni�o> ni�os;
	protected Buzon buzon;
	
	public Ciudad(Buzon buzon){
		this.ni�os = new ArrayList<Ni�o>();
		this.buzon = buzon;
	}
	
	public void addNi�o(Ni�o ni�o){
		ni�os.add(ni�o);
	}

	public int cartasRecibidas() {
		return buzon.cartas.size();
	}

	public int cartasRecibidas(Condicion c) {
		return buzon.cartasRecibidas(c);
	}
}
