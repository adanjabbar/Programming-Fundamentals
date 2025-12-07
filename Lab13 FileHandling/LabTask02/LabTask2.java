import java.util.*;
import java.io.*;

public class LabTask2 {
    public static void main(String[] args) {

        try{
            
            File file = new File("data.txt");
            Scanner sc = new Scanner(file);

            ArrayList<Integer> list = new ArrayList<>();

            while(sc.hasNextInt()){
                list.add(sc.nextInt());
            }

            sc.close();

            
            Collections.sort(list);

            
            System.out.println("Sorted Data:");
            for(int x : list){
                System.out.print(x + " ");
            }

        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
