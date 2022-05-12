package ua.lviv.iot.firstLab;

public record Farm(String location, int numberOfAnimals, int powerOfFans, int numberOfEmployee, String nameOfOwner, boolean export) {
	
	public static String numberOfcard = "4444 3333 1234 5555";
	public static String phoneNumber = "0671265111";
	
	Farm() {
		this("Lviv", 120, 8, 100, "Max", true);
	}
	
	Farm(String location, int numberOfAnimals, int powerOfFans) {
		this(location, numberOfAnimals, powerOfFans, 50, "Igor", false);
	}
	
	public static void order() {
		System.out.println("if you want to place an order, call this number:" + phoneNumber);
	}
	
	@Override
    public String toString() {
		return "Farm info:" + location + "," + numberOfAnimals +"," + powerOfFans +"," + numberOfEmployee +"," + nameOfOwner +"," + export;
	}
}
