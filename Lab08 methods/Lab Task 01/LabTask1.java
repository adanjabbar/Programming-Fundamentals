/*a) Write a method that computes the sum of the digits in an integer. Use the following method 
header: public static int sumDigits(long n). For example, sumDigits(234) returns 9 (2 + 3 + 4). 
b) Write a method with the following header to display an integer in reverse order: 
public static void reverse(int number) 
For example, reverse(3456) displays 6543. Write a test program that prompts the user to 
enter an integer and displays its reversal.*/

  import java.util.Scanner;

public class LabTask1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int Number = sc.nextInt();

        System.out.println("Sum of digits: " + sumDigits(Number));
        
        System.out.print("Reverse: ");
        reverse(Number);
      sc.close();
    }

    public static int sumDigits(long n){
        int sum = 0;
        while(n != 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void reverse(int number){
        while(number != 0){
            System.out.print(number % 10);
            number /= 10;
        }
        System.out.println();
    }
}
