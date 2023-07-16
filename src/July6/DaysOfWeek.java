package July6;

import java.util.Scanner;

public class DaysOfWeek {

    public static void main(String[] arg) {
        System.out.println("Enter day of the week");

        Scanner scanner = new Scanner(System.in);
        System.out.println("day of the week");
        int x = scanner.nextInt();

        if (x == 1) {
            System.out.println(" day is Monday");
        }
        if (x == 2) {
            System.out.println(" day is Tuesday");
        }
        if (x == 3) {
            System.out.println(" day is wednesday");
        }
        if (x == 4) {
            System.out.println(" day is thursday");
        }
        if (x == 5) {
            System.out.println(" day is friday");
        }
        if (x == 6) {
            System.out.println(" day is saturday");
        }
        if (x == 7) {
            System.out.println(" day is sunday");
        }
        if (x >7) {
            System.out.println("invalid input");
        }
    }
}