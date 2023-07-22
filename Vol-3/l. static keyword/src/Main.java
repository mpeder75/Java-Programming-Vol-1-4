public class Main {
    public static void main(String[] args) {

        aircraft cessna172 = new aircraft(4, 140, 9.5, 56.5);
        aircraft piperSaratoga = new aircraft(6, 201, 102.5, 20.5);

        cessna172.setPassengers(10);

        aircraft.wings= 2;
        System.out.println("cessna172 now has: " + cessna172.wings + " wings");
        System.out.println("piper saratoga now has: " + piperSaratoga.wings +" wings");
    }
}

class aircraft {
    private int passengers;
    int cruiseSpeed;
    double fuelCapacity;
    double fuelBurnRate;
    static int wings;



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

    void setPassengers(int p) {
        if ((passengers > 0) && (passengers <= 10)) {
            this.passengers = p;
            System.out.println("New passenger amount: " + passengers);
        } else {
            System.out.println("Error setting passengers");
        }
    }
}

