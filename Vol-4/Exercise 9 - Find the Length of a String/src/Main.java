public class Main {
    public static void main(String[] args) {

        String str1 = "The itsy bitsy spider 🕷️";
        String str2 = " climbed up the water spout. ";
        String str3 = " Down came the rain 🌦️, ";
        String str4 = "and washed the spider out.";

        String combinedString = str1 + str2 + str3 + str4;

        System.out.println("str1 has a length of: " + str1.length());
        System.out.println("str2 has a length of: " + str2.length());
        System.out.println("str3 has a length of: " + str3.length());
        System.out.println("str4 has a length of: " + str4.length());

        System.out.println("All str's combined has the length of: " + combinedString.length());


    }
}