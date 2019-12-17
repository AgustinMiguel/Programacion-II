import java.time.LocalDate;
import java.util.ArrayList;
public class Cliente {
	protected String nombre;
	protected ArrayList<String> generos;
	protected ArrayList<Compra> compras;
	protected boolean vip;
	public Cliente(String nombre, boolean vip){
		this.nombre = nombre;
		this.generos = new ArrayList<String>();
		this.compras = new ArrayList<Compra>();
		this.vip = vip;
	}
	public boolean acepta(Libro libro){
		for(String g: generos){
			if(libro.esGenero(g)){
				return true;
			}
		}
		return false;
	}
	
	public Compra comprar(Libreria libreria){
		Compra compra = new Compra();
		compra.fecha = LocalDate.now();
		for(Libro l: libreria.libros){
			if(this.acepta(l)){
				compra.libros.add(l);
				compra.monto += l.precio;
			}
		}
		int descuento = libreria.getDescuento(this);
		compra.monto -= compra.monto*descuento/100;
		return compra;
	}
}
