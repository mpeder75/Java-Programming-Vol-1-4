public class Main {
    public static void main(String[] args) {


        // ------ Eksempel med chars ------//

        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("You made a A, excellent job");
                break;
            case 'B':
                System.out.println("You made a B, good job");
                break;
            case 'C':
                System.out.println("You made a C, you did OK");
                break;
            case 'D':
                System.out.println("You made a D, room for improvement");
                break;
            case 'F':
                System.out.println("You made a F, you failed");
                break;
            default:
                System.out.println("Only A, B, C, D, F valid");
                break;
        }


        // ------ Eksempel med integers ------//

        int numSiblings = 1;

        switch (numSiblings) {
            case 0:
                System.out.println("You have zero siblings");
                break;
            case 1:
                System.out.println("You have one siblings");
                break;
            case 2:
                System.out.println("You have two siblings");
                break;
            case 3:
                System.out.println("You have three siblings");
                break;
            case 4:
                System.out.println("You have four siblings");
                break;
            default:
                System.out.println("You have to many siblings to count ");
        }


    }
}