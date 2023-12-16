/*Check balanced parenthesis : Develop a program that checks whether at given string
containing parenthesis is balanced [both in pair and order] or not.
Test Case 1: Input: "((()))" Expected Output: True
Test Case 2: Input: "()()()()" Expected Output: True
Test Case 3: Input: "((())" Expected Output: False
Test Case 4: Input: "(()())" Expected Output: True
Test Case 5: Input: "())(" Expected Output: False */

import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String str = sc.nextLine();

        int CountA = 0;
        int CountB = 0;

        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                CountA++;
            } else if (ch == ')') {
                CountB++;
                if (CountB > CountA) {
                    break;
                }
            } else {
                continue;
            }
        }

        boolean balanced = CountA == CountB;

        if (balanced) {
            System.out.println("True...!'"+ str +"' has balanced parentheses.");
        } else {
            System.out.println("False...!'"+ str +"' has unbalanced parentheses.");
        }
    }
}
