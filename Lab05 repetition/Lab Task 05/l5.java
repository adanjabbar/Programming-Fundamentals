//The maximum of the Sequence: A sequence consists of integer numbers and ends with the number 0. Determine the largest element of the sequence.

import java.util.Scanner;
public class task5{
public static void main(String[]args){
        Scanner input=new Scanner(System.in);

int n, max;
System.out.print("Enter a sequence of numbers that end with zero: ");
n=input.nextInt();
max=n;
do{
	n=input.nextInt();
	if(n>max)
		max=n;
	} while(n != 0 );
System.out.print("The maximum of sequence is: " + max);
input.close();
}
} 
