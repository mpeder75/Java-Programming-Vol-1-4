import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int favoriteMonth = 1;

        System.out.println("Enter your favorite month as a Integer (1 - 12): ");

        if (scanner.hasNextInt() == true)
        {
            favoriteMonth = scanner.nextInt();
        }

        switch (favoriteMonth) {

            case 1:  // if (favoriteMonth == 1)
                System.out.println("January is my favorite Month!");
                break;
            case 2:  // if (favoriteMonth == 2)
                System.out.println("February is my favorite Month!");
                break;
            case 3:
                System.out.println("March is my favorite Month!");
                break;
            case 4:
                System.out.println("April is my favorite Month!");
                break;
            case 5:
                System.out.println("May is my favorite Month!");
                break;
            case 6:
                System.out.println("June is my favorite Month!");
                break;
            case 7:
                System.out.println("July is my favorite Month!");
                break;
            case 8:
                System.out.println("August is my favorite Month!");
                break;
            case 9:
                System.out.println("September is my favorite Month!");
                break;
            case 10:
                System.out.println("October is my favorite Month!");
                break;
            case 11:
                System.out.println("November is my favorite Month!");
                break;
            case 12:
                System.out.println("December is my favorite Month!");
                break;
            default: // else {
                System.out.println("Number not corresponds to actual month");

        }

    }
}