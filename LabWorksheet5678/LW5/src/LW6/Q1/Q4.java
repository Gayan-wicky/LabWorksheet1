package LW6.Q1;

import java.util.ArrayList;
import java.util.Scanner;

public class Q4 {
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
                System.out.print("Enter coat color: ");
                c.setCoatColor(sc.nextLine());
                pets.add(c);
            }
            else if (type == 'd') {
                Dog d = new Dog();
                d.setName(name);
                System.out.print("Enter weight: ");
                d.setWeight(Double.parseDouble(sc.nextLine()));
                pets.add(d);
            }

        }

        for (Pet p : pets) {
            if (p instanceof Cat) {
                Cat c = (Cat) p;
                System.out.println("Cat: " + c.getName() + ", Coat Color: " + c.getCoatColor());
            } else if (p instanceof Dog) {
                Dog d = (Dog) p;
                System.out.println("Dog: " + d.getName() + ", Weight: " + d.getWeight());
            }
        }

    }
}

