/*Write a program that checks whether a string is a palindrome. A string is a palindrome if it reads the 
same forward and backward. The words “mom,” “dad,” and “noon,” for instance, are all palindromes.*/

import java.util.Scanner;

public class LabTask5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        String reversed = new StringBuilder(str).reverse().toString();

        if (str.equals(reversed))
            System.out.println(str + " is a palindrome");
        else
            System.out.println(str + " is not a palindrome");
    }
}
