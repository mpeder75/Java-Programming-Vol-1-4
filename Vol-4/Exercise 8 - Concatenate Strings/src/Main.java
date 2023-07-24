public class Main {

    /*
    Create four strings.
    The first should contain the text "The itsy bitsy spider"
    The second should contain " climbed up the water spout."
    The third should contain " Down came the rain, "
    The fourth should contain "and washed the spider out. "

    Concatenate (combine) the 1st and 2nd strings and store in a fifth string.
    Concatenate (combine) the 3rd and 4th strings and store in a sixth string.

    Print out string #5 and #6 using two printLN() statements. .

    The final output is :
    The itsy bitsy spider climbed up the water spout.
    Down came the rain, and washed the spider out.
    */

    public static void main(String[] args) {

        String str1 = "The itsy bitsy spider 🕷️";
        String str2 = " climbed up the water spout. ";
        String str3 = " Down came the rain 🌦️, ";
        String str4 = "and washed the spider out.";

        String str5 = str1 + str2;
        String str6 = str3 + str4;

        System.out.println(str5 + str6);

    }
}