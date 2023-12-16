/*Reverse words in a sentence: Implement a program that reverses the order of words in a
given sentence
Test Case 1: Input: "Hello World" Expected Output: "World Hello"
Test Case 2: Input: "This is a test sentence." Expected Output: "sentence test a is This"
Test Case 3: Input: " Spaces should not affect word counting " Expected Output: "
counting word affect not should Spaces "
Test Case 4: Input: "OneWord" Expected Output: "OneWord"
Test Case 5: Input: "i love programming very much" Expected Output: "much very
programming love i" */

import java.util.Scanner;


class Question5 {

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        String reverse = "";
        
        String a[] = str.split(" ");
        
        for(int i=0;i<a.length;i++){
            
            reverse = a[i]+" "+reverse;
        }
        
        System.out.println("Reversed sentence: " + reverse);
    }
}     