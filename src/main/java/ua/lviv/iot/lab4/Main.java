package ua.lviv.iot.lab4;

import java.util.ArrayList;
import java.util.List;
import ua.lviv.iot.lab4.manager.impl.Manager;
import ua.lviv.iot.lab4.models.*;

public class Main {

	public static void main(String[] args) {
		DesktopOrganizer desktopOrganizer = new DesktopOrganizer("GTX1", 250, 1000, "Spain", 58385889, "stable", 9, null);
		Calculator calculator = new Calculator("GTX2", 55, 1000, "France", 1847184043, "grey", 10, 3,1); 
		System.out.print(desktopOrganizer);
		Glue glue = new Glue("GTX3", 120, 1000, "Hungary", 756743, "green", 1, 0);
		Scissor scissor = new Scissor("GTX4", 345, 1000, "Turkey", 6476963, "green", 3, null); 
		Stapler stapler = new Stapler("GTX5", 540, 1000, "USA", 5366434, "black", 12, null); 
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
 