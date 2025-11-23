/*Write a method with the following header to display three numbers in increasing order: 
public static void displaySortedNumbers(double num1, double num2, 
double num3) 
Write a test program that prompts the user to enter three numbers and invokes the method to display them 
in increasing order. */

  import java.util.Scanner;

public class LabTask3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        displaySortedNumbers(a, b, c);
      sc.close();
    }

    public static void displaySortedNumbers(double n1, double n2, double n3){
        double smallest = Math.min(n1, Math.min(n2, n3));
        double largest = Math.max(n1, Math.max(n2, n3));
        double middle = n1 + n2 + n3 - smallest - largest;

        System.out.println(smallest + " " + middle + " " + largest);
    }
}
