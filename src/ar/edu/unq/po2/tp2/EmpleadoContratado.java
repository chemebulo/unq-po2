package ar.edu.unq.po2.tp2;
import java.time.LocalDate;
import java.util.Map;

public class EmpleadoContratado extends Empleado {
	private int numeroDeContrato;
	private String medioDePago;
	
	public EmpleadoContratado(String nombre, String direccion, String estadoCivil, LocalDate fechaDeNacimiento, float sueldoBasico, int numeroDeContrato, String medioDePago) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		this.numeroDeContrato = numeroDeContrato;
		this.medioDePago = medioDePago;
	}
	
	public int getNumeroDeContrato() {
		return numeroDeContrato;
	}
	
	public String getMedioDePago() {
		return medioDePago;
	}
	
	public float gastosAdministrativosContractuales() {
		return 50f;
	}
	
	@Override
	public float retenciones() {
		return this.gastosAdministrativosContractuales();
	}

	@Override
	public Map<String, Float> desgloceConceptos(){
		Map<String, Float> conceptos = super.desgloceConceptos();
		
		conceptos.put("Gastos Administrativos Contractuales", this.gastosAdministrativosContractuales());
		
		return conceptos;
	}

	@Override
	public float retencionAportesJubilatorios() {
		return 0f;
	}
	
	@Override
	public float retencionObraSocial() {
		return 0f;
	}

	@Override
	public float retencionExtraDeObraSocial() {
		return 0f;
	}
}