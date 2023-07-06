public class MyOwnTest {

    public static void main(String[] args) {

        /*

        Tag hvilken som helst Long værdi og increment den med ^1.2568 over 30 gange

         */

        double exponent;
        long answer;

        for (exponent = 1; exponent <= 30; exponent = exponent + 1.2567)
        {
            long numbers = (long)Math.pow(1.25,exponent);

            System.out.println("1,25 raise to the power of " + exponent + " is " + numbers);
        }
    }
}
