import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String grade = "A";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your grade: ");

        if (scanner.hasNext() == true)
        {
            grade = scanner.next();
        }

        if (grade.equals("A")) {
            System.out.println("You earned a A, Fantastic job");
        } else if (grade.equals("B")) {
            System.out.println("You earned a B, Good job");
        } else if (grade.equals("C")){
            System.out.println("You earned a C, you are a average student");
        } else if (grade.equals("D")){
            System.out.println("You got a D, room for improvement");
        } else {
            System.out.println("You got as F, you failed 🤧");
        }

        scanner.close();
    }
}