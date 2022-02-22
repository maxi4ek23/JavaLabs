package ua.lviv.iot.firstLab;

public record Farm(String Location, int NumberOfAnimals, int PowerOfFans, int NumberOfEmployee, String NameOfOwner, boolean Export) {
	
	public static String NumberOfcard = "4444 3333 1234 5555";
	public static String PhoneNumber = "0671265111";
	
	Farm() {
		this("Lviv", 120, 8, 100, "Max", true);
	}
	
	Farm(String Location, int NumberOfAnimals, int PowerOfFans) {
		this(Location, NumberOfAnimals, PowerOfFans, 50, "Igor", false);
	}
	
	public static void Order() {
		System.out.println("if you want to place an order, call this number:" + NumberOfcard);
	}
	
	@Override
    public String toString() {
		return "Farm info:" + Location + "," + NumberOfAnimals +"," + PowerOfFans +"," + NumberOfEmployee +"," + NameOfOwner +"," + Export;
	}
}
