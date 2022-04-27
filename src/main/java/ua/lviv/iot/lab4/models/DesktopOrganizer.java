package ua.lviv.iot.lab4.models;

public class DesktopOrganizer extends OfficeSupply {
	private String standDesign;
	public DesktopOrganizer(String name, int price, int quantity, String origin, int id, String color,
			int weight, String standDesign) {
		super(name, price, quantity, origin, id, color, weight);
		this.standDesign = standDesign;
	}
	@Override
	public String getHeaders() {
		return super.getHeaders() + ", standDesign";
	}
	@Override
	public String toCSV() {
		return super.toCSV() + "," + standDesign;
	}
	@Override
	public String toString() {
		return  super.toString();   
	}
	
}
