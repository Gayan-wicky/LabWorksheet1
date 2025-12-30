package LW6.Q1;

import java.util.ArrayList;
import java.util.Scanner;

public class Q5Q6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Pet> allPets = new ArrayList<>();
        ArrayList<Dog> dogs = new ArrayList<>();
        ArrayList<Cat> cats = new ArrayList<>();

        // ---------- INITIAL INPUT ----------
        while (true) {
            System.out.print("Enter pet name (STOP to end): ");
            String name = sc.nextLine();

            if (name.equalsIgnoreCase("STOP"))
                break;

            System.out.print("Enter type (c = cat, d = dog): ");
            char type = sc.nextLine().charAt(0);

            if (type == 'c') {
                Cat c = new Cat();
                c.setName(name);
                System.out.print("Enter coat color: ");
                c.setCoatColor(sc.nextLine());

                cats.add(c);
                allPets.add(c);
            }
            else if (type == 'd') {
                Dog d = new Dog();
                d.setName(name);
                System.out.print("Enter weight: ");
                d.setWeight(Double.parseDouble(sc.nextLine()));

                dogs.add(d);
                allPets.add(d);
            }
        }

        // ---------- QUESTION 5 ----------
        if (!dogs.isEmpty()) {
            double sum = 0;
            double min = dogs.get(0).getWeight();
            double max = dogs.get(0).getWeight();

            for (Dog d : dogs) {
                double w = d.getWeight();
                sum += w;
                if (w < min) min = w;
                if (w > max) max = w;
            }

            System.out.println("\nDog Weight Statistics:");
            System.out.println("Average Weight: " + (sum / dogs.size()));
            System.out.println("Minimum Weight: " + min);
            System.out.println("Maximum Weight: " + max);
        }

        // ---------- QUESTION 6 (MENU) ----------
        int choice;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Cat");
            System.out.println("2. Add Dog");
            System.out.println("3. Remove Cat");
            System.out.println("4. Remove Dog");
            System.out.println("0. Quit");
            System.out.print("Enter choice: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    Cat c = new Cat();
                    System.out.print("Enter name: ");
                    c.setName(sc.nextLine());
                    System.out.print("Enter coat color: ");
                    c.setCoatColor(sc.nextLine());
                    cats.add(c);
                    allPets.add(c);
                    break;

                case 2:
                    Dog d = new Dog();
                    System.out.print("Enter name: ");
                    d.setName(sc.nextLine());
                    System.out.print("Enter weight: ");
                    d.setWeight(Double.parseDouble(sc.nextLine()));
                    dogs.add(d);
                    allPets.add(d);
                    break;

                case 3:
                    System.out.print("Enter cat name to remove: ");
                    String catName = sc.nextLine();
                    cats.removeIf(cat -> cat.getName().equalsIgnoreCase(catName));
                    allPets.removeIf(p -> p.getName().equalsIgnoreCase(catName));
                    break;

                case 4:
                    System.out.print("Enter dog name to remove: ");
                    String dogName = sc.nextLine();
                    dogs.removeIf(dog -> dog.getName().equalsIgnoreCase(dogName));
                    allPets.removeIf(p -> p.getName().equalsIgnoreCase(dogName));
                    break;
            }

        } while (choice != 0);

        System.out.println("Program Ended.");
    }
}
