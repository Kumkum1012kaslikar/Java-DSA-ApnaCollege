package Stringss;

public class equals {
    public static void main(String[] args) {
        String s1 = "Tony"; // reference is old string
        String s2 = "Tony";
        String s3 = new String("Tony"); // reference is new string

        if (s1 == s2) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        } // equal

        if (s1 == s3) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        } // not equal

        if (s1.equals(s3)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        } // equal(used to value wise comparison)

    }
}
