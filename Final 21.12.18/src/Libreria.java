import java.util.ArrayList;

public class Libreria {
	protected ArrayList<Cliente> clientes;
	protected ArrayList<Categoria> categorias;
	protected ArrayList<Libro> libros;
	public Libreria(){
		this.categorias = new ArrayList<Categoria>(); //Supongo que esta ordenado
		this.libros = new ArrayList<Libro>();
	}
	
	public void vender(Cliente cliente, Compra compra ){
		
	}

	public int getDescuento(Cliente cliente) {
		for(Categoria c: categorias){
			if(c.seCumple(cliente))
				return c.descuento;
		}
		return 0;
	}
}
