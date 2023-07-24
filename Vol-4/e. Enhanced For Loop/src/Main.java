public class Main {
    public static void main(String[] args) {

      int jason[] = {4, 3, 6, 3, 76, 3, 7, 3, 87, 89, 444};

      // Enhanced For loop, der printer hele array ud
      for (int element : jason) {
          System.out.println(element);
      }

        // Med beregning, her squares hvert iteration med sig selv, og printes
        for (int element : jason) {
            System.out.println(element + " squared with " + element + " is: " + element*element);
        }

    }
}