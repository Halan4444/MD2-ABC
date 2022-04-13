package TH17_FILECSV;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<National> nationalList = readNation.readNationFromCSV("Source2.csv");
        System.out.println("List of national in csv file");
        for (National na: nationalList) {
            System.out.println(na);
        }
    }
}
