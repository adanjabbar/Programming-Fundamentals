import java.util.Scanner;

public class LabTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][4];

        System.out.println("Enter 12 integers for a 3x4 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Count primes in rows
        int maxRowPrimes = -1;
        int maxRowIndex = -1;
        for (int i = 0; i < 3; i++) {
            int count = 0;
            for (int j = 0; j < 4; j++) {
                int n = arr[i][j];
                if (n > 1) {
                    boolean prime = true;
                    for (int k = 2; k <= Math.sqrt(n); k++) {
                        if (n % k == 0) {
                            prime = false;
                            break;
                        }
                    }
                    if (prime) count++;
                }
            }
            if (count > maxRowPrimes) {
                maxRowPrimes = count;
                maxRowIndex = i;
            }
        }

        // Count primes in columns
        int maxColPrimes = -1;
        int maxColIndex = -1;
        for (int j = 0; j < 4; j++) {
            int count = 0;
            for (int i = 0; i < 3; i++) {
                int n = arr[i][j];
                if (n > 1) {
                    boolean prime = true;
                    for (int k = 2; k <= Math.sqrt(n); k++) {
                        if (n % k == 0) {
                            prime = false;
                            break;
                        }
                    }
                    if (prime) count++;
                }
            }
            if (count > maxColPrimes) {
                maxColPrimes = count;
                maxColIndex = j;
            }
        }

        System.out.println("Row with maximum primes: " + maxRowIndex + " (Count = " + maxRowPrimes + ")");
        System.out.println("Column with maximum primes: " + maxColIndex + " (Count = " + maxColPrimes + ")");
    }
}
