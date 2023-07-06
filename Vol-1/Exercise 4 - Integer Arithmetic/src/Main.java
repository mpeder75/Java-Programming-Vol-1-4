public class Main {
    public static void main(String[] args) {
      /*
      A rectangular wall has dimensions 23 ft. x 12 ft.
      Write a program to calculate the area of the wall and display the result as:

      The area of the wall is <calculated answer> square feet .
       */

        int side1 = 23;
        int side2 = 12;

        int wallArea = side1 * side2;

        System.out.println("The area of the wall is " + wallArea + " square feet");

    }
}