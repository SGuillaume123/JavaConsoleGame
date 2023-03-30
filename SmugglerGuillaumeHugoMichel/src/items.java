public class items {
    private String itemName;
    private String itemType;
    int itemPrice;
    private int itemID;
    public int getItemID() { return itemID; }
    public void setItemID(int itemID) { this.itemID = itemID; }

    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public String getItemType() {
        return itemType;
    }
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }
    public int getItemPrice() {
        return itemPrice;
    }
    public int setItemPrice(int itemPrice) {
        int min = 1;
        int max = 25;
        int rndPrice = (int) (Math.random() * (max - min + 1) + min);
        return this.itemPrice = rndPrice;
    }

    items(String itemName, String itemType, int itemPrice, int itemID) {
        this.itemName = itemName;
        this.itemType = itemType;
        this.itemPrice = itemPrice;
        this.itemID = itemID;
    }

    public int quantityTransaction;
    public void setAmountTransaction(int amountTransaction) {
        this.quantityTransaction = amountTransaction;
    }
    public int getAmountTransaction() {
        return quantityTransaction;
    }


    int totalPrice;
    public void buyItem(Smuggler smuggler)
    {
        boolean funds = smuggler.getMoney() > totalPrice;
        if (this.itemID == 1 && funds == true)
        {
            totalPrice = setItemPrice(itemPrice) * quantityTransaction;
            smuggler.setMoney(smuggler.getMoney() - totalPrice);
            smuggler.setItemsInInventory(smuggler.getItemsInInventory() + quantityTransaction);
            System.out.println("You bought a total of " + getAmountTransaction() + " " + itemName + " for " + totalPrice + "k !\n");
        }
        else if (this.itemID == 2 && funds == true)
        {
            totalPrice = setItemPrice(itemPrice) * quantityTransaction;
            smuggler.setMoney(smuggler.getMoney() - totalPrice);
            smuggler.setItemsInInventory(smuggler.getItemsInInventory() + quantityTransaction);
            System.out.println("You bought a total of " + getAmountTransaction() + " " + itemName + " for " + totalPrice + "k !\n");
        }
        else if (this.itemID == 3 && funds == true)
        {
            totalPrice = setItemPrice(itemPrice) * quantityTransaction;
            smuggler.setMoney(smuggler.getMoney() - totalPrice);
            smuggler.setItemsInInventory(smuggler.getItemsInInventory() + quantityTransaction);
            System.out.println("You bought a total of " + getAmountTransaction() + " " + itemName + " for " + totalPrice + "k !\n");
        }
        else if (this.itemID == 4 && funds == true)
        {
            totalPrice = setItemPrice(itemPrice) * quantityTransaction;
            smuggler.setMoney(smuggler.getMoney() - totalPrice);
            smuggler.setItemsInInventory(smuggler.getItemsInInventory() + quantityTransaction);
            System.out.println("You bought a total of " + quantityTransaction + " " + itemName + " for " + totalPrice + "k !\n");
        }
        else
        {
            do {
                System.out.println("Clowning won't do you any good. Watch how you conduct business. You only live once as the kids say.");
            } while (funds = false);
        }
    }
    public void sellItem(Smuggler smuggler)
    {
        boolean stock = smuggler.getItemsInInventory() >= quantityTransaction;
        if (this.itemID == 1 && stock == true)
        {
            boolean sellCondition = smuggler.getItemsInInventory() < quantityTransaction;
            totalPrice = setItemPrice(itemPrice) * quantityTransaction;
            smuggler.setMoney(smuggler.getMoney() + totalPrice);
            smuggler.setItemsInInventory(smuggler.getItemsInInventory() - quantityTransaction);
            System.out.println("You sold a total of " + quantityTransaction + " " + itemName + " for a profit of " + totalPrice + "k !\n");
        }
        else if (this.itemID == 2 && stock == true)
        {
            totalPrice = setItemPrice(itemPrice) * quantityTransaction;
            smuggler.setMoney(smuggler.getMoney() + totalPrice);
            smuggler.setItemsInInventory(smuggler.getItemsInInventory() - quantityTransaction);
            System.out.println("You sold a total of " + quantityTransaction + " " + itemName + " for a profit of " + totalPrice + "k !\n");
        }
        else if (this.itemID == 3 && stock == true)
        {
            totalPrice = setItemPrice(itemPrice) * quantityTransaction;
            smuggler.setMoney(smuggler.getMoney() + totalPrice);
            smuggler.setItemsInInventory(smuggler.getItemsInInventory() - quantityTransaction);
            System.out.println("You sold a total of " + quantityTransaction + " " + itemName + " for a profit of " + totalPrice + "k !\n");
        }
        else if (this.itemID == 4 && stock == true)
        {
            totalPrice = setItemPrice(itemPrice) * quantityTransaction;
            smuggler.setMoney(smuggler.getMoney() + totalPrice);
            smuggler.setItemsInInventory(smuggler.getItemsInInventory() - quantityTransaction);
            System.out.println("You sold a total of " + quantityTransaction + " " + itemName + " for a profit of " + totalPrice + "k !\n");
        }
        else
        {
            do {
                System.out.println("My henchmen looked over your offer. You are short. Don't forget who you're dealing with on your travels.");
            } while (stock = false);
        }
    }
}