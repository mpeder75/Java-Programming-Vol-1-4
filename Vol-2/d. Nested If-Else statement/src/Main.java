public class Main {
    public static void main(String[] args) {

        // Variabler initializers, 95 degrees og "weather is sunny"
        int temperature = 95;
        boolean sunny = true;

        // Nested If-Else
        if (temperature > 90)
        {
            System.out.println("It is hot outside! ♨️");
            if (sunny == true)
            {
                System.out.println("It is also sunny outside");
            } else {
                System.out.println("it is also cloudy outside");
            }
        } else {
            System.out.println("It si not outside");
        }

    }
}