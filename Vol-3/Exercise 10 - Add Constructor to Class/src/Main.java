public class Main {

    /*
    Copy past the code from the previous exercise to define the groceryStore Class.
    ALTER the groceryStore Class to add a constructor that take information
    on apples and oranges and assign these numbers to the instance variables.

    Then, call the method grossRevenue and use it to print out the revenue for each store

    Next, call the method appleRevenueTarget with a value of for each of $1000 for each of the three stores

    Finally, call the method orangeRevenueTarget With a value of $800 for each of the three stores
    */

    public static void main(String[] args) {

        groceryStore houstonStore = new groceryStore(534, 429, 0.99, 0.87);
        groceryStore seattleStore = new groceryStore(765, 429, 0.86, 0.91);
        groceryStore orlandoStore = new groceryStore(402, 398, 0.77, 0.79);

        System.out.println("Gross revenue for Houston is: $" + houstonStore.grossRevenue());
        System.out.println("Gross revenue for Seattle is: $" + seattleStore.grossRevenue());
        System.out.println("Gross revenue for Orlando is: $" + orlandoStore.grossRevenue());

        System.out.println("\nTo earn $1000 on apples Houston must sell: " + (int)houstonStore.appleRevenueTarget(1000) + " pieces 🍎");
        System.out.println("To earn $1000 on apples Seattle must sell: " + (int)seattleStore.appleRevenueTarget(1000) + " pieces 🍎");
        System.out.println("To earn $1000 on apples Orlando must sell: " + (int)orlandoStore.appleRevenueTarget(1000) + " pieces 🍎");

        System.out.println("\nTo earn 800 on oranges, Houston must sell: " + (int)houstonStore.orangeRevenueTarget(800) + " pieces 🍊");
        System.out.println("To earn $80 on oranges, Seattle must sell: " + (int)seattleStore.orangeRevenueTarget(800) + " pieces 🍊");
        System.out.println("To earn $800 on oranges, Orlando must sell: " + (int)orlandoStore.orangeRevenueTarget(800) + " pieces 🍊");

    }
}

class groceryStore {
    int numberOfApples;
    int numberOfOranges;
    double retailPriceApples;
    double retailPriceOranges;

    // Constructor, der haar 4 parametre, der har samme datatype og rækkefølge som instans variabel ovenfor
    // Constructor vil instantiere objekt og instans variable, med de værdier der bliver passed til den
    groceryStore(int numA, int numO, double retailA, double retailO) {
        numberOfApples = numA;
        numberOfOranges = numO;
        retailPriceApples = retailA;
        retailPriceOranges = retailO;
    }

    double grossRevenue() {
        double revenue = (numberOfApples * retailPriceApples) + (numberOfOranges * retailPriceOranges);
        return revenue;
    }

    double appleRevenueTarget(double target) {
        return target / retailPriceApples;
    }

    double orangeRevenueTarget(double target) {
        return target / retailPriceOranges;
    }
}
