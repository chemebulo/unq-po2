package ar.edu.unq.po2.tp2;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

public class Empresa {
	private String nombre;
	private String cuit;
	private List<Empleado> empleados;
	private List<ReciboDeHaberes> recibos;

	public Empresa(String nuevoNombre, String nuevoCuit) {
		this.nombre = nuevoNombre;
		this.cuit = nuevoCuit;
		this.empleados = new ArrayList<>();
		this.recibos = new ArrayList<>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getCuit() {
		return cuit;
	}
	
	public void añadirEmpleado(Empleado e) {
		empleados.add(e);
	}
	
	protected List<ReciboDeHaberes> getRecibos(){
		return recibos;
	}
	
	public void liquidarSueldos() {
		LocalDate fechaHoy = LocalDate.now();
		recibos = empleados.stream()
						   .map(e -> new ReciboDeHaberes(
									e.getNombre(),
									e.getDireccion(),
									fechaHoy,
									e.sueldoBruto(),
									e.sueldoNeto(),
									e.desgloceConceptos())
							    )
						  .collect(Collectors.toList());
	}
	
	private float sumarEmpleados(ToDoubleFunction<Empleado> mapper) {
		return (float) empleados.stream()
								.mapToDouble(mapper)
								.sum();
	}
	
	public float montoTotalSueldosNeto() {
		return this.sumarEmpleados(e -> e.sueldoNeto());
	}

	public float montoTotalSueldosBruto() {
		return this.sumarEmpleados(e -> e.sueldoBruto());
	}
	
	public float montoTotalRetenciones() {
		return this.sumarEmpleados(e -> e.retenciones());
	}
}