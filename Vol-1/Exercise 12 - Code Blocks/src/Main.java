public class Main {
    public static void main(String[] args) {

    /*
    Assign a variabel called "age" with the value 35.
    Using if statements, do the following:

    If the age is grater than or equal to 30 then output the following ising seperate println() statements

	"Oh no I am older than 30 years old!
	I may be a little older,
	but I am defently a little wiser!

    If the age is less than 30 then outout:

	Roses are red,
	And violets are Blue.
	I am less than 30,
	And I like kung-fu!

    Run thes program at the following ages: 35, 25, 30.
     */

        int age = 35;

        if (age >= 30) {
            System.out.println("Oh no I am older than 30 years old!\n" +
                    "I may be a little older,\n" +
                    "but I am defently a little wiser!");
        } else {
            System.out.println("Roses are red, \n" +
                    "And violets are Blue.\n" +
                    "I am less than 30, \n" +
                    "And I like kung-fu!");
        }


    }
}