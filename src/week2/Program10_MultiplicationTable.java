package week2;

import java.util.Scanner;

public class Program10_MultiplicationTable {
    public static void main(String[] args) {
        //Step 1: Create a Scanner object ti read input from the user
        Scanner scanner = new Scanner(System.in);

        //step 2: Prompt the user to enter a number
        System.out.print("Input a number:");
        int number = scanner.nextInt();

        //Step 3: Print the multiplication table up to 10 for the given number
        System.out.println("Multiplication table for" + number +":");

        for (int i= 1;i < = 10; i++){
            int product = number *i;
            System.out.println(number + "x" + i +"=" + product);
        }
        scanner.close();
    }
}
