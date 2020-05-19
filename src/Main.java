public class Main {
    public static void main(String[] args) {

        Agency agency = new Agency();
        agency.addHouse(100,100, "Pluto");
        agency.addHouse(500, 200, "Paperino");

        for(int i = 0; i < agency.listHouseToSell.size(); i ++){
            System.out.println(agency.listHouseToSell.get(i).getNameHouse());
            System.out.println(agency.listHouseToSell.get(i).getPrices());

        }


    }
}
