package org.zerock.domain;

public class Menu {

	private String name;
	private int price;
	
	public Menu(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}


	@Override
	public String toString() {
		return "Menu [name=" + name + ", price=" + price + "]";
	}
	
	
}
