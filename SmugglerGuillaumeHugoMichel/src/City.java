import java.util.ArrayList;

public class City {
    private String cityName;
    int itemsInStock;
    static int cityID;

    public City() {

    }

    public int getCityID() {
        return cityID;
    }

    public static void setCityID(int cityID) {
        City.cityID = cityID;
    }

    public City(String cityName, int itemsInStock,int cityID) {
        this.cityName = cityName;
        this.itemsInStock = itemsInStock;
        this.cityID = cityID;
    }

    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getItemsInStock() {
        return itemsInStock;
    }

    public void setItemsInStock(int itemsInStock) {
        this.itemsInStock = itemsInStock;
    }

    public void travel() {
        System.out.println("Welcome to " + this.getCityName());
    }

    public void viewCity()
    {
        System.out.println(this.getCityName());
    }
}
