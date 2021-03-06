package ua.lviv.iot.lab3.manager;

import java.util.List;

import ua.lviv.iot.lab3.models.OfficeSupplies;

public interface IManager {
	void addOfficeSupplies(List <OfficeSupplies> supplies);
	List<OfficeSupplies> findByColor(String color);
	List<OfficeSupplies> sortByPrice(List <OfficeSupplies> supplies, boolean isReversed);
	List<OfficeSupplies> sortByWeight(List <OfficeSupplies> supplies, boolean isReversed);
}
