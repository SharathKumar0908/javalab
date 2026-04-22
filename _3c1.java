/*
Q6. Write a Java Program for Capitalizing the first letter of each word
using user defined function capitalizeWords()
*/

package first;

public class _3c1 {

    public static String capitalizeWords(String str) {
        String[] words = str.split(" ");
        String result = "";

        for (String w : words) {
            result += Character.toUpperCase(w.charAt(0)) + w.substring(1) + " ";
        }
        return result.trim();
    }

    public static void main(String[] args) {
        String str = "hello java world";
        System.out.println(capitalizeWords(str));
    }
}