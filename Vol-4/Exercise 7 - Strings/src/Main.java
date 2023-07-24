public class Main {
    /*
    Create four strings.
    The first should contain the text "Roses are red, "
    The second should contain " violets are blue."
    The third should contain " Sugar is sweet, "
    The fourth should contain " and I love You."
    Print out the rhyme using a single println() statement that uses all
    four strings defined above.
     */
    public static void main(String[] args) {

        String str1 = "Roses are red, ";
        String str2 = "violets are blue.";
        String str3 = " Sugar is sweet, ";
        String str4 = "and I love You.";

        // Printe Strings ud med String concatenation
        System.out.println(str1 + str2 + str3 + str4);

        // Printe strings ud med For loop
        String myArray[] = {str1, str2, str3, str4};

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }


    }
}