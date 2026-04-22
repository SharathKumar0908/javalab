package first;

/*
2 a. Develop a java program for performing various string operations with different string handling
functions directed as follows:
String Creation and Basic Operations,
Length and Character Access,
String Comparison,
String Searching,
Substring Operations,
String Modification,
Whitespace Handling,
String Concatenation,
String Splitting,
StringBuilder Demo,
String Formatting,
Validate Email with contains() and startsWith() and endsWith()
*/

import java.util.*;

public class _2a {

    public static void main(String[] args) {

        stringCreation();
        lengthAndCharAccess();
        stringComparison();
        stringSearching();
        substringOperations();
        stringModification();
        whitespaceHandling();
        stringConcatenation();
        stringSplitting();
        stringBuilderDemo();
        stringFormatting();
        emailValidation();
    }

    // 1. String Creation and Basic Operations
    public static void stringCreation() {
        String s1 = "Hello";
        String s2 = new String("World");

        System.out.println("String 1: " + s1);
        System.out.println("String 2: " + s2);
    }

    // 2. Length and Character Access
    public static void lengthAndCharAccess() {
        String str = "Java";
        System.out.println("\nLength: " + str.length());
        System.out.println("Character at index 2: " + str.charAt(2));
    }

    // 3. String Comparison
    public static void stringComparison() {
        String a = "Apple";
        String b = "apple";

        System.out.println("\nEquals: " + a.equals(b));
        System.out.println("Equals Ignore Case: " + a.equalsIgnoreCase(b));
    }

    // 4. String Searching
    public static void stringSearching() {
        String str = "Hello Java";

        System.out.println("\nContains 'Java': " + str.contains("Java"));
        System.out.println("Index of 'Java': " + str.indexOf("Java"));
    }

    // 5. Substring Operations
    public static void substringOperations() {
        String str = "Programming";

        System.out.println("\nSubstring (0,6): " + str.substring(0, 6));
    }

    // 6. String Modification
    public static void stringModification() {
        String str = "java";

        System.out.println("\nUppercase: " + str.toUpperCase());
        System.out.println("Replace: " + str.replace('j', 'J'));
    }

    // 7. Whitespace Handling
    public static void whitespaceHandling() {
        String str = "   Hello World   ";

        System.out.println("\nBefore trim: '" + str + "'");
        System.out.println("After trim: '" + str.trim() + "'");
    }

    // 8. String Concatenation
    public static void stringConcatenation() {
        String a = "Hello";
        String b = "World";

        System.out.println("\nConcatenation (+): " + a + " " + b);
        System.out.println("Concatenation (concat): " + a.concat(" ").concat(b));
    }

    // 9. String Splitting
    public static void stringSplitting() {
        String str = "Java,Python,C++";

        String[] parts = str.split(",");
        System.out.println("\nSplitting:");
        for (String p : parts) {
            System.out.println(p);
        }
    }

    // 10. StringBuilder Demo
    public static void stringBuilderDemo() {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" Java");
        sb.insert(5, " World");
        sb.delete(5, 11);

        System.out.println("\nStringBuilder result: " + sb);
    }

    // 11. String Formatting
    public static void stringFormatting() {
        String name = "Varun";
        int age = 21;

        String formatted = String.format("\nName: %s, Age: %d", name, age);
        System.out.println(formatted);
    }

    // 12. Email Validation
    public static void emailValidation() {
        String email = "example@gmail.com";

        boolean isValid = email.contains("@") &&
                          email.startsWith("example") &&
                          email.endsWith(".com");

        System.out.println("\nEmail: " + email);
        System.out.println("Valid Email? " + isValid);
    }
}