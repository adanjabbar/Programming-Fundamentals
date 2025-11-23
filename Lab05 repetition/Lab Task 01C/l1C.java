/*c) Sum of N numbers: N numbers are given in the input. Read them and print their sum.The first line 
of input contains the integer N, which is the number of integers to follow. Each of the next N lines 
contains one integer. Print the sum of these N integers. */

import java.util.Scanner;
public class taskC{
        public static void main(String[]args){
        Scanner input=new Scanner(System.in);
int n, i, sum = 0; 
	System.out.print("Enter the total number of integers you want sum of: ");
	n = input.nextInt();
for ( i=0 ; i<n ; i++ ) {
      	System.out.println("Enter " + n + " integers :");
	int a = input.nextInt();
	sum = sum + a;	
	}
System.out.println("The sum of numbers is : " + sum);
input.close();
	}
}
