package ua.lviv.iot.lab4.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Glue extends OfficeSupply {
    private int volume;

    public Glue(String name, int price, int quantity, String origin, int id,
            String color, int weight, int volume) {
        super(name, price, quantity, origin, id, color, weight);
        this.volume = volume;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", volume";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + volume;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
