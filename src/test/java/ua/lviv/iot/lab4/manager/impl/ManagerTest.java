package ua.lviv.iot.lab4.manager.impl;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.lab4.models.Calculator;
import ua.lviv.iot.lab4.models.DesktopOrganizer;
import ua.lviv.iot.lab4.models.Glue;
import ua.lviv.iot.lab4.models.OfficeSupply;
import ua.lviv.iot.lab4.models.Scissor;
import ua.lviv.iot.lab4.models.Stapler;

class ManagerTest {
	private Manager manager;
	private List <OfficeSupply> supplies;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		manager = new Manager();
		supplies = new LinkedList<OfficeSupply>();
		supplies.add( new DesktopOrganizer("GTX1", 250, 1000, false, "Spain", 58385889, "stable", 9));
		supplies.add(new Calculator("GTX2", 55, 1000, true, "France", 1847184043, "grey", 10));
		supplies.add(new Glue("GTX3", 120, 1000, false, "Hungary", 756743, "green", 1));
		supplies.add(new Scissor("GTX4", 345, 1000, false, "Turkey", 6476963, "green", 3));
		supplies.add(new Stapler("GTX5", 540, 1000, false, "USA", 5366434, "black", 12)); 
		manager.addOfficeSupply(supplies);	     
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testFindByColor() {
		List<OfficeSupply> expected = new ArrayList<>(); 
		var actual = manager.findByColor("green");
		expected.add(supplies.get(3));
		expected.add(supplies.get(2));
		Assert.assertEquals(expected, actual);   
	}
	
	@Test 
	void testFindBycolorNotnull() {
		var actual = manager.findByColor("green");
		Assert.assertNotNull(actual);
	}
	
	@Test
	void testAscSortByPrice() {
		manager.sortByPrice(supplies, true);
		Assert.assertEquals(55, supplies.get(0).getPrice());
		Assert.assertEquals(120, supplies.get(1).getPrice()); 
		Assert.assertEquals(250, supplies.get(2).getPrice());
		Assert.assertEquals(345, supplies.get(3).getPrice());
		Assert.assertEquals(540, supplies.get(4).getPrice());
	}
	
	@Test
	void testDescSortByPrice() {
		manager.sortByPrice(supplies, false);
		Assert.assertEquals(540, supplies.get(0).getPrice());
		Assert.assertEquals(345, supplies.get(1).getPrice());
		Assert.assertEquals(250, supplies.get(2).getPrice()); 
		Assert.assertEquals(120, supplies.get(3).getPrice());
		Assert.assertEquals(55, supplies.get(4).getPrice());
	}
	
	@Test
	void testAscSortByWeight() {
		manager.sortByWeight(supplies, true);
		Assert.assertEquals(1, supplies.get(0).getWeight());
		Assert.assertEquals(3, supplies.get(1).getWeight()); 
		Assert.assertEquals(9, supplies.get(2).getWeight());
		Assert.assertEquals(10, supplies.get(3).getWeight());
		Assert.assertEquals(12, supplies.get(4).getWeight());
	} 
	 
	@Test
	void testDescSortByWeight() {
		manager.sortByWeight(supplies, false);
		Assert.assertEquals(12, supplies.get(0).getWeight());
		Assert.assertEquals(10, supplies.get(1).getWeight());
		Assert.assertEquals(9, supplies.get(2).getWeight());
		Assert.assertEquals(3, supplies.get(3).getWeight());
		Assert.assertEquals(1, supplies.get(4).getWeight());
	} 
	
	@Test
	void testAddSopplies() {
		manager.addOfficeSupply(supplies);
		Assert.assertFalse(manager.getAll().isEmpty());
		Assert.assertEquals(5, manager.getAll().size());
	}
	}
