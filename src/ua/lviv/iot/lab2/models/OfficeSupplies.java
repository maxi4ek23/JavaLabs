package ua.lviv.iot.lab2.models;

public class OfficeSupplies {
	private int price;
	private int quantity;
	private boolean safeForChildren;
	private String origin;
	private int id;
	public OfficeSupplies(int price, int quantity, boolean safeForChildren, String origin, int id) {
		super();
		this.price = price;
		this.quantity = quantity;
		this.safeForChildren = safeForChildren;
		this.origin = origin;
		this.id = id;
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

	@Override
	public String toString() {
		return "\r\n"
				+ "Features: [price=" + price + ", quantity=" + quantity + ", safeForChildren=" + safeForChildren
				+ ", origin=" + origin + ", id=" + id + ",";
	}
}
