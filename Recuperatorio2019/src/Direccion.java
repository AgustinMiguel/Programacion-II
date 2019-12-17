
public class Direccion {
	protected String ciudad;
	protected String calle;
	protected String numero;
	public Direccion(String ciudad, String calle, String numero) {
		super();
		this.ciudad = ciudad;
		this.calle = calle;
		this.numero = numero;
	}
	
	public String getDireccion(){
		return ciudad + calle + numero;
	}
}
