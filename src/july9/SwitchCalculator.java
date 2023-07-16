package july9;

import java.util.Scanner;

public class SwitchCalculator {

    public static void main (String[]arg)
    {
       System.out.println("     use calculator by using switch statement") ;

       Scanner scanner=new Scanner(System.in);

       System.out.println("Enter first number");
       int num1=scanner.nextInt();

       System.out.println("Enter second number");
        int num2=scanner.nextInt();

         System.out.println("operation to be perform");
         int num3=scanner.nextInt();

         switch(num3){

             case 1:
                 num3=num1+num2;
                 System.out.println("Sum of num1 +num2 =" + num3);
         }
    }
}
