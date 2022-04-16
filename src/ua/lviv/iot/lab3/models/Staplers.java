package ua.lviv.iot.lab3.models;

public class Staplers extends OfficeSupplies {
	private String housingMaterial;
	private int numberOfSheetsFastened;
	public Staplers(String name, int price, int quantity, boolean safeForChildren, String origin, int id, String color, int weight,
			String housingMaterial, int numberOfSheetsFastened) {
		super(name, price, quantity, safeForChildren, origin, id, color, weight);
		this.housingMaterial = housingMaterial;
		this.numberOfSheetsFastened = numberOfSheetsFastened;
	}
	public String getHousingMaterial() {
		return housingMaterial;
	}
	public void setHousingMaterial(String housingMaterial) {
		this.housingMaterial = housingMaterial;
	}
	public int getNumberOfSheetsFastened() {
		return numberOfSheetsFastened;
	}
	public void setNumberOfSheetsFastened(int numberOfSheetsFastened) {
		this.numberOfSheetsFastened = numberOfSheetsFastened;
	}
	@Override
	public String toString() {
		return "Staplers " + super.toString() + " housingMaterial=" + housingMaterial + ", numberOfSheetsFastened=" + numberOfSheetsFastened
				+ "]\r\n";
	}
}
