/*Replace characters : Create a program that replaces all occurrences of a specified
character with another character in a given string.

Test Case 1: Input String: "Hello World" Character to Replace: "o" Replacement
Character: "X" Expected Output: "HellX WXrld"

Test Case 2: Input String: "abracadabra" Character to Replace: "a" Replacement
Character: "z" Expected Output: "zbrzczdzbrz"

Test Case 3: Input String: "Mississippi" Character to Replace: "i" Replacement Character:
"e" Expected Output: "Messesseppe"

Test Case 4: Input String: "abcdeedcba" Character to Replace: "d" Replacement Character:
"X" Expected Output: "abcXeeXcba"

Test Case 5: Input String: "aaaaa" Character to Replace: "a" Replacement Character: "b"
Expected Output: "bbbbb" */


import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        System.out.print("Enter the character to replace: ");
        char Replace = sc.nextLine().charAt(0);

        System.out.print("Enter the replacement character: ");
        char replacement = sc.nextLine().charAt(0);

        String replacedString = "";
        for (int i = 0; i < str.length(); i++) {
            char C_Char = str.charAt(i);
            replacedString += (C_Char == Replace) ? replacement : C_Char;
        }

        // Print results
        System.out.println("Original string: " + str);
        System.out.println("Replaced string: " + replacedString);

       
    }
}
