package ua.lviv.iot.lab4.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Scissor extends OfficeSupply { 
	private String bladeMaterial;
	public Scissor(String name, int price, int quantity, String origin, int id, String color, int weight, String bladeMaterial) {
		super(name, price, quantity, origin, id, color, weight);
		this.bladeMaterial = bladeMaterial;
	}
	@Override
	public String getHeaders() {
		return super.getHeaders() + ", bladeMaterial";
	}
	@Override
	public String toCSV() {
		return super.toCSV() + "," + bladeMaterial;
	}
	@Override
	public String toString() {
		return  super.toString(); 
	} 
	
}
