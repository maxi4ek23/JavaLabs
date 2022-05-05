package ua.lviv.iot.lab4.manager;

import java.util.List;

import ua.lviv.iot.lab4.models.OfficeSupply;

public interface IManager {
    void addOfficeSupply(List<OfficeSupply> supplies);

    List<OfficeSupply> findByColor(String color);

    List<OfficeSupply> sortByPrice(List<OfficeSupply> supplies,
            boolean isReversed);

    List<OfficeSupply> sortByWeight(List<OfficeSupply> supplies,
            boolean isReversed);
}
