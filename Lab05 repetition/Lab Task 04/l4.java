/*The length of Sequence: Given a sequence of non-negative integers, where each number is written in a 
separate line. Determine the length of the sequence, where the sequence ends when the integer is equal to 
0. Print the length of the sequence (not counting the integer 0). The numbers following the number 0 should 
be omitted. */

import java.util.Scanner;
public class l4{

public static void main(String[]args){
        Scanner input=new Scanner(System.in);
int n, count=0;
	System.out.println("Enter numbers (0 to end):");

while(true){            //infinite loop ends on break
	n= input.nextInt();

	if(n==0){
	break;
	        }
	count++;
	}

System.out.print("The length of sequence is : " + count); //display result
input.close();
	}
}
