/*
Q10. Write a Java Program for Counting the number of words in a string
using user defined function countWords()
*/

package first;

public class _3c5 {

    public static int countWords(String str) {
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String str = "Java is very powerful";
        System.out.println("Word Count: " + countWords(str));
    }
}