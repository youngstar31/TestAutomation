package chapter3;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        //Initialize values we know
        int quota = 10;

        //Get unknown values
        System.out.println("Enter the number of sales you mmade this week:");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Make a decsion on the path
        if (sales >= quota){
            System.out.println("Congrats! You've met your quota");
        }
        else {
            int salesShort = quota - sales;
            System.out.println("You did not make your quota. You were " + salesShort + " sales short");
        }
    }
}
