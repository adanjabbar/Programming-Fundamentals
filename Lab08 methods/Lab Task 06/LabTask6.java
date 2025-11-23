/*Write a function capitalize(lower_case_word) that takes the lower case word and returns the 
word with the first letter capitalized. Eg., System.out.println(capitalize(“word”)) should 
print the word Word.Then, given a line of lowercase ASCII words (text separated by a single space), print 
it with the first letter of each word capitalized using the your own function capitalize(). */

import java.util.Scanner;

public class Labtask6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter lowercase words: ");
        String line = sc.nextLine();

        String[] words = line.split(" ");
        String result = "";

        for(String w : words){
            
            String capital = w.substring(0,1).toUpperCase() + w.substring(1);
            result += capital + " ";
        }

        System.out.println(result);
      sc.close();
    }
}  
