public class Main {

    /*
    Declare and initialize an array of type int named yearsMarried, which will have 5 elements.
    This array holds how many years that families have been married on your street.
    Store the following data into the array by storing them into the individual elements of the array.

    family 1 =  4 years
    family 2 =  3 years
    family 3 =  10 years
    family 4 = 12 years
    family 5 = 6 years

    Next, print this data to the screen by accessing the elements and using System.Out.printLn) ;
    */


    public static void main(String[] args) {

        // Array declares og initializers med værdier
        int yearsMarried[] = {4, 3, 10, 12, 6};

        // for loop der køre array igennem og printer hvert index ud
        // 1. i < yearsMarried -> Når i bliver større end 5, vil der hoppes ud af loop
        // 2. i++ incrementer loop counter efter hvert iteration
        for (int i = 0; i < yearsMarried.length; i++)
        {
            System.out.println("Familie " + i + " har været sammen i " + yearsMarried[i] + " år");
        }

    }
}