public class Main {
    public static void main(String[] args) {

        aircraft cessna172 = new aircraft();
        aircraft piperSaratoga = new aircraft();

        cessna172.passengers = 4;
        cessna172.cruiseSpeed = 140;
        cessna172.fuelBurnRate = 9.5;
        cessna172.fuelCapacity = 56.5;

        piperSaratoga.passengers = 6;
        piperSaratoga.cruiseSpeed = 201;
        piperSaratoga.fuelCapacity = 102.5;
        piperSaratoga.fuelBurnRate = 20.5;

        // her kaldes metoden calculateEndurance på cessna172 objektet (man kalder metoden med cessna172 værdier)
        cessna172.calculateEndurance();
        piperSaratoga.calculateEndurance();
    }
}

class aircraft {
    int passengers;
    int cruiseSpeed;
    double fuelCapacity;
    double fuelBurnRate;

    // method der beregner endurance, med class variabler, som gemmes i endurance variabel, som printer resultatet
    // grunden til method kun er void, er den ikke returner noget
    void calculateEndurance() {

        double endurance = fuelCapacity / fuelBurnRate;
        System.out.println("Endurance is " + endurance);
    }
}