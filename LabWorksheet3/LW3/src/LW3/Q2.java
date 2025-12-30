package LW3;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double f = sc.nextDouble();

        Temperature t = new Temperature();
        t.setFahrenheit(f);

        System.out.println("Temperature in Celsius: " + t.toCelsius());
    }
}
