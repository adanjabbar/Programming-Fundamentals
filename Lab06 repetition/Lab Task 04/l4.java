/*The program asks the user to enter the number which pattern he/she wants to print. The loop should ask 
the user whether he or she wishes to perform the operation again. If so, the loop should repeat; otherwise 
it should terminate. */

import java.util.Scanner;
public class l4{
	public static void main(String[]args){
 Scanner input= new Scanner(System.in);

while(true) {
	System.out.println("\nChoose pattern (1-5): ");
	int choice= input.nextInt();

switch(choice) {
case 1 :
	for(int i=1; i<=4; i++) {
		for (int j=1; j<=10; j++) 
		System.out.print("*"); 
	System.out.println();
	}
	break;
case 2:
	for(int i=1; i<=5; i++) {
		for(int j=1; j<=i; j++) 
		System.out.print("*");
	System.out.println();
	}
	break;
case 3:
	for(int i=1; i<=5; i++) {
		for(int s=1; s<=5-i; s++)
		System.out.print(" ");
	for (int j=1; j<=i; j++)
	System.out.print("*");
	System.out.println();
	}
	break;
case 4:
	for(int i=1; i<=5; i++) {
		for(int s=i; s<5; s++) 
		System.out.print(" ");
	for(int j=1; j<=(2*i-1); j++)
	System.out.print("*");
	System.out.println();
	}
	break;
case 5:
	int rows=5;
	for(int i=1; i<=rows; i++) {
		for(int s=1; s<=rows-i; s++) 
		System.out.println(" ");
	for (int j=1; j<=(2*i-1); j++)
	System.out.print(i);
	System.out.println();
	}
	break;
default:
	System.out.println("Invalid choice");
	continue;
}
	System.out.print("\nDo you want to print another pattern? (y/n)");

char again = input.next().charAt(0);
if(again == 'n'|| again =='N') {
	System.out.println("Program ended.");
	break;
	}
	}
input.close();
	}
}
