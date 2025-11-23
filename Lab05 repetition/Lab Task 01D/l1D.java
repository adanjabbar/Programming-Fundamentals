//d) Sum of Cubes: For the given integer N calculate the following sum: 13+23+…+N3   

import java.util.Scanner;
public class taskD{
        public static void main(String[]args){
        Scanner input=new Scanner(System.in);
int n, i, sum = 0;
	System.out.print("Enter a number :");
	n = input.nextInt();
for ( i=1 ; i<=n ; i++) {
	sum= sum + (i * i *i);
	}
System.out.print("The sum of cubes from 1 to "+ n +" is : " +sum );
input.close();
	}
}
