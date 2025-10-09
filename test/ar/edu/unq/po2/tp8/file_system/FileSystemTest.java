package ar.edu.unq.po2.tp8.file_system;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileSystemTest {
	Folder estrD2025s2;
	Folder repasoPrimerParcial;
	Folder tp1Folder;
	Folder tp6Folder;
	Folder extra;
	File parcialAutores;
	File parcialEnterprise;
	File parcialNave;
	File tp1;
	File map;
	File set;
	File tp6;
	
	
	@BeforeEach
	void setUp() {
		estrD2025s2         = new Folder("EstrD2025s2",           LocalDate.of(2025, 8, 11));
		repasoPrimerParcial = new Folder("repaso-primer-parcial", LocalDate.of(2025, 9, 29));
		tp1Folder = new Folder("tp1",   LocalDate.of(2025, 8, 12));
		tp6Folder = new Folder("tp6",   LocalDate.of(2025, 9, 23));
		extra     = new Folder("extra", LocalDate.of(2025, 9, 24));
		
		parcialAutores    = new File("parcial-autores.hs",    13, LocalDate.of(2025, 10, 1), LocalDate.of(2025, 9, 29));
		parcialEnterprise = new File("parcial-enterprise.hs", 14, LocalDate.of(2025, 10, 4), LocalDate.of(2025, 10, 3));
		parcialNave       = new File("parcial-nave.hs",       17, LocalDate.of(2025, 10, 2), LocalDate.of(2025, 10, 1));
		tp1 = new File("tp-1.hs",  8,  LocalDate.of(2025, 8, 22), LocalDate.of(2025, 8, 11));
		map = new File("map.hs",   5,  LocalDate.of(2025, 9, 30), LocalDate.of(2025, 9, 26));
		set = new File("set.hs",   3,  LocalDate.of(2025, 9, 29), LocalDate.of(2025, 9, 26));
		tp6 = new File("tp-6.hs",  12, LocalDate.of(2025, 9, 26), LocalDate.of(2025, 9, 23));
	}
	
	
	@Test
	void testFuncionamientoFileSystem() {
		// Setup
		extra.add(map);
		extra.add(set);
		tp6Folder.add(extra);
		tp6Folder.add(tp6);
		tp1Folder.add(tp1);
		repasoPrimerParcial.add(parcialAutores);
		repasoPrimerParcial.add(parcialEnterprise);
		repasoPrimerParcial.add(parcialNave);
		estrD2025s2.add(repasoPrimerParcial);
		estrD2025s2.add(tp1Folder);
		estrD2025s2.add(tp6Folder);

		// Exercise & Verify
        assertEquals(13+14+17, repasoPrimerParcial.totalSize(), "Total size repasoPrimerParcial");
        assertEquals(8, tp1Folder.totalSize(), "Total size tp1Folder");
        assertEquals(5+3+12, tp6Folder.totalSize(), "Total size tp6Folder");
        assertEquals(13+14+17+8+5+3+12, estrD2025s2.totalSize(), "Total size estrD2025s2");

        assertEquals(parcialEnterprise, repasoPrimerParcial.lastModified(), "Last modified repasoPrimerParcial");
        assertEquals(tp1, tp1Folder.lastModified(), "Last modified tp1Folder");
        assertEquals(map, tp6Folder.lastModified(), "Last modified tp6Folder");
        assertEquals(parcialEnterprise, estrD2025s2.lastModified(), "Last modified estrD2025s2");

        assertEquals(parcialAutores, repasoPrimerParcial.oldestElement(), "Oldest element repasoPrimerParcial");
        assertEquals(tp1, tp1Folder.oldestElement(), "Oldest element tp1Folder");
        assertEquals(tp6, tp6Folder.oldestElement(), "Oldest element tp6Folder");
        assertEquals(tp1, estrD2025s2.oldestElement(), "Oldest element estrD2025s2");

        estrD2025s2.printStructure();
    }
}