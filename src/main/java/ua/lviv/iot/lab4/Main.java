package ua.lviv.iot.lab4;

import java.util.ArrayList;
import java.util.List;
import ua.lviv.iot.lab4.manager.impl.Manager;
import ua.lviv.iot.lab4.models.*;

public class Main {

	public static void main(String[] args) {
		DesktopOrganizer desktopOrganizer = new DesktopOrganizer("GTX1", 250, 1000, false, "Spain", 58385889, "stable", 9);
		Calculator calculator = new Calculator("GTX2", 55, 1000, true, "France", 1847184043, "grey", 10);
		System.out.print(calculator);
		Glue glue = new Glue("GTX3", 120, 1000, false, "Hungary", 756743, "green", 1);
		Scissor scissor = new Scissor("GTX4", 345, 1000, false, "Turkey", 6476963, "green", 3);
		Stapler stapler = new Stapler("GTX5", 540, 1000, false, "USA", 5366434, "black", 12);  
		List<OfficeSupply> stockOfficeSupplies = new ArrayList<>();
		stockOfficeSupplies.add(stapler);
		stockOfficeSupplies.add(glue); 
		stockOfficeSupplies.add(scissor); 
		stockOfficeSupplies.add(calculator);  
		stockOfficeSupplies.add(desktopOrganizer);    
		Manager manager = new Manager();  
		manager.addOfficeSupply(stockOfficeSupplies);  
	} 
}
 