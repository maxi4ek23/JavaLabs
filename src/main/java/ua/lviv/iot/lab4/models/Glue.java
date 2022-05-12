package ua.lviv.iot.lab4.models;

 5_6_java_lab
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Glue extends OfficeSupply {
    private int volume;

    public Glue(String name, int price, int quantity, String origin, int id,
            String color, int weight, int volume) {
        super(name, price, quantity, origin, id, color, weight);
        this.volume = volume;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", volume";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + volume;
    }

    @Override
    public String toString() {
        return super.toString();
    }


public class Glue extends OfficeSupplies {
	private int volume;
	private String basis;
	public Glue(String name, int price, int quantity, boolean safeForChildren, String origin, int id, String color, int weight,
			int volume, String basis) {
		super(name, price, quantity, safeForChildren, origin, id, color, weight);
		this.volume = volume;
		this.basis = basis;
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
	@Override
	public String toString() {
		return "Glue " +  super.toString() + " volume=" + volume + ", basis=" + basis + "]\r\n";
	}
 main
}
