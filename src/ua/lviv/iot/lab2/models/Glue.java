package ua.lviv.iot.lab2.models;

public class Glue extends OfficeSupplies {
	private int volume;
	private String basis;
	private int weight;
	public Glue(int price, int quantity, boolean safeForChildren, String origin, int id, int volume, String basis,
			int weight) {
		super(price, quantity, safeForChildren, origin, id);
		this.volume = volume;
		this.basis = basis;
		this.weight = weight;
	}
	
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String getBasis() {
		return basis;
	}

	public void setBasis(String basis) {
		this.basis = basis;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Glue" + super.toString() + " volume=" + volume + ", basis=" + basis + ", weight=" + weight + "]\r\n";
	}
	

}
