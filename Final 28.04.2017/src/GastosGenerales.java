import java.util.ArrayList;


public abstract class GastosGenerales  {
	protected String categoria;
	protected String nombre;
	protected String descripcion;
	protected String fecha;
	public abstract double getMonto(Condicion c);
	public abstract ArrayList<GastosGenerales> getGastos();
	public abstract ArrayList<GastosGenerales> getLista(Condicion c);
}
