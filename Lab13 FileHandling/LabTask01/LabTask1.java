import java.util.*;
import java.io.*;

public class LabTask1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Enter 10 integers:");

        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }
        try{
            FileWriter fw = new FileWriter("data.txt");
            for(int i = 0; i < 10; i++){
                fw.write(arr[i] + " ");
            }
            fw.close();
            System.out.println("Data saved in file successfully!");
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
