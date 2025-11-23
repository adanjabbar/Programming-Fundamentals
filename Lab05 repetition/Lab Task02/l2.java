/*Factorial: In mathematics, the factorial of an integer n, denoted by n! is the following product: 
n!=1×2×…×n 
For the given integer n calculate the value n!*/

import java.util.Scanner;
public class task2{
        public static void main(String[]args){
        Scanner input=new Scanner(System.in);
int n, i=1, fact=1;
System.out.print("Enter an integer to calculate factorial : ");
n = input.nextInt();

while(i<=n){
	fact=fact*i;
	i++;
	}
System.out.print("The factorial of number is: " +fact);
input.close();
	}
}
