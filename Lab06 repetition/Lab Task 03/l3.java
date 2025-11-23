/*The number of elements that are greater than the previous one: A sequence consists of integer numbers 
and ends with the number 0. Determine how many elements of this sequence are greater than their 
neighbours above. */

  import java.util.Scanner;
public class l3{
	public static void main(String[]args){
 Scanner input= new Scanner(System.in);
System.out.println("Enter sequence that ends with zero :");

int prev = input.nextInt();
if (prev ==0) {
	System.out.print("Output : 0 ");
	input.close();  }

int n, count=0;

     while(true) {
     n = input.nextInt();
		if(n==0) {
		break; }
		if (n > prev) {
		count++; }
	}
System.out.print("numbers greater than previous numbers = " +count); 
input.close();
  }
}
