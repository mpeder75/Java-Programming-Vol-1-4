public class Main {
    public static void main(String[] args) {

        // Declare String objekter
        String str = new String("I love hamburgers");
        String jason = new String("And I love hotdogs");

        // Declare og initialize String SHORTHAND
        String str2 = "I like to go to Disneyland";
        String gibson = "45878 is my favorite number";


        // Printe String objekter ud
        System.out.println(str);
        System.out.println(jason + "\n");

        System.out.println(str2);
        System.out.println(gibson);

       // String concatenation - Man bruger string objekter til at bygge en samlet string objekt
        String favoriteFood = str + " " + jason;
        System.out.println(favoriteFood);

    }
}