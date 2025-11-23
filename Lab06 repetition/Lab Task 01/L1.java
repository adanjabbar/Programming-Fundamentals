/*The index of the maximum of a sequence: A sequence consists of integer numbers and ends with the 
number 0. Determine the index of the largest element of the sequence. If the highest element is not unique, 
print the index of the first of them.*/ 

  import java.util.Scanner;
public class l1{
	public static void main(String[]args){
 Scanner input= new Scanner(System.in);

int n, max=-999, index=0, maxIndex=0;
System.out.println("Enter numbers, end with zero : ");

while(true) {
	n=input.nextInt();
	if(n==0)
		break;
	index++;
	if(n>max) {
		max=n;
	maxIndex = index;
	}
}
	System.out.println("The maximum index is :" + maxIndex);
input.close();
	}
}
