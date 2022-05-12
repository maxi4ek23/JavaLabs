package ua.lviv.iot.lab4.models;

public class Scissors extends OfficeSupplies {
	private int length;
	private String bladeMaterial;
	public Scissors(String name, int price, int quantity, boolean safeForChildren, String origin, int id, String color, int weight,
			int length, String bladeMaterial) {
		super(name, price, quantity, safeForChildren, origin, id, color, weight);
		this.length = length;
		this.bladeMaterial = bladeMaterial;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getBladeMaterial() {
		return bladeMaterial;
	}
	public void setBladeMaterial(String bladeMaterial) {
		this.bladeMaterial = bladeMaterial;
	}
	@Override
	public String toString() {
		return "Scissors " + super.toString() + " length=" + length + ", bladeMaterial=" + bladeMaterial + "]\r\n";
	}
}