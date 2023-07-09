import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    /*
    Write a program that asks what grade a student received on an exam.
    Using an if-else-if ladder, output the following:

    If grade falls between:	        Output:
    Greater than or equal to 90	    You earned a A on the exam!
    Between 80 and 90 	            You earned a B on the exam!
    Between 70 and 80 	            You earned a C on the exam!
    Between 60 and 70 	            You earned a D on the exam!
    Less than 60 	                You earned a F on the exam!

    */

        int grade = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your exam points" );

        if (scanner.hasNext())
        {
            grade = scanner.nextInt();
        }

        if (grade >= 90) {
            System.out.println("You earned a A on the exam! ´");
        } else if (grade >= 80 && grade <90) {
            System.out.println("You earned a B on the exam!");
        } else if (grade >= 70 && grade < 80) {
            System.out.println("You earned a C on the exam!");
        } else if (grade >= 60 && grade <70) {
            System.out.println("You earned a D on the exam!");
        } else {
            System.out.println("You earned a F on the exam!");
        }
    }
}