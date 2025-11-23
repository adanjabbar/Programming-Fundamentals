/*The number of even elements of the sequence: Determine the number of even elements in the sequence 
ending with the number 0.*/

  import java.util.Scanner;
public class l2{
	public static void main(String[]args){
 Scanner input= new Scanner(System.in);

int n, count=0;
	System.out.print("Enter sequence (end with Zero) :");
 while(true) {
	n=input.nextInt();
	if(n==0)
		break;
	if(n%2==0)
		count++;
	}
System.out.println("The total even numbers in sequence is :" + count);
	input.close();
	}
}
