import java.util.ArrayList;

public class Mundo extends ElementoSistema {
	protected ArrayList<ElementoSistema> mundo;

	public Mundo(){
		 this.mundo= new ArrayList<ElementoSistema>();
	}
	public void addCiudad(ElementoSistema ciudad){
		 mundo.add(ciudad);
	}

	public int cartasRecibidas() {
		int suma=0;
		for(ElementoSistema i:mundo){
			suma+= i.cartasRecibidas();
		}
		return suma;
	}
	public int cartasRecibidas(Condicion c) {
		int suma=0;
		for(ElementoSistema i:mundo){
			suma+= i.cartasRecibidas(c);
		}
		return suma;
	}
	
	public int promedioCartas(Condicion c){
		return ((this.cartasRecibidas()/this.cartasRecibidas(c))*100);
	}
}