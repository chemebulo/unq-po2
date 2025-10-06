package ar.edu.unq.po2.tp8.cultivos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RegionTest {
	private Region regionSI;
	private Region regionSD;
	private Region regionII;
	private Region regionID;
	private Parcela parcelaSI;
	private Parcela parcelaSD;
	private Parcela parcelaII;
	private Parcela parcelaID;
	
	@BeforeEach
	void setUp() {
		TipoCultivo soja = TipoCultivo.SOJA;
		TipoCultivo trigo = TipoCultivo.TRIGO;
		
		parcelaSI = new ParcelaComun(soja);
		parcelaSD = new ParcelaComun(trigo);

		Parcela parcelaIISI = new ParcelaComun(soja);
		Parcela parcelaIISD = new ParcelaComun(soja);
		Parcela parcelaIIII = new ParcelaComun(trigo);
		Parcela parcelaIIID = new ParcelaComun(trigo);

		parcelaII = new ParcelaMixta();
		parcelaII.añadirParcela(parcelaIISI);
		parcelaII.añadirParcela(parcelaIISD);
		parcelaII.añadirParcela(parcelaIIII);
		parcelaII.añadirParcela(parcelaIIID);
		
		parcelaID = new ParcelaComun(soja);

		regionSI = new Region(parcelaSI);
		regionSD = new Region(parcelaSD);
		regionII = new Region(parcelaII);
		regionID = new Region(parcelaID);
	}
	
	@Test
	void testFuncionamientoGeneral() {
		assertEquals(500, regionSI.gananciaAnual());
		assertEquals(300, regionSD.gananciaAnual());
		assertEquals(400, regionII.gananciaAnual());
		assertEquals(500, regionID.gananciaAnual());
		
		assertEquals(0, regionSI.gananciaTrigo());
		assertEquals(500, regionSI.gananciaSoja());
		
		assertEquals(300, regionSD.gananciaTrigo());
		assertEquals(0, regionSD.gananciaSoja());
		
		assertEquals(150, regionII.gananciaTrigo());
		assertEquals(250, regionII.gananciaSoja());

		assertEquals(0, regionID.gananciaTrigo());
		assertEquals(500, regionID.gananciaSoja());
	}
}