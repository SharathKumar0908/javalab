/*
Q8. Write a Java Program for Verifying if a string contains only numeric characters
using user defined function isNumeric()
*/

package first;

public class _3c3 {

    public static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

    public static void main(String[] args) {
        String str = "12345";
        System.out.println("Is Numeric: " + isNumeric(str));
    }
}