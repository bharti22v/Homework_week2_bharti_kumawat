package week2;

import java.util.Scanner;

public class Program05_Calculator {
    public void addition(double num1, double num2){
        double result = num1 + num2;
        System.out.println(num1 + "+" + num2 + " = " + result );

    }
    public void subtraction(double num1, double num2) {
        double result = num1 - num2;
        System.out.println(num1 + "-" + num2 + " = " + result);
    }
    public static void multiplication(double num1,double num2){
        double result = num1 * num2;
        System.out.println(num1 + " * " + num2 + "= " + result);

    }
    public static void division(double num1,double num2){
        if(num2!= 0){
        double result = num1 / num2;
        System.out.println(num1 + " / " + num2 + "= " + result);
        }else{
            System.out.println("Cannot divide by zero!");
            }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter one number:");
        double input1;
        double input2;
        input1 = scanner.nextDouble();
        System.out.println("Enter another number:");
        input2 = scanner.nextDouble();
        Program05_Calculator cal = new Program05_Calculator();
        cal.addition(input1,input2);
        cal.subtraction(input1,input2);
        multiplication(input1,input2);
        division(input1,input2);
    }

}

