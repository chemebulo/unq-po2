package ar.edu.unq.po2.tp8.uml;

import java.util.ArrayList;
import java.util.List;

public class CarroDeCompras {
	private List<Product> products;
	
	public CarroDeCompras() {
		this.products = new ArrayList<Product>();
	}
	
	public void setElements(List<Product> products) {
		this.products = products;
	}
	
	public List<Product> getElements(){
		return products;
	}
	
	public int totalRounded() {
		return (int) this.total();
	}
	
	public float total() {
		return (float) products.stream()
					           .mapToDouble(p -> p.getPrice())
					           .sum();
	}
}