public class Main {
    public static void main(String[] args) {

        /*
        Lightspeed is 186,282 miles per second.
        Write a program to calculate how far a lightbeam will travel after 300 minutes
        and output the result to the screen, both in miles anf in kilometers.
        Note that the answer will need to be held in a "long" variable.

         */

        long lightSpeed = 186282L;

        Long lightBeamMiles = (lightSpeed * 60) * 300;

        Long lightBeamKilometers = (long)(lightSpeed *  1.609344 * 60) * 300;

        System.out.println("The distance is " + lightBeamMiles + " miles per second");
        System.out.println("The distance is " + lightBeamKilometers + " kilometers per second");


    }
}