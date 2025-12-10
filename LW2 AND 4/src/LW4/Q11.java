package LW4;

import java.util.*;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int target = random.nextInt(100) + 1;
        int guess = 0;

        while (guess != target) {
            System.out.print("Guess (1-100): ");
            guess = scanner.nextInt();

            if (guess > target)
                System.out.println("Lower!");
            else if (guess < target)
                System.out.println("Higher!");
            else
                System.out.println("Correct!");
        }
    }
}
