/**
 * Created by User on 16.02.2016.
 */

import java.util.Scanner;

public class ScannerExample {


    public static void main(String[] args) {

        int a;
        int b;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number: ");
        a = scanner.nextInt();

        System.out.println("Input second number: ");
        b = scanner.nextInt();

        int sum = a + b;
        System.out.println("The sum is: " + sum);
    }
}
