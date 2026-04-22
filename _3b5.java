/*
Q5. Write a Java Program for Eliminating all whitespace characters from a string
using user defined function removeWhitespace()
*/

package first;

public class _3b5 {

    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s", "");
    }

    public static void main(String[] args) {
        String str = "Hello World Java";
        System.out.println("Without spaces: " + removeWhitespace(str));
    }
}