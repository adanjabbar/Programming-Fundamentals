public class LabTask3 {

    
    static boolean isPrime(int num){
        if(num <= 1) return false;
        for(int i = 2; i <= num/2; i++){
            if(num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        try{
            
            File file = new File("data.txt");
            Scanner sc = new Scanner(file);
            ArrayList<Integer> list = new ArrayList<>();

            while(sc.hasNextInt()){
                list.add(sc.nextInt());
            }
            sc.close();

         
            ArrayList<Integer> newList = new ArrayList<>();

            for(int x : list){
                if(!isPrime(x)){        // if NOT prime, keep it
                    newList.add(x);
                }
            }

            
            FileWriter fw = new FileWriter("data.txt");
            for(int x : newList){
                fw.write(x + " ");
            }

            fw.close();
            System.out.println("Prime numbers removed and file updated.");

        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
