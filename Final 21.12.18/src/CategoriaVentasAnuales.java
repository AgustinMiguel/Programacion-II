
public class CategoriaVentasAnuales extends Categoria {
	protected int ventas;
	public CategoriaVentasAnuales(int ventas){
		this.ventas = ventas;
	}

	public boolean seCumple(Cliente cliente) {
		int contador = 0;
		for(Compra c: cliente.compras){
			contador++;
		}
		if(contador == ventas){
			return true;
		}
		else{
			return false;
		}
	}
}
