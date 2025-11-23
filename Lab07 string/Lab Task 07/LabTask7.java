/*Given a string that may or may not contain a letter of interest. Print the index location of the first and last 
appearance of f. If the letter f occurs only once, then output its index. If the letter f does not occur, then 
do not print anything.*/

import java.util.Scanner;

public class LabTask7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        int first = str.indexOf('f');
        int last = str.lastIndexOf('f');

        if (first == -1) return;
        if (first == last)
            System.out.println(first);
        else
            System.out.println(first + " " + last);
    }
}
