public class Main {

    public static void main(String[] args) {

        aircraft cessna172 = new aircraft();
        aircraft piperSaratoga = new aircraft();

        // variabler der opbevare beregninger
        double cessna172Endurance;
        double piperEndurance;

        cessna172.passengers = 4;
        cessna172.cruiseSpeed = 140;
        cessna172.fuelBurnRate = 9.5;
        cessna172.fuelCapacity = 56.5;

        piperSaratoga.passengers = 6;
        piperSaratoga.cruiseSpeed = 201;
        piperSaratoga.fuelCapacity = 102.5;
        piperSaratoga.fuelBurnRate = 20.5;

        // Her beregnes hvor lang tid cessna 172 kan holde sig i luften, og gemmes i variablen cessna172Endurance
        cessna172Endurance = cessna172.fuelCapacity / cessna172.fuelBurnRate;
        System.out.println("A Cessna 172 can stay aloft for " + cessna172Endurance + " hours");

        piperEndurance = piperSaratoga.fuelCapacity / cessna172.fuelBurnRate;
        System.out.println("A Piper Saratoga can stay aloft for " + piperEndurance + " hours");
    }
}

class aircraft {
    int passengers;
    int cruiseSpeed;
    double fuelCapacity;
    double fuelBurnRate;
}
