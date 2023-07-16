package july9;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args)
    {
        System.out.println("Calculate numbers");
        System.out.println("find sum of num1 and num2");
        System.out.println("find sub of num1 and num2 ");
        System.out.println("find mul of num1 and num2");

        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter first number");
       int num1= scanner.nextInt();

       System.out.println("Enter second number");
       int num2=scanner.nextInt();

       System.out.println("what operation do you want");
       int input= scanner.nextInt();

       int num3;

if (input==1)
{
    num3=num1+num2;
    System.out.println("Sum of num1 and num2 " + num3);
}
else if (input==2)
{
    num3=num1-num2;
    System.out.println("Sub of num1 and num2 " + num3);
}

else if (input==3)
{
    num3=num1*num2;
    System.out.println("mul of num1 and num2 " + num3);
}
else if (input==4)
{
    num3=num1%num2;
    System.out.println("div of num1 and num2 " + num3);
}
else {
    System.out.println("invalid output");
}
    }
}
