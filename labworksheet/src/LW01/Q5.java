package LW01;

import java.util.Scanner;

public class Q5 {
    public static final double PI = 3.14;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter inner radius : ");
        double ri = input.nextDouble();

        System.out.print("Enter outer radius : ");
        double ro = input.nextDouble();

        double areaIn = PI * ri * ri;
        double areaOut = PI * ro * ro;
        double shadearea = areaOut - areaIn;

        System.out.printf("Shaded circular region area = %.2f%n", shadearea);
    }
}
