
public class Ni�o {
	protected String nombre;
	protected int dni;
	protected Region barrio;
	public Ni�o(String nombre, int dni){
		this.nombre = nombre;
		this.dni = dni;
	}
	
	public void entregarCarta(Carta carta){
		this.barrio.depositar(carta);
	}
	
	public boolean equals(Ni�o ni�o){
		if((this.nombre == ni�o.nombre)&&(this.dni==ni�o.dni)){
			return true;
		}
		else{
			return false;
		}
	}
}
