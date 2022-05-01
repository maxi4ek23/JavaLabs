package ua.lviv.iot.lab4.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Calculator extends OfficeSupply {
    private int memoryRegisters;

    public Calculator(String name, int price, int quantity, String origin, int id, String color, int weight,
            int memoryRegisters) {
        super(name, price, quantity, origin, id, color, weight);
        this.memoryRegisters = memoryRegisters;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", memoryRegisters";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + memoryRegisters;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}