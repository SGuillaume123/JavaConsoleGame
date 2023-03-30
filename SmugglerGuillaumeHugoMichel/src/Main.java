import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        ArrayList<items> itemsArray = new ArrayList<items>();
        items firstItem = new items("White Powder", "Drug", 0, 1);
        items secondItem = new items("Blue Crystal", "Drug", 0, 1);
        items thirdItem = new items("Russian Drink", "Booze", 0, 2);
        items fourthItem = new items("False Passport", "Paper", 0, 3);
        items fifthItem = new items("Suspicious Package", "???", 0, 4);
        itemsArray.add(firstItem);
        itemsArray.add(secondItem);
        itemsArray.add(thirdItem);
        itemsArray.add(fourthItem);
        itemsArray.add(fifthItem);
        ArrayList<City> cities = new ArrayList<City>();
        City firstCity = new City("Mourreal", 0, 1);
        City secondCity = new City("Bumville", 0, 2);
        City thirdCity = new City("Richtown", 0, 3);
        City fourthCity = new City("Shawinigan", 0, 4);
        cities.add(firstCity);
        cities.add(secondCity);
        cities.add(thirdCity);
        cities.add(fourthCity);

        Smuggler alCapone = new Smuggler(200, 60, 0);

        Scanner myScanner = new Scanner(System.in);
        String userInput = "";
        int userInputValidation = -1;
        int currentCity;
        boolean isRunning;
        do {
            System.out.println("You recreate yourselves many times in life. This time is the last leg and it's as a criminal.");
            System.out.println("Please press X to begin the game");
            userInput = myScanner.nextLine();
        }
        while (!userInput.equalsIgnoreCase("X"));
        isRunning = true;
            while (isRunning) {

                do {
                    System.out.println("Which city woud you like to travel to? Use the numbers to travel");
                    System.out.println("1: Mourreal\n2: Bumville\n3: Richtown\n4: Shawinigan");
                    while (!myScanner.hasNextInt() && userInputValidation <= 0 && userInputValidation > 4) {
                        System.out.println("Please enter a number between 1 and 4");
                        userInputValidation = myScanner.nextInt();   
                    }
                    userInputValidation = myScanner.nextInt();
                } while (userInputValidation <= 0 && userInputValidation > 4);
                {
                    userInputValidation = myScanner.nextInt();
                    switch (userInputValidation) {
                        case 1:
                            if(alCapone.gettingCaught(firstCity,cities, alCapone))
                            {
                                //Refer to gettingCaught() in Smuggler
                            }
                            else {
                                firstCity.travel();
                            }
                            break;
                        case 2:
                            if(alCapone.gettingCaught(secondCity,cities, alCapone))
                            {
                                //Refer to gettingCaught() in Smuggler
                            }
                            else {
                                secondCity.travel();
                            }
                            break;
                        case 3:
                            if(alCapone.gettingCaught(firstCity,cities, alCapone))
                            {
                                //Refer to gettingCaught() in Smuggler
                            }
                            else {
                                thirdCity.travel();
                            }
                            break;
                        case 4:
                            if(alCapone.gettingCaught(fourthCity,cities, alCapone))
                            {
                                //Refer to gettingCaught() in Smuggler
                            }
                            else {
                                fourthCity.travel();
                            }
                            break;
                    }
                }


                System.out.println("You're in front of us for what now.. Business? \nPress Y to buy, or N to offer us what you smuggled. Our prices as always. If not S is for Safehouse.");
                userInput = myScanner.next();
                userInput = (userInput).toUpperCase();
                switch (userInput) {
                    case "Y":
                        do {
                            System.out.println("Which item would you be interested to buy?");
                            System.out.println("1: White Powder\n" + "2: Blue Crystal\n" + "3: Russian Drink\n" + "4: False Passport\n" + "5: Suspicious Package");
                            if (!myScanner.hasNextInt()) {
                                System.out.println("Pick your poison then. Enter a number between 1 and 5");
                            }
                        }
                        while (userInputValidation <= 0 && userInputValidation > 5 && userInput == "Y");
                    {
                        userInputValidation = myScanner.nextInt();
                        switch (userInputValidation) {
                            case 1:
                                System.out.println("Tell us how many, I bet you understand we can supply..\nChoose how many to buy :");
                                userInputValidation = myScanner.nextInt();
                                firstItem.setAmountTransaction(userInputValidation);
                                firstItem.buyItem(alCapone);
                                break;
                            case 2:
                                System.out.println("Tell us how many, I bet you understand we can supply..\nChoose how many to buy :");
                                userInputValidation = myScanner.nextInt();
                                secondItem.setAmountTransaction(userInputValidation);
                                secondItem.buyItem(alCapone);
                                break;
                            case 3:
                                System.out.println("Tell us how many, I bet you understand we can supply..\nChoose how many to buy :");
                                userInputValidation = myScanner.nextInt();
                                thirdItem.setAmountTransaction(userInputValidation);
                                thirdItem.buyItem(alCapone);
                                break;
                            case 4:
                                System.out.println("Tell us how many, I bet you understand we can supply..\nChoose how many to buy :");
                                userInputValidation = myScanner.nextInt();
                                fourthItem.setAmountTransaction(userInputValidation);
                                fourthItem.buyItem(alCapone);
                                break;
                            case 5:
                                System.out.println("Tell us how many, I bet you understand we can supply..\nChoose how many to buy :");
                                userInputValidation = myScanner.nextInt();
                                fifthItem.setAmountTransaction(userInputValidation);
                                fifthItem.buyItem(alCapone);
                                break;
                        }
                    }
                    break;

                    case "N":
                        System.out.println("Tough guy got it all huh. Let's see it then smuggler..");
                        do {
                            System.out.println("Which item would you be interested to sell?");
                            System.out.println("1: White Powder\n" + "2: Blue Crystal\n" + "3: Russian Drink\n" + "4: False Passport\n" + "5: Suspicious Package");
                            while (!myScanner.hasNextInt()) {
                                System.out.println("You better sell us the good stuff, we have police on payroll. You can't hide. Enter a number between 1 and 5");
                            }
                        }
                        while (userInputValidation <= 0 && userInputValidation > 5 && userInput == "N");
                        userInputValidation = myScanner.nextInt();
                        switch (userInputValidation) {
                            case 1:
                                System.out.println("Tell us how many, I bet you understand we can supply..\nChoose how many to sell :");
                                userInputValidation = myScanner.nextInt();
                                firstItem.setAmountTransaction(userInputValidation);
                                firstItem.sellItem(alCapone);
                                break;
                            case 2:
                                System.out.println("Tell us how many, I bet you understand we can supply..\nChoose how many to sell :");
                                userInputValidation = myScanner.nextInt();
                                secondItem.setAmountTransaction(userInputValidation);
                                secondItem.sellItem(alCapone);
                                break;
                            case 3:
                                System.out.println("Tell us how many, I bet you understand we can supply..\nChoose how many to sell :");
                                userInputValidation = myScanner.nextInt();
                                thirdItem.setAmountTransaction(userInputValidation);
                                thirdItem.sellItem(alCapone);
                                break;
                            case 4:
                                System.out.println("Tell us how many, I bet you understand we can supply..\nChoose how many to sell :");
                                userInputValidation = myScanner.nextInt();
                                fourthItem.setAmountTransaction(userInputValidation);
                                fourthItem.sellItem(alCapone);
                                break;
                            case 5:
                                System.out.println("Tell us how many, I bet you understand we can supply..\nChoose how many to sell :");
                                userInputValidation = myScanner.nextInt();
                                fifthItem.setAmountTransaction(userInputValidation);
                                fifthItem.sellItem(alCapone);
                                break;
                        }
                        break;

                    case "S":
                        System.out.println("Safe travels are ever rarer. Make sure to continue moving smart.");
                        do {
                            System.out.println("King's weren't ever pawns but every kingpin's journey starts somewhat similar to yours.\n" +
                                    "\nStand your ground and choose between the following: \n1: Buy\n2: Sell\n3: Inventory\n4: Travel");
                            while (!myScanner.hasNextInt()) {
                                System.out.println("You ought to continue on this trajectory. Either jail, death or glory awaits you. Enter a number between 1 and 5");
                            }
                        }
                        while (userInputValidation <= 0 && userInputValidation > 5 && userInput == "S");
                    {
                        userInputValidation = myScanner.nextInt();
                        switch (userInputValidation) {
                            case 1:
                                do {
                                    System.out.println("Which item would you be interested to buy?");
                                    System.out.println("1: White Powder\n" + "2: Blue Crystal\n" + "3: Russian Drink\n" + "4: False Passport\n" + "5: Suspicious Package");
                                    if (!myScanner.hasNextInt()) {
                                        System.out.println("Pick your poison then. Enter a number between 1 and 5");
                                    }
                                }
                                while (userInputValidation <= 0 && userInputValidation > 5 && userInput == "S");
                            {
                                userInputValidation = myScanner.nextInt();
                                switch (userInputValidation) {
                                    case 1:
                                        System.out.println("Tell us how many, I bet you understand we can supply..\nChoose how many to buy :");
                                        userInputValidation = myScanner.nextInt();
                                        firstItem.setAmountTransaction(userInputValidation);
                                        firstItem.buyItem(alCapone);
                                        break;
                                    case 2:
                                        System.out.println("Tell us how many, I bet you understand we can supply..\nChoose how many to buy :");
                                        userInputValidation = myScanner.nextInt();
                                        secondItem.setAmountTransaction(userInputValidation);
                                        secondItem.buyItem(alCapone);
                                        break;
                                    case 3:
                                        System.out.println("Tell us how many, I bet you understand we can supply..\nChoose how many to buy :");
                                        userInputValidation = myScanner.nextInt();
                                        thirdItem.setAmountTransaction(userInputValidation);
                                        thirdItem.buyItem(alCapone);
                                        break;
                                    case 4:
                                        System.out.println("Tell us how many, I bet you understand we can supply..\nChoose how many to buy :");
                                        userInputValidation = myScanner.nextInt();
                                        fourthItem.setAmountTransaction(userInputValidation);
                                        fourthItem.buyItem(alCapone);
                                        break;
                                    case 5:
                                        System.out.println("Tell us how many, I bet you understand we can supply..\nChoose how many to buy :");
                                        userInputValidation = myScanner.nextInt();
                                        fifthItem.setAmountTransaction(userInputValidation);
                                        fifthItem.buyItem(alCapone);
                                        break;
                                }
                            }
                            break;
                            case 2:
                                System.out.println("Tough guy got it all huh. Let's see it then smuggler..");
                                do {
                                    System.out.println("Which item would you be interested to sell?");
                                    System.out.println("1: White Powder\n" + "2: Blue Crystal\n" + "3: Russian Drink\n" + "4: False Passport\n" + "5: Suspicious Package");
                                    while (!myScanner.hasNextInt()) {
                                        System.out.println("You better sell us the good stuff, we have police on payroll. You can't hide. Enter a number between 1 and 5");
                                    }
                                }
                                while (userInputValidation <= 0 && userInputValidation > 5 && userInput == "S");
                            {
                                userInputValidation = myScanner.nextInt();
                                switch (userInputValidation) {
                                    case 1:
                                        System.out.println("Offer up smuggler! You should know how we're banking..\nChoose how many to sell :");
                                        userInputValidation = myScanner.nextInt();
                                        firstItem.setAmountTransaction(userInputValidation);
                                        firstItem.sellItem(alCapone);
                                        break;
                                    case 2:
                                        System.out.println("Offer up smuggler! You should know how we're banking..\nChoose how many to sell :");
                                        userInputValidation = myScanner.nextInt();
                                        secondItem.setAmountTransaction(userInputValidation);
                                        secondItem.sellItem(alCapone);
                                        break;
                                    case 3:
                                        System.out.println("Offer up smuggler! You should know how we're banking..\nChoose how many to sell :");
                                        userInputValidation = myScanner.nextInt();
                                        thirdItem.setAmountTransaction(userInputValidation);
                                        thirdItem.sellItem(alCapone);
                                        break;
                                    case 4:
                                        System.out.println("Offer up smuggler! You should know how we're banking..\nChoose how many to sell :");
                                        userInputValidation = myScanner.nextInt();
                                        fourthItem.setAmountTransaction(userInputValidation);
                                        fourthItem.sellItem(alCapone);
                                        break;
                                    case 5:
                                        System.out.println("Offer up smuggler! You should know how we're banking..\nChoose how many to sell :");
                                        userInputValidation = myScanner.nextInt();
                                        fifthItem.setAmountTransaction(userInputValidation);
                                        fifthItem.sellItem(alCapone);
                                        break;
                                }
                            }
                            break;
                            case 3:
                                System.out.println("At the moment you have " + alCapone.getItemsInInventory() + " total items in your inventory!");
                                System.out.println("Your total capital is " + alCapone.getMoney() + "k to fund your smuggling with.");
                                System.out.println("Your luck has helped you get away with " + alCapone.getBustedCount() + " times getting busted..\n" +
                                        "Which puts your current bribe to get away at : " + alCapone.getCurrentFine() + "k\n");
                                break;
                            case 4:
                                do {
                                    System.out.println("Which city woud you like to travel to? Use the numbers to travel");
                                    System.out.println("1: Mourreal\n2: Bumville\n3: Richtown\n4: Shawinigan");
                                    while (!myScanner.hasNextInt()) {
                                        System.out.println("Please enter a number between 1 and 4");
                                    }
                                }
                                while (userInputValidation <= 0 && userInputValidation > 4 && userInput == "S");
                            {
                                userInputValidation = myScanner.nextInt();
                                switch (userInputValidation) {
                                    case 1:
                                        if(alCapone.gettingCaught(firstCity, cities, alCapone))
                                        {
                                            //Refer to gettingCaught() in Smuggler
                                        }
                                        else {
                                            firstCity.travel();
                                        }
                                        break;
                                    case 2:
                                        if(alCapone.gettingCaught(secondCity, cities, alCapone))
                                        {
                                            //Refer to gettingCaught() in Smuggler
                                        }
                                        else {
                                            secondCity.travel();
                                        }
                                        break;
                                    case 3:
                                        if(alCapone.gettingCaught(thirdCity, cities, alCapone))
                                        {
                                            //Refer to gettingCaught() in Smuggler
                                        }
                                        else {
                                            thirdCity.travel();
                                        }
                                        break;
                                    case 4:
                                        if(alCapone.gettingCaught(fourthCity, cities, alCapone))
                                        {
                                            //Refer to gettingCaught() in Smuggler
                                        }
                                        else {
                                            fourthCity.travel();
                                        }
                                        break;
                                }
                                break;
                            }
                            case 5:
                                //View Current City unimplemented
                                break;
                        }
                        break;
                    }
                }
            }
        }
    }