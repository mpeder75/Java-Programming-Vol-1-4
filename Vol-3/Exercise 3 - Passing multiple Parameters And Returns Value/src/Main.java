import java.util.Scanner;

public class Main {

    /*
    In the main method, ask the user to separately input three grades from 0 to 100.

    Since these are vales they should be stored as double values,
    create a method that will take these 3 grades and average them (add them up and divide by 3)
    The method then the answer to the main method and the answer
    is displayed to the user.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input grade 1 (0 to 100 points): ");
        double grade1 = scanner.nextDouble();

        System.out.println("Input grade 2 (0 to 100 points): ");
        double grade2 = scanner.nextDouble();

        System.out.println("Input grade 3 (0 to 100 points): ");
        double grade3 = scanner.nextDouble();

        double myAverageGrade = averageGrade(grade1, grade2, grade3);

        if (myAverageGrade >= 93) {
            System.out.println("You got Grade A based on points averaged at: " + myAverageGrade);
        } else if ((myAverageGrade >= 83) && (myAverageGrade <= 86)) {
            System.out.println("You got Grade B based on points averaged at: " + myAverageGrade);
        } else if ((myAverageGrade >= 73) && (myAverageGrade <= 76)) {
            System.out.println("You got Grade C based on points averaged at: " + myAverageGrade);
        } else if ((myAverageGrade >= 63) && (myAverageGrade <= 66)) {
            System.out.println("You got Grade D based on points averaged at: " + myAverageGrade);
        } else if (myAverageGrade < 63) {
            System.out.println("You suck");
        }
    }


    public static double averageGrade(double a, double b, double c)
    {
        return (a + b + c) / 3;
    }
}

