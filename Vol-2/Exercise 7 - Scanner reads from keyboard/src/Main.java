import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Write a program to ask the user to input the radius of a circle as a decimal number.
        Calculate the area of the circle using the formula:

        A = pi*r*r

        Output in the following way:
        "The radius Of the circle is (radius) meters.
        The area of the circle is [answer] Square meters."
         */


        double radius = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input radius of circle (in decimal): ");

        if (scanner.hasNextDouble() == true)
        {
            radius = scanner.nextDouble();
            System.out.println("The radius of the circle is " + radius);
        }

        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is " + area);



    }
}