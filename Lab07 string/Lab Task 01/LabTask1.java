/*The great circle distance is the distance between two points on the surface of a sphere. Let (x1, y1) and (x2, 
y2) be the geographi-cal latitude and longitude of two points. The great circle distance between the two 
points can be computed using the following formula: 
Write a program that prompts the user to enter the latitude and longitude of two points on the earth in 
degrees and displays its great circle distance. The average earth radius is 6,371.01 km. Note that you need 
to convert the degrees into radians using the  Math.toRadians method since the Java trigonometric methods 
use radians. The latitude and longitude degrees in the formula are for north and west. Use negative to 
indicate south and east degrees.*/

import java.util.Scanner;

public class LabTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double RADIUS = 6371.01;

        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double x1 = Math.toRadians(input.nextDouble());
        double y1 = Math.toRadians(input.nextDouble());

        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double x2 = Math.toRadians(input.nextDouble());
        double y2 = Math.toRadians(input.nextDouble());

        double distance = RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2)
                + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

        System.out.println("The distance between the two points is " + distance + " km");
    }
}
