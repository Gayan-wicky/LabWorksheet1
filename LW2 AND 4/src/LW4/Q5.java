package LW4;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entree:");
        System.out.println("1. Tofu Burger ($3.49)");
        System.out.println("2. Cajun Chicken ($4.59)");
        System.out.println("3. Buffalo Wings ($3.99)");
        System.out.println("4. Rainbow Fillet ($2.99)");
        System.out.print("Choose: ");
        int entree = scanner.nextInt();

        System.out.println("Side Dish:");
        System.out.println("1. Rice Cracker ($0.79)");
        System.out.println("2. No-Salt Fries ($0.69)");
        System.out.println("3. Zucchini ($1.09)");
        System.out.println("4. Brown Rice ($0.59)");
        System.out.print("Choose: ");
        int sidedish = scanner.nextInt();

        System.out.println("Drink:");
        System.out.println("1. Cafe Mocha ($1.99)");
        System.out.println("2. Cafe Latte ($1.90)");
        System.out.println("3. Espresso ($2.49)");
        System.out.println("4. Oolong Tea ($0.99)");
        System.out.print("Choose: ");
        int drink = scanner.nextInt();

        double total = 0;

        switch (entree) {
            case 1:
                total += 3.49;
                break;
            case 2:
                total += 4.59;
                break;
            case 3:
                total += 3.99;
                break;
            case 4:
                total += 2.99;
                break;
            default:
                total +=0;
        }

        switch (sidedish) {
            case 1:
                total += 0.79;
                break;
            case 2:
                total += 0.69;
                break;
            case 3:
                total += 1.09;
                break;
            case 4:
                total += 0.59;
                break;
            default:
                total +=0;
        }

        switch (drink) {
            case 1:
                total += 1.99;
                break;
            case 2:
                total += 1.90;
                break;
            case 3:
                total += 2.49;
                break;
            case 4:
                total += 0.99;
                break;
            default:
                total +=0;
        }

        System.out.println("Total Price = $" + total);
    }
}
