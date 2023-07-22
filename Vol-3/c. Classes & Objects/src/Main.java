public class Main {

    public static void main(String[] args) {

        // 2. opretter en instance af aircraft
        /*
        1. Aircraft cesna127 - Declare en variabel 'casna127' af typen Aircraft
        2. new Aircraft(); - Denne opretter det nye objekt udfra aircraft class.
           new bruges til at allokere memory for objektet
        */

        aircraft cesna172 = new aircraft();


    }
}


// 1. Class Aircraft oprettes med karakteristika
class aircraft {
    int passengers;
    int cruiseSpeed;             // miles pr hour
    double fuelCapacity;         // gallons
    double fuelBurnRate;         // gallons per hou
}