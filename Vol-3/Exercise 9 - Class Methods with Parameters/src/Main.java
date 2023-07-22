public class Main {

    /*
    instantiate the objects for houston, seattle orlando stores, and assign values to the member variables for these stores.

    Add a two new methods to groceryStore class as follows:

    appleRevenueTarget:
    This method takes as an argument the target revenue we'd like to make just by selling apples.
    The method calculates how many apples we need to sell to meet our target, and
    returns this answer to the caller.

    orangeRevenueTarget:
    This method takes as an argument the target revenue we 'd like to make just by selling oranges.
    The method calculates how many oranges we need to sell to meet our target,  and
    returns this answer to the caller.

    In the main method, use these methods, to print the following info to the screen

    How many oranges are needed to earn $1050 for the Houston store.
    How many oranges are needed to arn $620 for the Seattle store.
    How many apples are needed to earn $744 for the Olando store.
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

        System.out.println("Houston needs to sell: " + houstonStore.appleRevenueTarget(1050) + " to earn $1050");
        System.out.println("Seattle needs to sell: " + seattleStore.orangeRevenueTarget(620) + " to earn $620");
        System.out.println("Orlando needs to sell: " + orlandoStore.appleRevenueTarget(744) + " to earn $744");

    }
}

class groceryStore {
    int numberOfApples;
    double retailPriceApples;
    int numberOfOranges;
    double retailPriceOranges;

    double grossRevenue() {
        double revenue = (numberOfApples * retailPriceApples) + (numberOfOranges * retailPriceOranges);
        return revenue;
    }
// method appleRevenueTarget der tager en double target som parameter, og beregner revenue som returneres som en double
    double appleRevenueTarget (double target) {
        return  target / retailPriceApples;
    }

// method orangeRevenueTarget der tager en double target som parameter, og beregner revenue som returneres som en double
    double orangeRevenueTarget (double target) {
        return target / retailPriceOranges;
    }
}
