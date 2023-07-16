package July6;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] arg) {

        System.out.println("Find largest number");

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter first number");
        int x=scanner.nextInt();

        System.out.println("Enter second number");
        int y=scanner.nextInt();

        System.out.println("Enter third number");
        int z=scanner.nextInt();

        if (x>y && x>z)
        {
            System.out.println("x is largest number");
        }
        if (y>x && y>z)
        {
            System.out.println("y is largest number");
        }
       
        if (z>x && z>y)
        {
            System.out.println("z is largest number");
        }
    }
}