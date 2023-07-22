public class Main {

    /*
    We will continue working with the groceryStore class that we created in a previous exercise.

    Copy/paste the code from the previous example to define the class, create
    the objects for the grocery store, and store values into each object variable.

    Create a method named grossRevenue and add it to the groceryStore class that calculates
    the gross revenue of the store, then printing the results to the screen.

    Back in the main method, call the grossRevenue method for each of the three stores (Houston, Seattle, Orlando)

    In the end, we'd like to see the gross revenue of each store printed on the screen.
     */

    public static void main(String[] args) {

        groceryStore houstonStore = new groceryStore();
        groceryStore seattleStore = new groceryStore();
        groceryStore orlandoStore = new groceryStore();

        houstonStore.numberOfApples = 534;
        houstonStore.retailPriceApples = 0.99;
        houstonStore.numberOfOranges = 429;
        houstonStore.retailPriceOranges = 0.87;

        seattleStore.numberOfApples = 765;
        seattleStore.retailPriceApples = 0.86;
        seattleStore.numberOfOranges = 842;
        seattleStore.retailPriceOranges = 0.91;

        orlandoStore.numberOfApples = 402;
        orlandoStore.retailPriceApples = 0.77;
        orlandoStore.numberOfOranges = 398;
        orlandoStore.retailPriceOranges = 0.79;

        // Her kaldes grossRevenue method i en print (for at få navnet med)
        System.out.println("Houston Store:");
        houstonStore.grossRevenue();
        System.out.println("\nSeattle Store:");
        seattleStore.grossRevenue();
        System.out.println("\nOrlando Store:");
        orlandoStore.grossRevenue();
    }
}

class groceryStore {
    int numberOfApples;
    double retailPriceApples;
    int numberOfOranges;
    double retailPriceOranges;

    // grossRevenue method
    void grossRevenue() {

        double revenue = (numberOfApples * retailPriceApples) + (numberOfOranges*retailPriceOranges);
        System.out.println("The revenue for the store is: $" + revenue);
    }
}

