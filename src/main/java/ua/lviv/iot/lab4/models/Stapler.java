package ua.lviv.iot.lab4.models;

public class Stapler extends OfficeSupply {
	private String housingMaterial;
	public Stapler(String name, int price, int quantity, String origin, int id, String color, int weight, String housingMaterial) {
		super(name, price, quantity, origin, id, color, weight);
		this.housingMaterial = housingMaterial; 
		 }
	@Override
	public String getHeaders() {
		return super.getHeaders() + ", housingMaterial";
	}
	@Override
	public String toCSV() {
		return super.toCSV() + "," + housingMaterial;
	}
	@Override
	public String toString() {
		return  super.toString();  
	}
}
