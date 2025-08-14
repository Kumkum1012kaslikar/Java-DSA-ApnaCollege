package Stringss;

import java.util.*;

public class Strings {

    public static void main(String[] args) {
        // define
        /*
         * char arr[] = { 'a', 'b', 'c', 'd' };
         * String str = "a,b,c,d";
         * String str2 = new String("xyz");
         * 
         * // Strings are IMMUTABLE
         * 
         * Scanner sc = new Scanner(System.in);
         * String name;
         * name = sc.next(); // one word
         * name = sc.nextLine(); // whole line
         * System.out.println(name);
         * 
         * // length finding
         * String fullName = "Tony Stark";
         * System.out.println(fullName.length());
         */

        // char print
        // 1
        String FirstName = "Kumkum";
        String SecondName = "Kaslikar";
        String fulllName = FirstName + " " + SecondName;
        System.out.println(fulllName.charAt(0));

        // 2
        for (int i = 0; i < fulllName.length(); i++) {
            System.out.print(fulllName.charAt(i) + " ");
        }
        System.out.println();

        // substring
        System.out.println(fulllName.substring(0, 5));

        // convert to lower case
        String p = FirstName.toLowerCase();
        System.out.println(p);

        // replace 1
        String h = "ApnaCollege".replace("Apna", "a");
        System.out.println(h);

        // replace 2
        String r = "ApnaCollege".replaceAll("ApnaCollege", "a");
        System.out.println(r);
    }

}
