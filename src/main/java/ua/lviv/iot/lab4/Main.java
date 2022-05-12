package ua.lviv.iot.lab4;

 5_6_java_lab
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
    }
}

import java.util.ArrayList;
import java.util.List;
import ua.lviv.iot.lab4.manager.impl.Manager;
import ua.lviv.iot.lab4.models.*;

public class Main {

	public static void main(String[] args) {
		OfficeSupplies desktopOrganizer = new DesktopOrganizers("GTX1", 250, 1000, false, "Spain", 58385889, "stable", 9, "black", 10);
		OfficeSupplies calculator = new Ñalculators("GTX2", 55, 1000, true, "France", 1847184043, "grey", 10, "metal", "lol", 1, 3);
		OfficeSupplies glue = new Glue("GTX3", 120, 1000, false, "Hungary", 756743, "green", 1, 120, "luck");
		OfficeSupplies scissor = new Scissors("GTX4", 345, 1000, false, "Turkey", 6476963, "green", 1, 4, "metal");
		OfficeSupplies stapler = new Staplers("GTX5", 540, 1000, false, "USA", 5366434, "black", 12, "metal", 10);
		List<OfficeSupplies> stockOfficeSupplies = new ArrayList<>();
		stockOfficeSupplies.add(stapler);
		stockOfficeSupplies.add(glue);
		stockOfficeSupplies.add(scissor);
		stockOfficeSupplies.add(calculator);
		stockOfficeSupplies.add(desktopOrganizer);
		Manager manager = new Manager();
		manager.addOfficeSupplies(stockOfficeSupplies);
		manager.findByColor("green");
		System.out.print(manager.sortByWeight(stockOfficeSupplies, false));
	}
}	
 main
