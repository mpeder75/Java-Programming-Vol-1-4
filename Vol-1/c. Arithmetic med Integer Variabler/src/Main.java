public class Main {
    public static void main(String[] args) {

        // Variabler declares
        int num1, num2, num3, num4;

        // Variabler assignes
        num1 = 10;
        num2 = 3;
        num3 = 5;
        num4 = 2;

        // --------------- Addition --------------- //
        int sum = num1 + 5;
        System.out.println("num1 plus 5 = " + sum);


        // --------------- Subtraction --------------- //
        int difference = num3 - num2;
        System.out.println("diff between num2 & num3 = " + difference);


        // --------------- Multiply --------------- //
        int multiply = num1 * num4;
        System.out.println("num1 times num4 equal: " + multiply);


        // --------------- Divide --------------- //
        int divide = num1 / num3;
        System.out.println("num1 divided by num3 : " + divide);


        // --------------- Assign variabel ny værdi --------------- //
        System.out.println("Original value of num1: " + num1);
        num1 = num1*6;
        System.out.println("new value of num1 is: " + num1);


    }
}