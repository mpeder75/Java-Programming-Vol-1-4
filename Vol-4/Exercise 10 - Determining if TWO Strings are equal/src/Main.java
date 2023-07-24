public class Main {
    /*
    Create four strings, exactly as shown below, including capital

    The first should contain the text "Lou,lou, skip to my Lou"
    The second should contain "Lou, Lou, skip to my Lou"
    The third should contain "lou, lou, skip to my Lou"
    The fourth should contain "Skip to my Lou, my darling"

    Print the song to the screen, THEN :

    Compare string 1 with string 2 and print to the screen whether they are equal

    Compare string 1 with string 3 and print to the screen whether they are equal

    Compare string 1 with string 4 and print to the screen whether they are equal
    */

    public static void main(String[] args) {

        String str1 = "Lou, Lou, skip to my Lou";
        String str2 = "Lou, Lou, skip to my Lou";
        String str3 = "lou, lou, skip to my lou";
        String str4 = "Skip to my Lou, my darling";

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4 + "\n");

        System.out.println("Are str1 & str 2 equal: " +  str1.equals(str2));
        System.out.println("Are str1 & str 3 equal: " +  str1.equals(str3));
        System.out.println("Are str1 & str 4 equal: " +  str1.equals(str4));



    }
}