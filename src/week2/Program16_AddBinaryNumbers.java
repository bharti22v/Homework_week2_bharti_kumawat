package week2;

import java.util.Scanner;

public class Program16_AddBinaryNumbers {

    public static void main(String[] args) {
        // Step 1: Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Step 2: Prompt the user to input the first binary number
        System.out.print("Input first binary number: ");
        String binary1 = scanner.nextLine();

        // Step 3: Prompt the user to input the second binary number
        System.out.print("Input second binary number: ");
        String binary2 = scanner.nextLine();

        // Step 4: Convert binary strings to decimal integers
        int decimal1 = Integer.parseInt(binary1,2);
        int decimal2 = Integer.parseInt(binary2, 2);

        // Step 5: Add the decimal integers
        int sum = decimal1 + decimal2;

        // Step 6: Convert the sum back to a binary string
        String binarySum = Integer.toBinaryString(sum);

        // Step 7: Display the result
        System.out.println("Sum of two binary numbers: " + binarySum);

        // Step 8: Close the scanner to release resources (optional but recommended)
        scanner.close();
    }
}























