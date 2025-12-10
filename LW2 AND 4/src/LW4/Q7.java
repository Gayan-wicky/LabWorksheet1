package LW4;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        while(true) {
            int num;
            int count=0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number:");
            num = scanner.nextInt();
            if(num<0) {
                break;
            }else{
                while(num>0){
                    count++;
                    num/=10;

                }
                System.out.println("the number of digit:"+count);
            }


        }



    }
}


