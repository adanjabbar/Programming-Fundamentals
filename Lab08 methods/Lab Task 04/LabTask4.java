/*Write a method that returns the number of days in a year using the following header: 
public static int numberOfDaysInAYear(int year) 
Write a test program that displays the number of days in year from 2000 to 2020.*/

  public class LabTask4 {
    public static void main(String[] args){
        for(int year = 2000; year <= 2020; year++){
            System.out.println(year + ": " + numberOfDaysInAYear(year));
        }
    }

    public static int numberOfDaysInAYear(int year){
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            return 366;
        else
            return 365;
    }
}
