package ua.lviv.iot.lab3.manager.impl;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import ua.lviv.iot.lab3.manager.IManager;
import ua.lviv.iot.lab3.models.OfficeSupplies;

public class Manager implements IManager {
	private Map<String, List <OfficeSupplies>> suppliesMap = new HashMap<>();
	
	@Override
	public void addOfficeSupplies(List <OfficeSupplies> supplies) {
	supplies.forEach(supplie -> {
		String name = supplie.getName();
		var existingOfficeSupplies = suppliesMap.get(name);
		if(existingOfficeSupplies == null) {
			existingOfficeSupplies = new LinkedList<OfficeSupplies>();
			suppliesMap.put(name, existingOfficeSupplies);	
		}
		existingOfficeSupplies.add(supplie);
	});
	}
	
	@Override
	public List<OfficeSupplies> findByColor(String color) {
		List<OfficeSupplies> result = new LinkedList<OfficeSupplies>();
		for(List<OfficeSupplies> supplies : suppliesMap.values()) {
			for(OfficeSupplies supplie : supplies) {
				if(supplie.getColor().equals(color)) {
					result.add(supplie);
				}
			}
		}
		return result;
	}
	
	@Override
	public List<OfficeSupplies> sortByPrice(List <OfficeSupplies> supplies, boolean isReversed) {
		 if(isReversed) {
			 supplies.sort(Comparator.comparing(OfficeSupplies::getPrice));
		 }
		 else {
			 supplies.sort(Comparator.comparing(OfficeSupplies::getPrice).reversed());
		 }
		 return supplies;
	}
	
	@Override
	public List<OfficeSupplies> sortByWeight(List <OfficeSupplies> supplies, boolean isReversed) {
		if(isReversed) {
			 supplies.sort(Comparator.comparing(OfficeSupplies::getWeight));
		 }
		 else {
			 supplies.sort(Comparator.comparing(OfficeSupplies::getWeight).reversed());
		 }
		 return supplies;
	}
}
