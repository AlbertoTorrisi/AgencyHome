public class House {
    private double dimension;
    private double price;
    private double distanceFromSea;
    private String nameHouse;


    public House(double dimension, double distanceFromSea, String nameHouse ){
      this.dimension = dimension;
      this.distanceFromSea = distanceFromSea;
      this.nameHouse = nameHouse;
      setPrices(dimension, distanceFromSea);
    }

    public void setPrices(double dimension, double distanceFromSea){

        if(distanceFromSea <= 200){
            price = 2000 * distanceFromSea;
        }
        else if(distanceFromSea > 200 && distanceFromSea <= 1000 ){
            price= 1500 * distanceFromSea;
        }
        else if(distanceFromSea > 1000){
            price= 1000 * distanceFromSea;
        }
    }

    public double getPrices(){
        return price;
    }


    public String getNameHouse() {
        return nameHouse;
    }

    public double getDimension() {
        return dimension;
    }

    public double getPrice() {
        return price;
    }

    public double getDistanceFromSea() {
        return distanceFromSea;
    }
}
