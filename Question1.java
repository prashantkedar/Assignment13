/*String Compression: Implement a program that compresses a string by replacing
consecutive repeated characters with a single occurrence and count.


Test Case 1: Input: "aaabbbccc" Expected Output: "a3b3c3"
Test Case 2: Input: "aabbbcccdddd" Expected Output: "a2b3c3d4"
Test Case 3: Input: "abcdefg" Expected Output: "abcdefg"
Test Case 4: Input: "xxxxxyyyyyyzz" Expected Output: "x5y6z2"
Test Case 5: Input: "aaAAaabbBBBbccCCcc" Expected Output: "a2A2a2b2B3bc2C2c2 */


import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuilder ComString = new StringBuilder();
        char P_Char = str.charAt(0);
        int count = 1;

    for (int i = 1; i < str.length(); i++) {
        char C_Char = str.charAt(i);

        if (C_Char == P_Char) {
            count++;
        } else {
            ComString.append(P_Char);
        if (count > 1) {
            ComString.append(count);
            }

            P_Char = C_Char;
            count = 1;

           }

        }
        
        ComString.append(P_Char);
        if (count > 1) {
            ComString.append(count);

        }

        System.out.println("Original string: " + str);
        System.out.println("Compressed string: " + ComString);
    }
}
