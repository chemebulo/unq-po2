package ar.edu.unq.po2.tp5.caja_mercado_central_v1;
import java.util.List;

public interface Agencia {

	public void registrarPago(Factura factura);
	
	public List<Factura> getPagosRegistrados();
}