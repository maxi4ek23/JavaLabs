package ua.lviv.iot.lab2.models;

public class Scissors extends OfficeSupplies {
	private int length;
	private String color;
	private String bladeMaterial;
	public Scissors(int price, int quantity, boolean safeForChildren, String origin, int id, int length, String color,
			String bladeMaterial) {
		super(price, quantity, safeForChildren, origin, id);
		this.length = length;
		this.color = color;
		this.bladeMaterial = bladeMaterial;
	}
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBladeMaterial() {
		return bladeMaterial;
	}

	public void setBladeMaterial(String bladeMaterial) {
		this.bladeMaterial = bladeMaterial;
	}

	@Override
	public String toString() {
		return "Scissors" + super.toString() + " length=" + length + ", color=" + color + ", bladeMaterial=" + bladeMaterial + "]\r\n";
	}
	
	
	
	

}
