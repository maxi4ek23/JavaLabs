package ua.lviv.iot.lab2;

import ua.lviv.iot.lab2.models.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DesktopOrganizers desktopOrganizer = new DesktopOrganizers(250, 1000, false, "Spain", 58385889, "stable", 9, "black");
		System.out.print(desktopOrganizer);
		Ñalculators calculator = new Ñalculators(55, 1000, true, "France", 1847184043, "metal", "battary", 2, "grey", 14);
		System.out.print(calculator);
		Glue glue = new Glue(120, 1000, false, "Hungary", 756743, 40, "metal", 120);
		System.out.print(glue);
		Scissors scissor = new Scissors(345, 1000, false, "Turkey", 6476963, 60, "green", "metal");
		System.out.print(scissor);
		Stapler stapler = new Stapler(540, 1000, false, "USA", 5366434, "blue", "metal", 55);
		System.out.print(stapler);
	}
}
