package ua.lviv.iot.lab3.models;

public class OfficeSupplies {
	private String name;
	private int price;
	private int quantity;
	private boolean safeForChildren;
	private String origin;
	private int id;
	private String color;
	private int weight;
	public OfficeSupplies(String name, int price, int quantity, boolean safeForChildren, String origin, int id, String color, int weight) {
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

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public boolean isSafeForChildren() {
		return safeForChildren;
	}
	public void setSafeForChildren(boolean safeForChildren) {
		this.safeForChildren = safeForChildren;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "\r\n"
				+ "Features: [name=" + name + ", price=" + price + ", quantity=" + quantity + ", safeForChildren=" + safeForChildren
				+ ", origin=" + origin + ", id=" + id + ", color=" + color + ", weight=" + weight + "";
	}
}
