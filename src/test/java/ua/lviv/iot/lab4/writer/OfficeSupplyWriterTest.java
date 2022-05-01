package ua.lviv.iot.lab4.writer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.lab4.models.Calculator;
import ua.lviv.iot.lab4.models.Glue;
import ua.lviv.iot.lab4.models.OfficeSupply;
import ua.lviv.iot.lab4.models.Stapler;

class OfficeSupplyWriterTest {
	private List<OfficeSupply> allSupplies;
	private List<OfficeSupply> emptySupplies;
    private List<OfficeSupply> oneSubclassSupplies;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		new OfficeSupplyWriter();
		emptySupplies = new LinkedList<>();
		allSupplies = new LinkedList<OfficeSupply>();
		allSupplies.add(new Glue("GTX3", 120, 500, "Hungary", 3, "green", 5, 100));
		allSupplies.add(new Glue("GTX8", 125, 1500, "Hungary", 8, "green", 5, 100));
		allSupplies.add(new Glue("GTX11", 135, 1000, "Hungary", 11, "green", 5, 100));
		allSupplies.add(new Stapler("GTX5", 540, 1000, "USA", 5, "black", 12, "plastic"));
		allSupplies.add(new Stapler("GTX10", 540, 1000, "USA", 10, "black", 12, "plastic"));
		allSupplies.add(new Calculator("GTX2", 55, 1000, "France", 2, "grey", 10, 3));
		allSupplies.add(new Calculator("GTX6", 60, 1000, "France", 6, "grey", 10, 3));
		allSupplies.add(new Calculator("GTX7", 65, 1000, "France", 7, "grey", 10, 4));
		oneSubclassSupplies = new LinkedList<OfficeSupply>();
		oneSubclassSupplies.add(new Calculator("GTX2", 55, 1000, "France", 2, "grey", 10, 3));
		oneSubclassSupplies.add(new Calculator("GTX6", 60, 1000, "France", 6, "grey", 10, 3));
		oneSubclassSupplies.add(new Calculator("GTX7", 65, 1000, "France", 7, "grey", 10, 4));
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testExpectedEmpty() throws IOException {
		OfficeSupplyWriter.writeToFile(emptySupplies);
		try (BufferedReader expectedBF = new BufferedReader(
				new FileReader("I:\\Games\\eclipse\\lab4\\lab4\\src\\test\\resources\\expectedEmpty.csv"));
				BufferedReader actualBF = new BufferedReader(new FileReader("OfficeSupply.csv"))) {
			String expectedLine = expectedBF.readLine();
			String actualLine = actualBF.readLine();
			Assert.assertEquals(expectedLine, actualLine);
		}
	}

	@Test
	void writeGeneralAnimalCSVTest() throws IOException {
		OfficeSupplyWriter.writeToFile(allSupplies);
		try (BufferedReader expectedBF = new BufferedReader(
				new FileReader("I:\\Games\\eclipse\\lab4\\lab4\\src\\test\\resources\\expectedAll.csv"));
				BufferedReader actualBF = new BufferedReader(new FileReader("OfficeSupply.csv"))) {
			String expectedLine;
			while ((expectedLine = expectedBF.readLine()) != null) {
				Assert.assertEquals(expectedLine, actualBF.readLine());
			}
		}
	}

	@Test
	void writeArachnidaOnlyCSVTest() throws IOException {
		OfficeSupplyWriter.writeToFile(oneSubclassSupplies);

		try (BufferedReader expectedBF = new BufferedReader(
				new FileReader("I:\\Games\\eclipse\\lab4\\lab4\\src\\test\\resources\\expectedByOneSubclass.csv"));
				BufferedReader actualBF = new BufferedReader(new FileReader("OfficeSupply.csv"))) {
			String expectedLine;
			while ((expectedLine = expectedBF.readLine()) != null) {
				Assert.assertEquals(expectedLine, actualBF.readLine());
			}
		}
	}

}
