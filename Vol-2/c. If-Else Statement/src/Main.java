import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int score = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter exam score: ");
        score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("You scored a " + score + " on the exam");
            System.out.println("Great job om the exam!");
            System.out.println("I like ice cream 🍨 ");
        } else if (score >= 70 && score <90 ) {
            System.out.println("You scored a " + score + " on the exam");
            System.out.println("You did OK on the exam");
            System.out.println("I like oranges 🍊");
        } else {
            System.out.println("You did poorly, ET go home 👽");
        }

    }
}