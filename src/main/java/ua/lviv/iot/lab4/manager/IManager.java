package ua.lviv.iot.lab4.manager;

import java.util.List;

 5_6_java_lab
import ua.lviv.iot.lab4.models.OfficeSupply;

public interface IManager {
    void addOfficeSupply(List<OfficeSupply> supplies);

    List<OfficeSupply> findByColor(String color);

    List<OfficeSupply> sortByPrice(List<OfficeSupply> supplies,
            boolean isReversed);

    List<OfficeSupply> sortByWeight(List<OfficeSupply> supplies,
            boolean isReversed);

import ua.lviv.iot.lab4.models.OfficeSupplies;

public interface IManager {
	void addOfficeSupplies(List <OfficeSupplies> supplies);
	List<OfficeSupplies> findByColor(String color);
	List<OfficeSupplies> sortByPrice(List <OfficeSupplies> supplies, boolean isReversed);
	List<OfficeSupplies> sortByWeight(List <OfficeSupplies> supplies, boolean isReversed);
 main
}
