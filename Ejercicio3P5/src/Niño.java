
public class Ni�o {
	protected int dni;
	
	public Ni�o(int dni){
		this.dni = dni;
	}
	
	public void entregarCarta(Buzon buzon, Carta carta){
		buzon.agregarCarta(carta);
	}
	public boolean equals(Ni�o ni�o){
		return (this.dni == ni�o.dni);
	}
}