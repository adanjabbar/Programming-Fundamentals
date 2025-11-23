//Given a string. Replace every occurrence of the letter h by the letter H, except for the first and the last ones. 

import java.util.Scanner;

public class LabTask9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        int first = str.indexOf('h');
        int last = str.lastIndexOf('h');

        if (first == -1 || first == last) {
            System.out.println(str); 
        } else {
            
            String middle = str.substring(first + 1, last).replace('h', 'H');
            String result = str.substring(0, first + 1) + middle + str.substring(last);
            System.out.println("Result: " + result);
        }
    }
}
