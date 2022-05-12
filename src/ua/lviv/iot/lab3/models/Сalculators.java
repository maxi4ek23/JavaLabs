package ua.lviv.iot.lab3.models;

public class Ñalculators extends OfficeSupplies {
	private String housingMaterial;
	private String supply;
	private int bitDisplay;
	private int memoryRegisters;
	public Ñalculators(String name, int price, int quantity, boolean safeForChildren, String origin, int id, String color,
			int weight, String housingMaterial, String supply, int bitDisplay, int memoryRegisters) {
		super(name, price, quantity, safeForChildren, origin, id, color, weight);
		this.housingMaterial = housingMaterial;
		this.supply = supply;
		this.bitDisplay = bitDisplay;
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
	public int getMemoryRegisters() {
		return memoryRegisters;
	}
	public void setMemoryRegisters(int memoryRegisters) {
		this.memoryRegisters = memoryRegisters;
	}
	@Override
	public String toString() {
		return "Ñalculators " + super.toString() + " housingMaterial=" + housingMaterial + ", supply=" + supply + ", bitDisplay=" + bitDisplay
				+ ", memoryRegisters=" + memoryRegisters + "]\r\n";
	}
}
