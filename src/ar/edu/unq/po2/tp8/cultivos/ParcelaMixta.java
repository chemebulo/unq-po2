package ar.edu.unq.po2.tp8.cultivos;

import java.util.ArrayList;
import java.util.List;

public class ParcelaMixta implements Parcela {
	private List<Parcela> parcelas;
	
	public ParcelaMixta() {
		this.parcelas = new ArrayList<Parcela>();
	}
	
	@Override
	public int gananciaAnual() {
		return parcelas.stream()
					   .mapToInt(p -> p.gananciaAnual())
					   .sum() / 4;
	}
	
	@Override
	public void añadirParcela(Parcela parcela) {
		this.validarSiPuedeAgregar();
		parcelas.add(parcela);
	}

	@Override
	public void eliminarParcela(Parcela parcela) {
		this.validarSiPuedeEliminar(parcela);
		parcelas.remove(parcela);
	}
	
	@Override
	public int gananciaTrigo() {
		return parcelas.stream()
			     	   .mapToInt(p -> p.gananciaTrigo())
				       .sum() / 4;
	}
	
	@Override
	public int gananciaSoja() {
		return parcelas.stream()
				       .mapToInt(p -> p.gananciaSoja())
				       .sum() / 4;
	}
	
	private void validarSiPuedeAgregar() {
		if(parcelas.size() > 4) {
			throw new RuntimeException("No se pueden agregar más parcelas en la parcela actual.");
		}
	}
	
	private void validarSiPuedeEliminar(Parcela parcela) {
		if(!parcelas.contains(parcela)) {
			throw new RuntimeException("No se puede eliminar una parcela que no existe en la parcela actual.");
		}
	}
}