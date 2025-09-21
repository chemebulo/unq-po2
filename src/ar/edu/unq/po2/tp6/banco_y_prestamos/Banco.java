package ar.edu.unq.po2.tp6.banco_y_prestamos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Banco {
	private Set<Cliente> clientes;
	private List<SolicitudCredito> solicitudes;
	
	public Banco() {
		this.clientes = new HashSet<Cliente>();
		this.solicitudes = new ArrayList<SolicitudCredito>();
	}
	
	public void registrarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void registrarSolicitud(SolicitudCredito solicitud) {
		this.validarRegistro(solicitud.getCliente());
		solicitudes.add(solicitud);
	}
	
	private void validarRegistro(Cliente cliente) {
		if(!this.estaRegistrado(cliente)) {
			throw new RuntimeException("El cliente no se encuentra registrado en este banco.");
		}
	}
	
	private boolean estaRegistrado(Cliente cliente) {
		return clientes.contains(cliente);
	}
	
	public float montoTotalADesembolsar() {
		float montoTotal = 0;
		
		for(SolicitudCredito solicitud : solicitudes) {
			if(solicitud.esAceptable()) {
				montoTotal += solicitud.getMontoSolicitado();
			}
		}
		
		return montoTotal;
	}
	
	public void otorgarSolicitudesAceptables() {
		for(SolicitudCredito solicitud : solicitudes) {
			if(solicitud.esAceptable()) {
				this.otorgarSolicitud(solicitud);
			}
		}
		
		this.solicitudes.clear();
	}
	
	private void otorgarSolicitud(SolicitudCredito solicitud) {
		Cliente cliente = solicitud.getCliente();
		float montoSolicitado = solicitud.getMontoSolicitado();
		cliente.ingresar(montoSolicitado);
	}
}