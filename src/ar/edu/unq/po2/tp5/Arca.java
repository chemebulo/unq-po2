package ar.edu.unq.po2.tp5;
import java.util.ArrayList;
import java.util.List;

public class Arca implements Agencia {
	private List<Factura> pagosRegistrados;
	
	public Arca() {
		this.pagosRegistrados = new ArrayList<Factura>();
	}
	
	@Override
	public void registrarPago(Factura factura) {
		pagosRegistrados.add(factura);
	}
	
	public List<Factura> getPagosRegistrados(){
		return pagosRegistrados;
	}
}