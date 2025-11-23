//b) Given two integers A and B. Print all numbers from A to B inclusively, in ascending order, if A < B, or in descending order, if A ≥ B 

import java.util.Scanner;
public class taskB{
        public static void main(String[]args){
        Scanner input=new Scanner(System.in);
int a, b, i ;
System.out.print("Enter 1st number: ");
a=input.nextInt();
System.out.println();

System.out.print("Enter 2nd larger number: ");
b=input.nextInt();
System.out.println();

if (a<b) {
	for ( i=a ; i<=b ; i++ ) {
		System.out.println( i );  }
	}
else {
	for ( i=a ; i>=b ; i-- ) {
		System.out.println( i );  }
	}
input.close();
	}
}
				
