package LW01;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String fname = input.nextLine();
        System.out.println("Enter your middle name: ");
        String mname = input.nextLine();
        System.out.println("Enter your last name: ");
        String lname = input.nextLine();

        System.out.println("Name:"+lname+","+fname+" "+mname.substring(0,1));


    }
}