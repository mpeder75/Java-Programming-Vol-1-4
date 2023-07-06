public class Main {
    public static void main(String[] args) {
       /*
       Write a program to convert 34.0 degrees Celcius to Farenheit,
       then print the result on the screen.

        The equation for the conversion is:
        fahrenheit = (9/5) * celsius + 32
        */

        double celsius = 34d;

        double celsiusToFahrenheit = (9/5) * celsius + 32;

        System.out.println(celsius + " converted to fahrenheit is " + celsiusToFahrenheit + " 😎");
    }
}

