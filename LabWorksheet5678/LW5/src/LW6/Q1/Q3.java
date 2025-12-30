package LW6.Q1;

import java.util.ArrayList;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pet> pets = new ArrayList<>();

        while (true) {
            System.out.print("Enter pet name (STOP to end): ");
            String name = sc.nextLine();

            if (name.equalsIgnoreCase("STOP"))
                break;

            System.out.print("Enter type (c for cat, d for dog): ");
            char type = sc.nextLine().charAt(0);

            if (type == 'c') {
                Cat c = new Cat();
                c.setName(name);
                pets.add(c);
            } else if (type == 'd') {
                Dog d = new Dog();
                d.setName(name);
                pets.add(d);
            }
        }

        System.out.println("\nCats:");
        for (Pet p : pets) {
            if (p instanceof Cat)
                System.out.println(p.getName());
        }

        System.out.println("\nDogs:");
        for (Pet p : pets) {
            if (p instanceof Dog)
                System.out.println(p.getName());
        }

    }
}
