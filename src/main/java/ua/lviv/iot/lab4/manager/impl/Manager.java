package ua.lviv.iot.lab4.manager.impl;

 5_6_java_lab
import java.util.Collection;

 main
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
 5_6_java_lab

import ua.lviv.iot.lab4.manager.IManager;
import ua.lviv.iot.lab4.models.OfficeSupply;

public class Manager implements IManager {
    private Map<String, List<OfficeSupply>> suppliesMap = new HashMap<>();

    @Override
    public void addOfficeSupply(List<OfficeSupply> supplies) {
        supplies.forEach(supplie -> {
            String name = supplie.getName();
            var existingOfficeSupplies = suppliesMap.get(name);
            if (existingOfficeSupplies == null) {
                existingOfficeSupplies = new LinkedList<OfficeSupply>();
                suppliesMap.put(name, existingOfficeSupplies);
            }
            existingOfficeSupplies.add(supplie);
        });
    }

    @Override
    public List<OfficeSupply> findByColor(String color) {
        List<OfficeSupply> result = new LinkedList<OfficeSupply>();
        for (List<OfficeSupply> supplies : suppliesMap.values()) {
            for (OfficeSupply supplie : supplies) {
                if (supplie.getColor().equals(color)) {
                    result.add(supplie);
                }
            }
        }
        return result;
    }

    @Override
    public List<OfficeSupply> sortByPrice(List<OfficeSupply> supplies,
            boolean isReversed) {
        if (isReversed) {
            supplies.sort(Comparator.comparing(OfficeSupply::getPrice));
        } else {
            supplies.sort(
                    Comparator.comparing(OfficeSupply::getPrice).reversed());
        }
        return supplies;
    }

    @Override
    public List<OfficeSupply> sortByWeight(List<OfficeSupply> supplies,
            boolean isReversed) {
        if (isReversed) {
            supplies.sort(Comparator.comparing(OfficeSupply::getWeight));
        } else {
            supplies.sort(
                    Comparator.comparing(OfficeSupply::getWeight).reversed());
        }
        return supplies;
    }

    public Collection<List<OfficeSupply>> getAll() {
        return suppliesMap.values();
    }
}

import ua.lviv.iot.lab4.manager.IManager;
import ua.lviv.iot.lab4.models.OfficeSupplies;

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
 main
