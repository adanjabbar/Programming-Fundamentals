public class LabTask2 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Original array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        modify(numbers);

        System.out.println("\n\nArray after modify() (each element * 3):");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void modify(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 3;
        }
    }
}
