package ar.edu.unq.po2.tp8.file_system;

import java.time.LocalDate;

public class File implements FileSystem {
	private String name;
	private int size;
	private LocalDate modificationDate;
	private LocalDate creationDate;
	
	public File(String name, int size, LocalDate modificationDate, LocalDate creationDate) {
		this.name = name;
		this.size = size;
		this.modificationDate = modificationDate;
		this.creationDate = creationDate;
	}

	public int getSize() {
		return size;
	}

	@Override
	public int totalSize() {
		return this.getSize();
	}

	@Override
	public void printStructure() {
		System.out.println("      " + name + " -> Size: " + this.totalSize() + " -> Modified: " + this.getModificationDate().toString() + ".");
	}

	@Override
	public FileSystem lastModified() {
		return this;
	}

	@Override
	public FileSystem oldestElement() {
		return this;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public LocalDate getModificationDate() {
		return modificationDate;
	}

	@Override
	public LocalDate getCreationDate() {
		return creationDate;
	}
}