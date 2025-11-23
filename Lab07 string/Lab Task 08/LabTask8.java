/*Given a string in which the letter h occurs at least twice. Remove from that string the first and the last 
occurrence of the letter h, as well as all the characters between them.*/

import java.util.Scanner;

public class LabTask8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        int first = str.indexOf('h');
        int last = str.lastIndexOf('h');

        String result = str.substring(0, first) + str.substring(last + 1);
        System.out.println(result);
    }
}
