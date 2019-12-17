
public class Niño {
	protected int dni;
	
	public Niño(int dni){
		this.dni = dni;
	}
	
	public void entregarCarta(Buzon buzon, Carta carta){
		buzon.agregarCarta(carta);
	}
	public boolean equals(Niño niño){
		return (this.dni == niño.dni);
	}
}