//Write a program to copy the contents of one array into another in the reverse order.

public class LabTask3 {
    public static void main(String[] args) {

        int[] original = {10, 20, 30, 40, 50};  
        int[] reversed = new int[original.length];

        
        int j = 0; 
        for (int i = original.length - 1; i >= 0; i--) {
            reversed[j] = original[i];
            j++;
        }

        System.out.println("Original array:");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " ");
        }

        System.out.println("\nReversed array:");
        for (int i = 0; i < reversed.length; i++) {
            System.out.print(reversed[i] + " ");
        }
    }
    }
