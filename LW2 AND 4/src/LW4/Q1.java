package LW4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a,b,c,min;
        System.out.println("Enter number a:");
        a= scanner.nextInt();
        System.out.println("Enter number b:");
        b= scanner.nextInt();
        System.out.println("Enter number c:");
        c= scanner.nextInt();
        if(a<=b && a<=c){
            min=a;
        } else if (b<=c && b<=a) {
            min=b;
        }else
            min=c;
        System.out.println("The smallest nummber is: "+ min);
    }

    }
