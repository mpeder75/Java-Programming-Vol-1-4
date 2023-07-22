public class Main {
    public static void main(String[] args) {

        // Instans af aircraft class kaldt cessna172 oprettes, som assigns et nyt objekt af typen aircraft,
        // hvor constructor bruger (4, 140, 9.5, 56.5) til at initialize instans variable
        aircraft cessna172 = new aircraft(4, 140, 9.5, 56.5);
        aircraft piperSaratoga = new aircraft(6, 201, 102.5, 20.5);
    }
}

class aircraft {

    // Instans variable/fields/member variabels
    int passengers;
    int cruiseSpeed;
    double fuelCapacity;
    double fuelBurnRate;

    // Constructor, der har 4 parametre, der har samme datatype og rækkefølge som instans variable
    // Constructor vil instance objektet og instans variable, med de værdier der bliver passet til den
    aircraft(int p, int c, double fc, double fbr) {
        passengers = p;
        cruiseSpeed = c;
        fuelCapacity = fc;
        fuelBurnRate = fbr;
    }

    double calculateEndurance() {
        double endurance = fuelCapacity / fuelBurnRate;
        return endurance;
    }

    double fuelNeeded(double time) {
        return fuelBurnRate * time;
    }
}