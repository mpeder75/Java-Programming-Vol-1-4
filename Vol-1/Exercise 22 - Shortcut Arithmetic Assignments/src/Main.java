public class Main {
    public static void main(String[] args) {

        int num;

        System.out.println("num\ta=num+2\tb=num-2\tc=num*2\td= num/2");
        for (num = 1; num <= 15; num++)
        {
            int a = num, b = num, c = num;
            double d = num;

            a += 2;
            b -= 2;
            c *= 2;
            d /= 2;

            System.out.println(num +"\t\t" + a + "\t\t" + b + "\t\t" + c + "\t\t" + d);

        }

    }
}