package week2;

import java.util.Scanner;
public class Program13_AverageCalculator{
public static void main(String[] args) {

    //Step 1: Create a Scanner object to read input from the user
    Scanner scanner = new Scanner(System.in);

    //Step 2; Prompt the user to enter three numbers
    System.out.print("Enter the first number:");
    double number1 = scanner.nextDouble();

    System.out.print("Enter the second number:");
    double number2 = scanner.nextDouble();

    System.out.print("Enter the third number:");
    double number3 = scanner.nextDouble();

    //Step 3: Calculate the average of the three numbers
    double average = (number1 + number2 + number3) / 3;

    //Step 4: Display the calculated average
    System.out.println("The average of" + number1 +"," + number2 +",and" + number3 +"is:" + average);

    //Step 5: Close the scanner to release resources(optional but recommended)
    scanner.close();

  }

}
