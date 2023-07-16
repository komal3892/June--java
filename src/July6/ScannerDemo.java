package July6;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] arg){


        System.out.println("Sum of two numbers");



        Scanner scan1= new Scanner(System.in);
        System.out.println("Enter a first  number");
        int x=scan1.nextInt();

        Scanner scan2= new Scanner(System.in);
        System.out.println("Enter a second  number");
        int y= scan2.nextInt();

        int s=x+y;

        System.out.println("Sum of two numbers "+s );


    }
}
