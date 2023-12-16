/*Valid Palindromes : Write a program that checks whether a given string is a valid
palindrome. Consider only alphanumeric characters and ignoring cases.
Test Case 1: Input: "A man, a plan, a canal Panama" Expected Output: True
Test Case 2: Input: "race a car" Expected Output: False
Test Case 3: Input: "Never odd or even" Expected Output: True
Test Case 4: Input: "12321" Expected Output: True
Test Case 5: Input: "hello" Expected Output: False */

import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        int i = 0;
        int j = str.length() - 1;
        boolean isPalindrome = true;

        while (i < j) {
            while (!Character.isLetterOrDigit(str.charAt(i)) && i < j) {
                i++;
            }
            while (!Character.isLetterOrDigit(str.charAt(j)) && j > i) {
                j--;
            }
            if (str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        if (isPalindrome) {
            System.out.println("True....! '"+ str +"' is a palindrome!");
        } else {
            System.out.println("False....! '"+ str +"' is not a palindrome.");
        }
    }
}
