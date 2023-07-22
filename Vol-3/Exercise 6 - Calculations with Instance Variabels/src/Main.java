public class Main {

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

        // Her beregnes gross revenue, og gemmes i variablen grossRevenueHouston
        double grossRevenueHouston = (houstonStore.numberOfApples * houstonStore.retailPriceApples) +
                (houstonStore.numberOfOranges * houstonStore.retailPriceOranges);
        System.out.println("Revenue for the Houston Store is: " + grossRevenueHouston);

        double grossRevenueSeattle = (seattleStore.numberOfApples * seattleStore.retailPriceApples) +
                (seattleStore.numberOfOranges * seattleStore.retailPriceOranges);
        System.out.println("Revenue for the Seattle Store is: " + grossRevenueSeattle);

        double grossRevenueOrlando = (orlandoStore.numberOfApples * orlandoStore.retailPriceApples) +
                (orlandoStore.numberOfOranges * orlandoStore.retailPriceOranges);
        System.out.println("Revenue for the Orlando Store is: " + grossRevenueOrlando);
    }
}


class groceryStore {
    int numberOfApples;
    double retailPriceApples;
    int numberOfOranges;
    double retailPriceOranges;
}

