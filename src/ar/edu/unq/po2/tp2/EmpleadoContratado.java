package ar.edu.unq.po2.tp2;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class EmpleadoContratado extends Empleado {
	private int numeroDeContrato;
	private String medioDePago;
	
	public EmpleadoContratado(String nombre, String direccion, String estadoCivil, LocalDate fechaDeNacimiento, float sueldoBasico, int numeroDeContrato, String medioDePago) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		this.numeroDeContrato = numeroDeContrato;
		this.medioDePago = medioDePago;
	}

	@Override
	public float retenciones() {
		return this.gastosAdministrativosContractuales();
	}

	private float gastosAdministrativosContractuales() {
		return 50f;
	}
	
	@Override
	public Map<String, Float> desgloceConceptos(){
		Map<String, Float> conceptos = super.desgloceConceptos();
		conceptos.put("Gastos Administrativos Contractuales", this.gastosAdministrativosContractuales());
		return conceptos;
	}
}