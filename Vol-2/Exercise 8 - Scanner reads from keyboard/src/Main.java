import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /*
       Write a program to read in the two lengths of the sides of a rectangle as follows:

       Enter the length of the rectangle:
       Enter the width of the rectangle:

       Using these inputs, calculate the perimeter of the rectangle AND its area .

       Output as follows:

       The perimeter of this rectangle is: [answer]
       The area of this rectangle is: [answer]
        */

        double length = 0;
        double width = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Width of rectangle: ");
        if (scanner.hasNextDouble() == true)
        {
            width = scanner.nextDouble();
        }

        System.out.println("Enter length of rectangle: ");
        if (scanner.hasNextDouble() == true)
        {
            length = scanner.nextDouble();
        }

        double perimeter = 2*(length + width);
        double area = length * width;

        System.out.println("perimeter is = " + perimeter);
        System.out.println("Area = " + area);
    }
}