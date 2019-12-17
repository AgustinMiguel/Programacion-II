import java.util.ArrayList;


public class Gastos extends GastosGenerales {
	protected double monto;
	public Gastos(String nombre, String categoria,String descripcion, String fecha, double monto) {
		this.monto = monto;
	}


	public ArrayList<GastosGenerales> getLista(Condicion c) {
		ArrayList<GastosGenerales> listagastos = new ArrayList<GastosGenerales>();
		if(c.seCumple(this)){
			listagastos.add(this);
		}
		return listagastos;
	}


	public double getMonto(Condicion c) {
		if(c.seCumple(this)){
			return this.monto;
		}
		return 0;
	}


	public ArrayList<GastosGenerales> getGastos() { //lo uso para aplanar el compo
		ArrayList<GastosGenerales> listagastos = new ArrayList<GastosGenerales>();
		listagastos.add(this);
		return listagastos;
	}
}
