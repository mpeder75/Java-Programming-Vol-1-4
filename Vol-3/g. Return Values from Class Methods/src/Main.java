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

        // Her kaldes cesna172.calculateEndurance inde i en print statement
        System.out.println("Cessna 172 endurance is: " + cessna172.calculateEndurance());

        // ELLER, Her declares en variabel og assigner den til piperSaratoga.calculateEndurance()
        double piperSaratogaEndurance = piperSaratoga.calculateEndurance();
        System.out.println(piperSaratogaEndurance);
    }
}

class aircraft {
    int passengers;
    int cruiseSpeed;
    double fuelCapacity;
    double fuelBurnRate;

    // method der beregner endurance som gemmes i endurance variablen, der returneres til sidst som en double
    double calculateEndurance() {

        double endurance = fuelCapacity / fuelBurnRate;

        return endurance;
    }
}

