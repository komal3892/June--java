package july9;

import java.util.Scanner;

public class CalculatorOperator {
    public static  void main(String[] args){

        System.out.println("perform calculation by using operators");

          Scanner scanner=new Scanner(System.in);

          System.out.println("Enter first number");
          int num1=scanner.nextInt();

          System.out.println("Enter second number");
          int num2=scanner.nextInt();

          int num3;

          System.out.println("choose an operator(+,-,*,%)");
        char operator = scanner.next().charAt(0);


          if (operator=='+')
          {
              num3=num1+num2;
              System.out.println("sum of num1 and num2 = " + num3);
          }
        else if (operator=='-')
        {
            num3=num1-num2;
            System.out.println("sub of num1 and num2 =" + num3);
        }
       else if (operator=='*')
        {
            num3=num1*num2;
            System.out.println("mul of num1 and num2 = " + num3);
        }
        else if (operator=='%')
        {
            num3=num1%num2;
            System.out.println("div of num1 and num2 =" + num3);
        }
        else {

            System.out.println("invalid output");
          }

    }
}
