package ar.edu.unq.po2.tp5;
import java.util.List;

public interface Agencia {

	public void registrarPago(Factura factura);
	
	public List<Factura> getPagosRegistrados();
}