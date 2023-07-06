public class Main {
    public static void main(String[] args) {
     /*
     A sail is triangular, and has the height of 14 ft.
     The length of the base of the flag is 6 ft.

     The formula for area of a triangle is:
     Area  =  base*height/2

     Write a program that calculates the area of this sail and display the result.
     */

        int height = 14;
        int base = 6;

        int areaSail = base*(height/2);

        System.out.println("Area of the sail is " + areaSail + " square feet");
    }
}