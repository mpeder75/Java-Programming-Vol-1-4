public class Main {
    public static void main(String[] args) {

        int num1 = 11;
        int num2 = 7;
        int num3 = 10;

        int answer1;
        int answer2;
        int answer3;
        boolean answer4;


        // method 1 kaldes med 1 argument, method returnere nu 11*7 hertil, som gemmes i variablen answer1
        answer1 = multNumbers(num1);
        System.out.println("When multiplying " + num1 + " and 7 the result is: " +  answer1);

        // method 2 kaldes med 2 argumenter, method returnere nu 11 + 7 hertil, som gemmes i variablen answer2
        answer2 = addNumbers(num1, num2);
        System.out.println("When adding " + num1 + " and " + num2 + " the result is: " + answer2);

        // method 3 kaldes med 3 argumenter, method returnere nu 11-7-10 hertil, som gemmes i variablen answer3
        answer3 = subNumbers(num1, num2, num3);
        System.out.println("When subtracting " + num1 + " and " + num2 + " and " + num3 + " the result is: " + answer3);

        // method 4 kaldes med 2 argumenter, method returnere om num1 og num2 er ens, resultat gemmes i variable answer4
        answer4 = equalNumbers(num1, num2);
        System.out.println("When comparing if " + num1 + " is equal to " + num2 + " the result is " + answer4);
    }


    // method 1, der tager 1 parameter, som ganges med 7
    public static int multNumbers(int a) {
        return (a * 7);
    }

    // method 2, der tager 2 parametre, som bliver lagt sammen og returneret
    public static int addNumbers (int a, int b) {
        return (a + b);
    }

    // method 3, der tager 3 parametre, som bliver trukket fra hinanden og returneret
    public static int subNumbers (int a, int b, int c) {
        return (a-b-c);
    }

    // method 4, tager 2 parametre, som bliver sammenlignet boolsk og svaret returneres
    public static boolean equalNumbers (int a, int b) {

       if (a == b) return true; return false;
    }
}

