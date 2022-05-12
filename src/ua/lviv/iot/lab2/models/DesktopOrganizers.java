package ua.lviv.iot.lab2.models;

public class DesktopOrganizers extends OfficeSupplies {
	private String standDesign;
	private int  numberOfItemsHolds;
	private String color;
	public DesktopOrganizers(int price, int quantity, boolean safeForChildren, String origin, int id,
			String standDesign, int numberOfItemsHolds, String color) {
		super(price, quantity, safeForChildren, origin, id);
		this.standDesign = standDesign;
		this.numberOfItemsHolds = numberOfItemsHolds;
		this.color = color;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "DesktopOrganizers" + super.toString() + " standDesign=" + standDesign + ", numberOfItemsHolds=" + numberOfItemsHolds
				+ ", color=" + color + "]\r\n";
	}
}
