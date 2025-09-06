package ar.edu.unq.po2.tp4;
import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	private String nombre;
	private List<Ingreso> ingresosPercibidos;
	
	public Trabajador(String nombre) {
		this.nombre = nombre;
		this.ingresosPercibidos = new ArrayList<Ingreso>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void registrarIngreso(Ingreso ingreso) {
		ingresosPercibidos.add(ingreso);
	}
	
	public double getTotalPercibido() {
		return this.getMontoTotalIngresos() - this.getImpuestosAPagar();
	}
	
	private double getMontoTotalIngresos() {
		return ingresosPercibidos.stream()
								 .mapToDouble(i -> i.getMonto())
								 .sum();
	}
	
	public double getMontoImponible() {
		return ingresosPercibidos.stream()
								 .mapToDouble(i -> i.montoImponible())
								 .sum();
	}
	
	public double getImpuestosAPagar() {
		return this.getMontoImponible() * 0.02d;
	}
}