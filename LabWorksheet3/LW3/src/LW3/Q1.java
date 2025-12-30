package LW3;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter temperature in celsius:");
        double c = scanner.nextDouble();

        Temperature t = new Temperature(c);
        System.out.println("Temperature in Fahrenheit: " + t.toFahrenheit());

    }
}