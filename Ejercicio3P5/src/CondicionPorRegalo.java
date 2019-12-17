
public class CondicionPorRegalo extends Condicion {
	protected String regalo;
	public CondicionPorRegalo(String regalo){
		this.regalo = regalo;
	}
	public boolean seCumple(Carta carta) {
		return (carta.regalos.contains(regalo));
	}

}
