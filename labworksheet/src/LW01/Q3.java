package LW01;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length in centimetres: ");
        double cm = scanner.nextDouble();

        double In = cm / 2.54;
        int feet = (int) (In / 12);
        double inches = In % 12;

        System.out.printf("%.2f cm = %d feet %.2f inches%n", cm, feet, inches);
    }
}