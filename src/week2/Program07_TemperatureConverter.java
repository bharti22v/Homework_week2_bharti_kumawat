package week2;

import java.util.Scanner;

public class Program07_TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit:");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Temperature in Celsisus:" + celsius + "°C");
        scanner.close();
    }
}
