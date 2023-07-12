public class Main {

    /*
    En Method er en code block der udføre noget specifikt hver gang det kaldes

    Ex. istedet for at skrive kode til beregning af en cirkel, kan man have en method,
    der beregner cirklen, hvis man kalder metoden med tal

    public = er en access modifier, angiver at metode er tiltændelig for alle indenfor og udenfor metoden
    static =
    */

    public static void main(String[] args) {

        // method 1 kaldes
        printFirstName();
        // method 2 kaldes
        printLastName();
        // method 3 kaldes
        addNames();
    }


    // method 1, der printer fornavn
    public static void printFirstName()
    {
        System.out.println("My name is Jason");
    }

    // method 2, der printer efternavn
    public static void printLastName()
    {
        System.out.println("My last name is Gibson");
    }

    public static void addNames() {
      int jason = 5;
      int gibson = 6;

      int sum = jason + gibson;
        System.out.println("num of letters in my name: " + sum);
    }
}