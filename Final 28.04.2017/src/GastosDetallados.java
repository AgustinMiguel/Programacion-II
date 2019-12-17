import java.util.ArrayList;

public class GastosDetallados extends GastosGenerales {
	protected ArrayList<GastosGenerales> gastos;

	public GastosDetallados(String nombre, String categoria,String descripcion, String fecha) {
		this.nombre = nombre;
		this.categoria = categoria;
		this.descripcion = descripcion;
		this.fecha = fecha;
		this.categoria = categoria;
		this.gastos = new ArrayList<GastosGenerales>();
	}


	public ArrayList<GastosGenerales> getLista(Condicion c) {
		ArrayList<GastosGenerales> listagastos = new ArrayList<GastosGenerales>();
		ArrayList<GastosGenerales> gastosauxiliar = new ArrayList<GastosGenerales>();
		if(c.seCumple(this)){
			listagastos.addAll(this.gastos);
		}
		else{
			gastosauxiliar = this.getGastos();
			for(GastosGenerales g:gastosauxiliar){
				listagastos.addAll(g.getLista(c));
			}
		}
		return listagastos;
	}


	public double getMonto(Condicion c) {
		double monto = 0;
		for(GastosGenerales g: gastos){
			monto += g.getMonto(c);
		}
		return monto;
	}

	public ArrayList<GastosGenerales> getGastos() {
		ArrayList<GastosGenerales> listagastos = new ArrayList<GastosGenerales>();
		for(GastosGenerales g: this.gastos){
			listagastos.add(g);
		}
		return listagastos;
	}
}
