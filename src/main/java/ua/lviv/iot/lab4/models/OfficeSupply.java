package ua.lviv.iot.lab4.models;

public class OfficeSupply  {
	private String name;
	private int price;
	private int quantity;
	private boolean safeForChildren;
	private String origin;
	private int id;
	private String color;
	private int weight;
	public OfficeSupply(String name, int price, int quantity, boolean safeForChildren, String origin, int id, String color, int weight) {
		this.name = name;
		this.price = price;
		this.quantity = quantity; 
		this.safeForChildren = safeForChildren; 
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
	@Override
	public String toString() {
		return "OfficeSupply [name=" + name + ", price=" + price + ", quantity=" + quantity + ", safeForChildren="
				+ safeForChildren + ", origin=" + origin + ", id=" + id + ", color=" + color + ", weight=" + weight
				+ "]";
	}
	
}

