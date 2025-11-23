//a) Given two integers A and B (A ≤ B). Print all numbers from A to B inclusively. 

  import java.util.Scanner;
public class taskA{
        public static void main(String[]args){
        Scanner input=new Scanner(System.in);
int a, b ;
System.out.print("Enter 1st number: ");
a=input.nextInt();
System.out.println();

System.out.print("Enter 2nd larger number: ");
b=input.nextInt();
System.out.println();

for(int i=a ; i<=b ; i++ ){
	System.out.println( i );
	}
input.close();
	}
}
