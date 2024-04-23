package week2;

import java.util.Scanner;

public class Program17_DecimalToBinary {

    public static void main(String[] args) {
        // Step 1: Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Step 2: Prompt the user to input a decimal number
        System.out.print("Input a Decimal Number: ");
        int decimalNumber = scanner.nextInt();

        // Step 3: Convert the decimal number to binary
        String binaryNumber = Integer.toBinaryString(decimalNumber);

        // Step 4: Display the binary representation
        System.out.println("Binary number is: " + binaryNumber);

        // Step 5: Close the scanner to release resources (optional but recommended)
        scanner.close();
    }

}
















