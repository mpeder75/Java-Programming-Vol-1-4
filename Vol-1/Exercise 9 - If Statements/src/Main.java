public class Main {
    public static void main(String[] args) {

        /*
        Car1 has milage 86000 Car2 has mialge 101000.

        Write a program that uses IF statements and output the following:

        IF Car1 milage is less than or equal to car2, output, "Car1 milage is less than or equal to Car2"
        IF Car2 has milage of 101000, output, "Car2 has milage of 101000"
        IF Car2 has milage less than Car1, output, "I will eat my foot if this prints to the screen"
        */

        int car1 = 86000;
        int car2 = 101000;

        if (car1 <= car2) System.out.println("Car1 milage is less than or equal to Car 2");
        if (car2 == 101000) System.out.println("Car2 has milage of " + car2);
        if (car2 < car1) System.out.println("I will eat my foot if this prints rto the screen");
    }
}