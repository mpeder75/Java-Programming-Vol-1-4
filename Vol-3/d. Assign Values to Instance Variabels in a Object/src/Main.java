public class Main {

    public static void main(String[] args) {

        // her oprettes en instans af aircraft kaldt cessna172, som assignes et nyt aircraft objekt
        aircraft cessna172 = new aircraft();
        aircraft piperSaratoga = new aircraft();

        // Her assignes cesna172 objektet, med instans variabel værdier
        cessna172.passengers = 4;
        cessna172.cruiseSpeed = 140;
        cessna172.fuelBurnRate = 9.5;
        cessna172.fuelCapacity = 56.5;
        System.out.println("Cesena 172 passengers: " + cessna172.passengers);
        System.out.println("Cessna 172 fuel burn rate: " + cessna172.fuelBurnRate);

        piperSaratoga.passengers = 6;
        piperSaratoga.cruiseSpeed = 201;
        piperSaratoga.fuelCapacity = 102.5;
        piperSaratoga.fuelBurnRate = 20.5;

        System.out.println("\nPiper Saratoga Cruise Speed: " + piperSaratoga.cruiseSpeed + " mph");
    }
}

class aircraft {
    int passengers;
    int cruiseSpeed;
    double fuelCapacity;
    double fuelBurnRate;
}
