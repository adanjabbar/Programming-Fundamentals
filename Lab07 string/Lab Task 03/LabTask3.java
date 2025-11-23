/*a) Write a program that prompts the user to enter an integer between 0 and 15 and displays its 
corresponding hex number.b) Write a program that prompts the user to enter a hex digit and displays its corresponding binary 
number. */

import java.util.Scanner;

public class LabTask3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal value (0 to 15): ");
        int decimal = input.nextInt();

        if (decimal >= 0 && decimal <= 15) {
            String hex = Integer.toHexString(decimal).toUpperCase();
            System.out.println("The hex value is " + hex);
        } else {
            System.out.println(decimal + " is an invalid input");
        }

        System.out.print("\nEnter a hex digit: ");
        char hexChar = input.next().toUpperCase().charAt(0);

        if ((hexChar >= '0' && hexChar <= '9') || (hexChar >= 'A' && hexChar <= 'F')) {
            int value = Character.digit(hexChar, 16); // converts hex character to decimal
            String binary = Integer.toBinaryString(value);
            System.out.println("The binary value is " + binary);
        } else {
            System.out.println(hexChar + " is an invalid input");
        }
    }
}
