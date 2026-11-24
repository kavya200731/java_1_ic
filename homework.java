import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1. Multiplication Table");
        System.out.println("2. Prime Number Checker");
        System.out.println("3. Factorial");
        System.out.println("4. Fibonacci Series");
        System.out.println("5. Palindrome Number Checker");
        System.out.println("6. Armstrong Number Checker");
        System.out.print("Choose an option: ");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        } else if (choice == 2) {
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            boolean isPrime = number >= 2;
            for (int i = 2; i <= Math.sqrt(number) && isPrime; i++) {
                if (number % i == 0) {
                    isPrime = false;
                }
            }

            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        } else if (choice == 3) {
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            System.out.println("Factorial = " + factorial);
        } else if (choice == 4) {
            System.out.print("Enter number of terms: ");
            int terms = input.nextInt();

            int first = 0;
            int second = 1;

            for (int i = 1; i <= terms; i++) {
                System.out.print(first + " ");
                int next = first + second;
                first = second;
                second = next;
            }
        } else if (choice == 5) {
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            int original = number;
            int reverse = 0;

            while (number != 0) {
                int digit = number % 10;
                reverse = reverse * 10 + digit;
                number /= 10;
            }

            if (original == reverse) {
                System.out.println(original + " is a palindrome.");
            } else {
                System.out.println(original + " is not a palindrome.");
            }
        } else if (choice == 6) {
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            int original = number;
            int sum = 0;

            while (number != 0) {
                int digit = number % 10;
                sum += digit * digit * digit;
                number /= 10;
            }

            if (original == sum) {
                System.out.println(original + " is an Armstrong number.");
            } else {
                System.out.println(original + " is not an Armstrong number.");
            }
        } else {
            System.out.println("Invalid option.");
        }

        input.close();
    }
}