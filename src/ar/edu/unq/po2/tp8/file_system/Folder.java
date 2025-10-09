package ar.edu.unq.po2.tp8.file_system;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Folder implements FileSystem {
	private String name;
	private LocalDate creationDate;
	private List<FileSystem> content;

	public Folder(String name, LocalDate creationDate) {
		this.name = name;
		this.creationDate = creationDate;
		this.content = new ArrayList<FileSystem>();
	}
	
	public List<FileSystem> getContent() {
		return content;
	}
	
	public void add(FileSystem element) {
		content.add(element);
	}
	
	@Override
	public int totalSize() {
		return content.stream()
					  .mapToInt(fs -> fs.totalSize())
					  .sum();
	}

	@Override
	public void printStructure() {
		System.out.println(name + " -> Size: " + this.totalSize() + " -> Created: " + this.getCreationDate().toString() + ".");
		
		for(FileSystem element : content) {
			element.printStructure();
		}
	}

	@Override
	public FileSystem lastModified() {
		return content.stream()
					  .map(fs -> fs.lastModified())
					  .max(Comparator.comparing(fs -> fs.getModificationDate()))
					  .orElse(this);
	}

	@Override
	public FileSystem oldestElement() {
		return content.stream()
				  .map(fs -> fs.oldestElement())
				  .min(Comparator.comparing(fs -> fs.getCreationDate()))
				  .orElse(this);
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public LocalDate getModificationDate() {
		return content.stream()
		              .map(fs -> fs.getModificationDate())
		              .max((fs1, fs2) -> fs1.compareTo(fs2))
		              .orElse(this.getCreationDate());
	}
	
	@Override
	public LocalDate getCreationDate() {
		return creationDate;
	}
}