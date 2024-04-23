package week2;

import java.util.Scanner;

public class Program09_TriangleAreaCalculator {
    public static void main(String[] args) {
        //Step 1: Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        //Step 2: Prompt the user to enter the base length of the triangle
        System.out.print("Enter the base length of the triangle:");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle:");
        double height = scanner.nextDouble();

        //Step 4: Calculate the area of the triangle using the formula:Area = 0.5 * base * height
        double area = 0.5 * base * height;

        //Step 5: Display the calculated area
        System.out.println("The area of the triangle with base " + " and height " + height +" is:" + area );

        //Step 6: Close the scanner to release resources (optional but recommended)
        scanner.close();

    }
}
