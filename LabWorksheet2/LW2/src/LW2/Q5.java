package LW2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        // Step 1: Break into words
        StringTokenizer st = new StringTokenizer(sentence, " .,!?;:-");

        // Step 2: Put all words together in lowercase
        String cleaned = "";
        while (st.hasMoreTokens()) {
            cleaned = cleaned + st.nextToken().toLowerCase();
        }

        // Step 3: Reverse the cleaned string
        String reverse = "";
        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reverse = reverse + cleaned.charAt(i);
        }

        // Step 4: Compare
        if (cleaned.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }


    }
}
