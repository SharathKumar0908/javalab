/*
Q2. Write a Java Program for Counting how many times a substring appears in a main string
using user defined function countOccurrences()
*/

package first;

public class _3b2 {

    public static int countOccurrences(String main, String sub) {
        int count = 0, index = 0;

        while ((index = main.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }

    public static void main(String[] args) {
        String main = "Java Java Java";
        String sub = "Java";
        System.out.println("Occurrences: " + countOccurrences(main, sub));
    }
}