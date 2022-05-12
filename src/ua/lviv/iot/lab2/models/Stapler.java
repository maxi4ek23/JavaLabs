package ua.lviv.iot.lab2.models;

public class Stapler extends OfficeSupplies {
	private String color;
	private String housingMaterial;
	private int numberOfSheetsFastened;
	public Stapler(int price, int quantity, boolean safeForChildren, String origin, int id, String color,
			String housingMaterial, int numberOfSheetsFastened) {
		super(price, quantity, safeForChildren, origin, id);
		this.color = color;
		this.housingMaterial = housingMaterial;
		this.numberOfSheetsFastened = numberOfSheetsFastened;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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
		return "Stapler" + super.toString() + " color=" + color + ", housingMaterial=" + housingMaterial + ", numberOfSheetsFastened="
				+ numberOfSheetsFastened + "]\r\n";
	}
	

}
