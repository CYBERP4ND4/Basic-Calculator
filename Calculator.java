import java.util.Scanner;

public class Calculator {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter first number: ");
        double num1 = input.nextInt();

        System.out.print("Enter second number: ");
        double num2 = input.nextInt();

        System.out.print("Choose operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        switch (operator) {
            case '+' -> addition(num1, num2);
            case '-' -> subtraction(num1, num2);
            case '*' -> multiplication(num1, num2);
            case '/' -> division(num1, num2);
            default -> System.out.println("Invalid Operator");
        }

    }

    static void addition(double num1, double num2) {
        System.out.println("Result: " + (num1 + num2));

    }

    static void subtraction(double num1, double num2) {
        System.out.println("Result: " + (num1 - num2));

    }

    static void multiplication(double num1, double num2) {
        System.out.println("Result: " + (num1 * num2));

    }

    static void division(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Divisor can not be 0.");
        } else {
            System.out.println("Result: " + (num1 / num2));
        }
    }

}
