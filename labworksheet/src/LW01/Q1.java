package LW01;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an odd-length word: ");
        String word = scanner.nextLine();

        if (word.length() % 2 == 1) {
            int middle = word.length() / 2;
            System.out.println("Middle character: " + word.substring(middle, middle + 1));
        } else {
            System.out.println("The word length must be odd");
        }
    }
}
