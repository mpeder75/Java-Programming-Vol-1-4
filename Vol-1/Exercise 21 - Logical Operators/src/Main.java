public class Main {
    public static void main(String[] args) {

        /*

        Create a variable named "age" and assign a value of 30 to it.
        If the age lies between 25 and 35, output the following:

        Your age is between 25 and 35

        If the age lies between 45 and 55, output the following:
        Your age is between 45 and 55

        Change the age to 50 and re-run the program.
         */

        int age = 50;

        if ((age >= 25) && (age <= 35 ))
        {
            System.out.println("Your age is between 25 and 35");
        } else if ((age >= 45) && (age <=55))
        {
            System.out.println("Your age is between 45 and 55");
        }
    }
}