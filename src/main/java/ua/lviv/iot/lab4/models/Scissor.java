package ua.lviv.iot.lab4.models;

public class Scissor extends OfficeSupply { 
	public Scissor(String name, int price, int quantity, boolean safeForChildren, String origin, int id, String color, int weight) {
		super(name, price, quantity, safeForChildren, origin, id, color, weight);
	}
	@Override
	public String toString() {
		return "Scissor " + super.toString();
	}
	
}
