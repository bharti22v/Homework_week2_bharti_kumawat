package week2;

import java.util.Scanner;

public class Program08_TriangleAreaCalculator {
    public static void main(String[] args) {
        //Step 1: Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        //Step 2: Prompt the user to enter the base and height of the triangle
        System.out.print("Enter the base length of the triangle:");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle:");
        double height = scanner.nextDouble();

        //Step 3: Calculate the area of the triangle using the formula: Area = 0.5 * base * height
        double area = 0.5* base * height;

        //Step 4: Display the calculated area
        System.out.print("The area of the triangle with base" + base +"and height" +
                height + "is" + area);
        scanner.close();
    }
}
