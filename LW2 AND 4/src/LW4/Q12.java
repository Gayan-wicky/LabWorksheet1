package LW4;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Word to replace: ");
        String oldWord = scanner.nextLine();

        System.out.print("New word: ");
        String newWord = scanner.nextLine();

        String updated = sentence.replace(oldWord, newWord);

        System.out.println("Updated sentence: " + updated);
    }
}

