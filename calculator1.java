import java.util.Scanner;

public class calculator1 {
     public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {

        System.out.println("Enter the first number:");
        int num1=s.nextInt();

        System.out.println("Enter the second number:");
        int num2=s.nextInt();

        System.out.println("Enter an operator (+,-,*,/): ");
        char operator = s.next().charAt(0);

        int result;

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero!");
                    return;
                }
                result = num1 / num2;
            }
            default -> {
                System.out.println("Invalid operator!");
                return;
            }
        }

        System.out.println("Result: " + result);
        }
    }
}