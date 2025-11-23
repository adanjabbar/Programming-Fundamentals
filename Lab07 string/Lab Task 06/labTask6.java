//Given a string consisting of exactly two words separated by a space. Print a new string with the first and second word positions swapped (the second word is printed first). This task should not use loops and if.

import java.util.Scanner;

public class LabTask6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        int spaceIndex = str.indexOf(' ');
        String first = str.substring(0, spaceIndex);
        String second = str.substring(spaceIndex + 1);

        System.out.println(second + " " + first);
    }
}
