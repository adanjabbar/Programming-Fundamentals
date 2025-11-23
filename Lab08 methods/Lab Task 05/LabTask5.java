/*Write a method that counts the number of letters in a string using the following header: 
public static int countLetters(String s) 
Write a test program that prompts the user to enter a string and displays the number of letters in the 
string. */

  import java.util.Scanner;

public class LabTask5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Number of letters: " + countLetters(str));
      sc.close();
    }

    public static int countLetters(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(Character.isLetter(str.charAt(i)))
                count++;
        }
        return count;
    }
}
