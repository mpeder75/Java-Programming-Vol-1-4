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

        // 1. class method fuelNeeded invokes med argumentet 3
        System.out.println("For cessna172 to fly for 3 hours, it takes: " + cessna172.fuelNeeded(3));
    }
}


class aircraft {
    int passengers;
    int cruiseSpeed;
    double fuelCapacity;
    double fuelBurnRate;

    double calculateEndurance() {
        double endurance = fuelCapacity / fuelBurnRate;
        return endurance;
    }

    // 2. fuelNeeded method bliver kaldt hvor den får en double passed fra main method.
    //    method bruger så class member fuelBurnRate til at beregne fuelNeeded,
    //    og returnere resultatet som en double.
    double fuelNeeded(double time) {

        return fuelBurnRate * time;
    }
}