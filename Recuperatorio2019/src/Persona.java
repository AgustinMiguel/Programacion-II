
public class Persona {
	protected String nombre;
	protected Direccion direccion;
	public Persona(String nombre, Direccion direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public String getDireccion(){
		return this.direccion.getDireccion();
	}
}
