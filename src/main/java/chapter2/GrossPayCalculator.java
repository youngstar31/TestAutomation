package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
// Calculate an employee's gross pay

    public static void main(String[] args) {
        //1. Get the number of hours worked

        System.out.println("Enter the number of hours the employee worked.");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //2. Get the hourly rate
        System.out.println("Enter the employee's pay rate.");
       double payRate = scanner.nextDouble();
       scanner.close();

        //3. Multiply hours and pay rate
        double grossPay = hours * payRate;

        //4. Display result
        System.out.println("The employee's gross pay is $" + grossPay);

    }


}
