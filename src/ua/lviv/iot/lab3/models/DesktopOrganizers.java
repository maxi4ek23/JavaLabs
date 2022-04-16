package ua.lviv.iot.lab3.models;

public class DesktopOrganizers extends OfficeSupplies {
	private String standDesign;
	private int  numberOfItemsHolds;
	public DesktopOrganizers(String name, int price, int quantity, boolean safeForChildren, String origin, int id, String color,
			int weight, String standDesign, int numberOfItemsHolds) {
		super(name, price, quantity, safeForChildren, origin, id, color, weight);
		this.standDesign = standDesign;
		this.numberOfItemsHolds = numberOfItemsHolds;
	}
	public String getStandDesign() {
		return standDesign;
	}
	public void setStandDesign(String standDesign) {
		this.standDesign = standDesign;
	}
	public int getNumberOfItemsHolds() {
		return numberOfItemsHolds;
	}
	public void setNumberOfItemsHolds(int numberOfItemsHolds) {
		this.numberOfItemsHolds = numberOfItemsHolds;
	}
	@Override
	public String toString() {
		return "DesktopOrganizers " + super.toString() + " standDesign=" + standDesign + ", numberOfItemsHolds=" + numberOfItemsHolds + "]\r\n";
	}
}
