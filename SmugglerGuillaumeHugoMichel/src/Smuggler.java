import java.util.ArrayList;
import java.util.Random;
public class Smuggler {
    private String smugglerName;
    private int money;
    private int currentFine;
    private int itemsInInventory;
    private double riskFactor;

    public int getBustedCount() {
        return bustedCount;
    }

    public void setBustedCount(int bustedCount) {
        this.bustedCount = bustedCount;
    }

    private int bustedCount;


    public Smuggler(double riskFactor) {
        this.riskFactor = riskFactor;
    }

    public Smuggler() {

    }

    public double getRiskFactor() {
        return riskFactor;
    }

    public void setRiskFactor(double riskFactor) {
        this.riskFactor = riskFactor;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getCurrentFine() {
        return currentFine;
    }

    public void setCurrentFine(int currentFine) {
        this.currentFine = currentFine;
    }

    public int getItemsInInventory() { return itemsInInventory; }

    public void setItemsInInventory(int itemsInInventory) { this.itemsInInventory = itemsInInventory; }

    Smuggler(int money, int currentFine, int itemsInInventory) {
        this.money = money;
        this.currentFine = currentFine;
        this.itemsInInventory = itemsInInventory;
    }

    public boolean gettingCaught(City city, ArrayList<City> cityArrayList, Smuggler smuggler)
    {
        boolean gotCaught = true;
        this.riskFactor = this.itemsInInventory * 2;
        int min_num = 0;
        int max_num = 100;
        double gettingCaught = Math.random() * (max_num - min_num);
        int seizedGoods = (int) (Math.random() * (smuggler.getItemsInInventory() - min_num));
        if (riskFactor >= gettingCaught) {
            System.out.println("The border patrol caught you! Time to pay a fine and have your goods seized");
            setItemsInInventory(getItemsInInventory() - seizedGoods);
            this.bustedCount++;
            this.money = this.money - this.currentFine;
            this.currentFine = this.currentFine + 20;
            if (money <= 0) {
                System.out.println("Looks like you ran out of money. Game over. Better luck next time!");
                System.exit(0);
            }
            Random random = new Random();
            int numbersMason = random.nextInt(0,3);
            System.out.println("You ran away in a frenzied attempt to escape the authorities\n");
            city = cityArrayList.get(numbersMason);
            System.out.println("Looks like you found yourself in " + city.getCityName());
            return gotCaught;
        } else {
            System.out.println("You slipped past the autorities, good job!\n");
            return false;
        }
    }
    public void viewInventory(items item, ArrayList<items> itemsArrayList)
    {
        boolean viewInvent = true;
        item = itemsArrayList.get(itemsInInventory);
    }
}