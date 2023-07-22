public class Main {

    /*
    Add additional code to the last exercise dealing with the groceryStore class.
    Store values into the instance variables as follows:

    For the Houston Store:
    number of apples sold per year = 534
    retail price of each apple =  0.99
    number of oranges sold per year = 429
    retail price of each orange 0.87

    For the Seattle Store:
    number Of apples sold per year = 765
    retail price Of each apple = 0.86
    number Of oranges sold per year = 842
    retail price Of each orange = 0.91

    For the Orlando Store:
    number Of apples sold per year = 402
    retail price of each apple = 0.77
    number of oranges sold per year = 398
    retail price of each orange = 0.79

    Output all of this info for the Houston store to the screen in an organized way, for example:

    Houston Store:
    Apples sold - 534
    Apple retail cost - $0.99

    Oranges sold - 429
    Orange retail cost - $0. 87

     */

    public static void main(String[] args) {

        // objekter instancieres af typen groceryStore, med forskellige navne, som assignes et nyt groceryStor objekt
        groceryStore houstonStore = new groceryStore();
        groceryStore seattleStore = new groceryStore();
        groceryStore orlandoStore = new groceryStore();

        // Objekternes instans variable assignes værdier
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
        orlandoStore.retailPriceOranges = 0.70;

        // Her printes info om hver objekt
        System.out.println("Houston Store:\n" + "Apples sold = " + houstonStore.numberOfApples + "\n" +
                "Apple retail cost $" + houstonStore.retailPriceApples + "\n" + "Oranges sold = " + houstonStore.numberOfOranges + "\n" +
                "Orange retail cost $" + houstonStore.retailPriceOranges + "\n");

        System.out.println("Seattle Store:\n" + "Apples sold = " + seattleStore.numberOfApples + "\n" +
                "Apple retail cost $" + seattleStore.retailPriceApples + "\n" + "Oranges sold = " + seattleStore.numberOfOranges + "\n" +
                "Orange retail cost $" + seattleStore.retailPriceOranges + "\n");

        System.out.println("Orlando Store:\n" + "Apples sold = " + orlandoStore.numberOfApples + "\n" +
                "Apple retail cost $" + orlandoStore.retailPriceApples + "\n" + "Oranges sold = " + orlandoStore.numberOfOranges + "\n" +
                "Orange retail cost $" + orlandoStore.retailPriceOranges);
    }
}


class groceryStore {

    int numberOfApples;
    double retailPriceApples;
    int numberOfOranges;
    double retailPriceOranges;
}







