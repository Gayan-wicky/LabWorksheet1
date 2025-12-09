package LW2;

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] num = new int[5];


        for (int i = 0; i < 5; i++) {
            System.out.print("Enter  numbers:");
            num[i] = scanner.nextInt();
        }

        // sort the array (descending order)
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (num[j] > num[i]) {
                    int max = num[i];
                    num[i] = num[j];
                    num[j] = max;
                }
            }
        }

        System.out.println("Second largest: " + num[1]);

        scanner.close();
    }
}
