
public class CategoriaVip extends Categoria {
	public CategoriaVip(){}

	public boolean seCumple(Cliente cliente) {
		return cliente.vip;
	}
	
}
