import java.util.ArrayList;
public class ClienteExigente extends Cliente{

	public ClienteExigente(String nombre, boolean vip) {
		super(nombre, vip);
	}
	public boolean acepta(Libro libro){
		boolean resultado = true;
		for(int i=0; ((i<this.generos.size())&&(resultado==true));i++){
			resultado=libro.esGenero(this.generos.get(i));
		}
		return resultado;
	}
}
