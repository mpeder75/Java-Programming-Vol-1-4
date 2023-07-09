import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1. Opret et scanner objekt "scanner" som assigns nyt scanner objekt, der læser fra System.in
        Scanner scanner = new Scanner(System.in);

        // 2. variabel der opbevare input fra keyboard
        int test;

        // 3. Prompt at der skal inputtes en integer
        System.out.println("Enter any integer: ");

        // 4. Keyboard input aflæses, og gemmes i variabel
        test = scanner.nextInt();

        // 5. Variabel printes
        System.out.println("You entered : " + test);
/*



        // ----- Eksempel: aflæse tal fra keyboard og gange det med 10 ------ //

        Scanner keyboard = new Scanner(System.in);

        int myTest, number;

        System.out.println("Enter any Integer ");
        myTest = keyboard.nextInt();

        number = myTest * 10;

        System.out.println("You entered: " + myTest + " and multiplied by 10 is : " + number );



        // ----- Eksempel: aflæse flere tal fra keyboard ------ //

        Scanner scanner = new Scanner(System.in);

        int test;

        System.out.println("Enter a Integer ");
        test = scanner.nextInt();
        System.out.println("You entered the number: " + test );

        System.out.println("\nEnter another Integer ");
        test = scanner.nextInt();
        System.out.println("You entered the number: " + test );


        // ----- Eksempel: aflæse decimal tal fra keyboard ------ //

        Scanner scanner = new Scanner(System.in);

        int integerNumber;
        double doubleNumber;

        // Integer aflæses, og printes
        System.out.println("Enter any Integer ");
        integerNumber = scanner.nextInt();
        System.out.println("You entered: " + integerNumber);

        // double aflæses og printes
        System.out.println("\nEnter any double ");
        doubleNumber = scanner.nextDouble();
        System.out.println("You entered the decimal: " + doubleNumber);


        // ----- Sikre at der indtastes korrekt datatype ------ //

        Scanner scanner = new Scanner(System.in);

        int integerNumber = 0;

        System.out.println("Enter any Integer ");

        // Hvis det der er indtastet er en int
        if (scanner.hasNextInt() == true)
        {
            integerNumber = scanner.nextInt(); // aflæses input og gemmes i variabel
        }

        System.out.println("You entered: " + integerNumber);


 */

    }
}