package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {
	private double porcentajeDescuento;

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean precioCuidado, double porcentajeDescuento) {
		super(nombre, precio, precioCuidado);
		this.porcentajeDescuento = porcentajeDescuento;
	}
	
	@Override
	public double getPrecio() {
		return super.getPrecio() * this.porcentajeAPagar();
	}
	
	private double porcentajeAPagar() {
		this.validarPorcentajeAPagar();
		return (100d - porcentajeDescuento) / 100d;
	}
	
	private void validarPorcentajeAPagar() {
		if(porcentajeDescuento < 0 || porcentajeDescuento > 100) {
			throw new IllegalArgumentException("El descuento debe ser un valor entre 0 y 100.");
		}
	}
}