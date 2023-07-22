public class Main {
    /*
    You are a business owner who owns several grocery stores.
    All of your stores sell apples and oranges.

    Create a class called groceryStore. In this class, create 4 member variables
    for the following information. Use your own creative variable names.

    number of apples sold per year
    retail price of each apple, as a double
    number of oranges sold per year
    retail price of each orange, as a double

    Create 3 objects of the groceryStore class called:
    houstonStore
    seattleStore
    orlandoStore
    */

    public static void main(String[] args) {

        // Her oprette en instans a groceryStore kaldt houstonStore, som assignes et nyt groceryStore objekt
        groceryStore houstonStore = new groceryStore();

        groceryStore seattleStore = new groceryStore();
        groceryStore orlandoStore = new groceryStore();
    }
}

// class groceryStore definers, med 4 class members
class groceryStore {

    int numberOfApples;
    double retailPriceApples;
    int numberOfOranges;
    double retailPriceOranges;
}

