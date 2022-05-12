package ua.lviv.iot.firstLab;

public class Main {

	public static void main(String[] args) {
		Farm cowFarm = new Farm();
		Farm pigFarm = new Farm("Kyiv", 50, 6);
		Farm fishFarm = new Farm("Harkiv", 65, 7, 120, "Bogdan", true);
        System.out.println(cowFarm);
        System.out.println(pigFarm);
        System.out.println(fishFarm);
        
        
	}

}
