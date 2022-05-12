package ua.lviv.iot.lab2.models;

public class Ñalculators extends OfficeSupplies {
	private String housingMaterial;
	private String supply;
	private int bitDisplay;
	private String color;
	private int memoryRegisters;
	public Ñalculators(int price, int quantity, boolean safeForChildren, String origin, int id, String housingMaterial,
			String supply, int bitDisplay, String color, int memoryRegisters) {
		super(price, quantity, safeForChildren, origin, id);
		this.housingMaterial = housingMaterial;
		this.supply = supply;
		this.bitDisplay = bitDisplay;
		this.color = color;
		this.memoryRegisters = memoryRegisters;
	}
	
	public String getHousingMaterial() {
		return housingMaterial;
	}

	public void setHousingMaterial(String housingMaterial) {
		this.housingMaterial = housingMaterial;
	}

	public String getSupply() {
		return supply;
	}

	public void setSupply(String supply) {
		this.supply = supply;
	}

	public int getBitDisplay() {
		return bitDisplay;
	}

	public void setBitDisplay(int bitDisplay) {
		this.bitDisplay = bitDisplay;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMemoryRegisters() {
		return memoryRegisters;
	}

	public void setMemoryRegisters(int memoryRegisters) {
		this.memoryRegisters = memoryRegisters;
	}

	@Override
	public String toString() {
		return "Ñalculators" + super.toString() + " housingMaterial=" + housingMaterial + ", supply=" + supply + ", bitDisplay=" + bitDisplay
				+ ", color=" + color + ", memoryRegisters=" + memoryRegisters + "]\r\n";
	}
	
}
