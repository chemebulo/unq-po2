package ar.edu.unq.po2.tp2;
import java.time.LocalDate;
import java.util.Map;

public class ReciboDeHaberes {
	private String nombreEmpleado;
	private String direccion;
	private LocalDate fechaEmision;
	private float sueldoBruto;
	private float sueldoNeto;
	private Map<String, Float> conceptos;
	
	public ReciboDeHaberes(String nombreEmpleado, String direccion, LocalDate fechaEmision, float sueldoBruto, float sueldoNeto, Map<String, Float> conceptos) {
		this.nombreEmpleado = nombreEmpleado;
		this.direccion = direccion;
		this.fechaEmision = fechaEmision;
		this.sueldoBruto = sueldoBruto;
		this.sueldoNeto = sueldoNeto;
		this.conceptos = conceptos;
	}
	
	public void imprimirRecibo() {
		System.out.println("=========================================");
	    System.out.println("        RECIBO DE HABERES");
	    System.out.println("=========================================");
	    System.out.println("Empleado: " + this.nombreEmpleado);
	    System.out.println("Dirección: " + this.direccion);
	    System.out.println("Fecha emisión: " + this.fechaEmision);
	    System.out.println("-----------------------------------------");
	    System.out.println("CONCEPTOS:");
	    this.conceptos.forEach((clave, valor) -> {
	        System.out.println(" - " + clave + ": " + valor);
	    });
	    System.out.println("-----------------------------------------");
	}
}