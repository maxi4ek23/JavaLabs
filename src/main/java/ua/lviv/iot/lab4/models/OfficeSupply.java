package ua.lviv.iot.lab4.models;

public class OfficeSupply  {
	private String name;
	private int price;
	private int quantity;
	private String origin;
	private int id;
	private String color;
	private int weight;
	public OfficeSupply(String name, int price, int quantity, String origin, int id, String color, int weight) {
		this.name = name;
		this.price = price;
		this.quantity = quantity; 
		this.origin = origin;
		this.id = id;
		this.color = color;
		this.weight = weight; 
	}
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public String getColor() {
		return color;
	}
	public int getWeight() {
		return weight;
	}
	public String getHeaders() {
		return "name, price, quantity, origin, id, color, weight"; 
	}
	public String toCSV() {
		return name + "," + price + "," + quantity + "," + origin + "," + id + "," + color + "," + weight;
	}
	@Override
	public String toString() {
		return " Name=" + name + ", price=" + price + ", quantity=" + quantity + 
				 ", origin=" + origin + ", id=" + id + ", color=" + color + ", weight=" + weight; 
 
	}
	
}

