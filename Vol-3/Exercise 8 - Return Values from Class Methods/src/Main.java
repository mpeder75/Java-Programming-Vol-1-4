public class Main {
    /*
    We will continue working with the groceryStore class that we created in a previous exercise.

    Modify the code from the previous exercise so that the grossRevenue method
    in the groceryStore class calculates the gross revenue and returns the answer to the caller.

    Using this arrangement, calculate the gross revenue of the Houston, Seattle, and Qrlando Stores and print the results to the screen using print statements in the main method.

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

        // Her kaldes grossRevenue method i en print, for Houston Objektet
        System.out.println("Houston revenue is: $" + houstonStore.grossRevenue());

        // Anden måde, men hvor man benytter variabler til at gemme det der returneres, også printe variabel
        double revenueSeattle, revenueOrlando;
        revenueSeattle = seattleStore.grossRevenue();
        revenueOrlando = orlandoStore.grossRevenue();
        System.out.println("\nSeattle revenue is: $" + revenueSeattle);
        System.out.println("\nOrlando revenue is: $" + revenueOrlando);
    }
}

class groceryStore {
    int numberOfApples;
    double retailPriceApples;
    int numberOfOranges;
    double retailPriceOranges;

    // grossRevenue method der returnere en double
    double grossRevenue() {

        double revenue = (numberOfApples * retailPriceApples) + (numberOfOranges * retailPriceOranges);
        return revenue;
    }
}
