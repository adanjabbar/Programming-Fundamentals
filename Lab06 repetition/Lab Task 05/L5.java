/*Write a program that prompts the user to enter the year and first day of the year and displays the calendar 
table for the year on the console. For example, if the user entered the year 2013, and 2 for Tuesday, January 
1, 2013, your program should display the calendar for each month in the year, */

import java.util.Scanner;
public class l5{
	public static void main(String[]args){
 Scanner input= new Scanner(System.in);

int year, day, firstDay, daysinMonth;
	System.out.print("Enter year: ");
	year=input.nextInt();
System.out.println();
	System.out.print("Enter first day of year (0=sun,...6=sat): ");
	firstDay=input.nextInt();
System.out.println();

for (int month=1; month <=12; month++) {
	System.out.println("Month " + month + "," + year );
	System.out.println("Sun  Mon  Tues  Wed  Thurs FRi  Sat ");

	if(month==2)
		daysinMonth = (year%4==0 && year%100!=0 || year%400==0)? 29:28; 
	else if (month==4 || month==6 || month==9 || month==11)
		daysinMonth = 30;
	else
		daysinMonth = 31;         

for(day=0; day<firstDay; day++)
	System.out.print("       ");        //
for(day=1; day<=daysinMonth; day++) {
	if(day<10) 
		System.out.print(" " + day + " ");
	else 
		System.out.print(" " + day + " ");
	firstDay++;

	if (firstDay==7){
		System.out.println();
		firstDay=0;
		}
	}	
System.out.println();
   }
input.close();
	}
}
