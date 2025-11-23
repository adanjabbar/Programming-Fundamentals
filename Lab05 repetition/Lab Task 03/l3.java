/*Number of zeros: Given N numbers: the first number in the input is N, after that N integers are given. 
Count the number of zeros among the given integers and print it. You need to count the number of numbers 
that are equal to zero, not the number of zero digits. */

import java.util.Scanner;
public class task3{
        public static void main(String[]args){
        Scanner input=new Scanner(System.in);
int n, count=0, number, i =1;

System.out.print("Enter how many integers : ");
n = input.nextInt();

	while(i<=n){
		System.out.print("Enter number" + i + " : " );
		number = input.nextInt();
	if(number ==0){
	count++;}
	
		i++; 
		}

	System.out.print("The number of zeros : " + count);
input.close();
	}
}
