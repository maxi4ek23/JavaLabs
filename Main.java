package ua.lviv.iot.firstLab;

public class Main {

	public static void main(String[] args) {
		Farm CowFarm = new Farm();
		Farm PigFarm = new Farm("Kyiv", 50, 6);
		Farm FishFarm = new Farm("Harkiv", 65, 7, 120, "Bogdan", true);
        System.out.println(CowFarm);
        System.out.println(PigFarm);
        System.out.println(FishFarm);
        
        
	}

}
