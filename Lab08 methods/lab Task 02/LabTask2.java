/*Write the methods with the following headers 
 Return the reversal of an integer, i.e., reverse(456) returns 654 
public static int reverse(int number) 
 Return true if number is a palindrome 
public static boolean isPalindrome(int number) 
Use the reverse method to implement isPalindrome. A number is a palindrome if its reversal is the same 
as itself. Write a test program that prompts the user to enter an integer and reports whether the integer is 
a palindrome.*/

  import java.util.Scanner;

public class LabTask2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int Number = sc.nextInt();

        if(isPalindrome(Number))
            System.out.println(Number + " is a Palindrome.");
        else
            System.out.println(Number + " is NOT a Palindrome.");
      sc.close();
    }

    public static int reverse(int number){
        int rev = 0;
        while(number != 0){
            rev = rev * 10 + number % 10;
            number /= 10;
        }
        return rev;
    }

    public static boolean isPalindrome(int number){
        return number == reverse(number);
    }
}
