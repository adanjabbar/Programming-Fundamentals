//Write a program that displays a random uppercase letter using the Math.random() method.

public class LabTask4 {
    public static void main(String[] args) {
        char letter = (char) ('A' + (int)(Math.random() * 26));
        System.out.println("Random uppercase letter: " + letter);
    }
}
