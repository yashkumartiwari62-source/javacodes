// Java program for simple calculator
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        double num1, num2, result = 0;
        char op;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        num1 = sc.nextDouble();

        System.out.println("Enter the second number:");
        num2 = sc.nextDouble();

        System.out.println("Enter the operator (+, -, *, /):");
        op = sc.next().charAt(0);

        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero!");
                    sc.close();
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                sc.close();
                return;
        }

        System.out.println("Result: " + num1 + " " + op + " " + num2 + " = " + result);
        sc.close();
    }
}
