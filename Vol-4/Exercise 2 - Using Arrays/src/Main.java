public class Main {
    /*
    Declare and initialize an array of type double named dailyTemp, which will have 7 elements.
    This array holds the high temperature recorded on 7 days of a given week.
    Initialize the array to the following data when you declare the array.

    87.5
    90.0
    91.2
    88.8
    88.6
    87.5
    89.2

    Next, print out this data to the screen by accessing the elements and
    using System.out .println();
    */

    public static void main(String[] args) {

        double dailyTemp[] = {87.5, 90.0, 91.2, 88.8, 88.6, 87.5, 89.2};

        System.out.println("Monday the temperature is: " + dailyTemp[0]);
        System.out.println("Tuesday the temperature is: " + dailyTemp[1]);
        System.out.println("Wednesday the temperature is :" + dailyTemp[2]);
        System.out.println("Thursday the temperature is: " + dailyTemp[3]);
        System.out.println("Friday the temperature is: " + dailyTemp[4]);
        System.out.println("Saturday the temperature is: " + dailyTemp[5]);
        System.out.println("Sunday the temperature is: " + dailyTemp[6]);
    }
}