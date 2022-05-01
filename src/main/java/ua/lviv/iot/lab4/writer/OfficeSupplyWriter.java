package ua.lviv.iot.lab4.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.List;

import ua.lviv.iot.lab4.models.OfficeSupply;

public class OfficeSupplyWriter {
    public static void writeToFile(List<OfficeSupply> supplies) throws IOException {
        try (FileWriter writer = new FileWriter("OfficeSupply.csv", Charset.defaultCharset())) {
            supplies.sort(Comparator.comparing(supply -> supply.getClass().getName()));
            String previousClassName = "";
            for (var supply : supplies) {
                if (!supply.getClass().getSimpleName().equals(previousClassName)) {
                    writer.write(supply.getHeaders());
                    writer.write("\r\n");
                    previousClassName = supply.getClass().getSimpleName();
                }
                writer.write(supply.toCSV());
                writer.write("\r\n");
            }
        }
    }
}
