public class Main {
    public static void main(String[] args) {

        String lastName = "Gibson";
        String firstName = "Jason";
        String middleName = "Noel";

        // Her concatenate 3 Strings til EEN samlet String variabel kaldt fullName
        // " " giver mellemrum
        String fullName = firstName + " " +  middleName + " " + lastName;

        System.out.println(fullName);

        // Her printes det direkte
        System.out.println(firstName + " " +  middleName + " " + lastName);


    }
}