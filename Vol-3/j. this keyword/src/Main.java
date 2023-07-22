public class Main {
    public static void main(String[] args) {

        aircraft cessna172 = new aircraft(4, 140, 9.5, 56.5);
        aircraft piperSaratoga = new aircraft(6, 201, 102.5, 20.5);
    }
}

class aircraft {
    int passengers;
    int cruiseSpeed;
    double fuelCapacity;
    double fuelBurnRate;

    aircraft(int p, int c, double fc, double fbr) {
        this.passengers = p;
        this.cruiseSpeed = c;
        this.fuelCapacity = fc;
        this.fuelBurnRate = fbr;
    }

    double calculateEndurance() {
        double endurance = fuelCapacity / fuelBurnRate;
        return endurance;
    }

    double fuelNeeded(double time) {
        return this.fuelBurnRate * time;
    }
}


/*
this keyword er en reference til class instans variable - det er IKKE mere kompliceret

    this.fuelBurnRate kan også bare skrives som fuelBurnRate
 */