import java.util.ArrayList;

public class Agency {
    ArrayList<House> listHouseToSell = new ArrayList<>();

    public void addHouse(double dimension, double distanceFromSea, String nameHouse ){
        House house = new House(dimension, distanceFromSea, nameHouse);
        listHouseToSell.add(house);
    }

}
