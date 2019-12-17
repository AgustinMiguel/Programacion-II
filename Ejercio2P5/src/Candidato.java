
public class Candidato {
	protected String nombre;
	protected String agrupacion;
	protected String partido;
	public Candidato(String nombre, String agrupacion, String partido) {
		this.nombre = nombre;
		this.agrupacion = agrupacion;
		this.partido = partido;
	}
	
	public boolean equals(Candidato c){
		return ((this.nombre.equals(c.nombre))&&(this.agrupacion.equals(c.agrupacion))&&(this.partido.equals(c.partido)));
	}
}
