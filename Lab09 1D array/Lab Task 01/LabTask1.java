 import java.util.Scanner;

public class LabTask1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] ratings = new int[10];   

        System.out.println("Enter ratings (1 to 10) of 10 students:");

        for (int i = 0; i < ratings.length; i++) {
            System.out.print("Rating of student " + (i + 1) + ": ");
            ratings[i] = input.nextInt();
        }

    
        int sum = 0;
        int min = ratings[0];
        int max = ratings[0];

        for (int i = 0; i < ratings.length; i++) {
            sum = sum + ratings[i];

            if (ratings[i] < min) {
                min = ratings[i];
            }

            if (ratings[i] > max) {
                max = ratings[i];
            }
        }

        double average = (double) sum / ratings.length;

        System.out.println("\n--- Summary of Poll ---");
        System.out.print("Ratings entered: ");
        for (int i = 0; i < ratings.length; i++) {
            System.out.print(ratings[i] + " ");
        }

        System.out.println("\nAverage rating: " + average);
        System.out.println("Highest rating: " + max);
        System.out.println("Lowest rating: " + min);

        input.close();
    }
}
