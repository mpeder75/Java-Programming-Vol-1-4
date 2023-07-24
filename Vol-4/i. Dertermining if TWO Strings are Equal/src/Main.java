public class Main {
    public static void main(String[] args) {

        String fullName = "Jason Noel Gibson";

        String userInput = "jason noel gibson";

        /*
        Her sammenlignes de 2 Strings med .equals metoden
        Hvis de er ens returneres true
        Hvis de er forskellige returneres false
        */
        System.out.println("Are these equal?: " + fullName.equals(userInput));

        // Her sammenlignes igen, MEN svaret lægges i en variabel som printes
        Boolean areTheyEqual = fullName.equals(userInput);
        System.out.println(areTheyEqual);

        // Her sammenlignes med en String man selv indtaster
        System.out.println(fullName.equals("Paul Andersson"));

    }
}