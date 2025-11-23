/*a) Write a program that receives an ASCII code (an integer between 0 and 127) and displays its 
character. 
b) Write a program that receives a character and displays its Unicode.*/


import java.util.Scanner;

public class LabTask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Part a
        System.out.print("Enter an ASCII code (0 to 127): ");
        int code = input.nextInt();
        System.out.println("The character for ASCII code " + code + " is " + (char) code);

        // Part b
        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);
        System.out.println("The Unicode for the character " + ch + " is " + (int) ch);
    }
}
