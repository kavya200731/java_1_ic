import java.util.Scanner;

public class even_odd{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Check if a number is even or odd");
        System.out.println("2. Check if a year is a leap year");
        System.out.print("Enter choice: ");

        int choice = input.nextInt();

        if (choice == 1) {
            System.out.print("Enter an integer: ");
            int number = input.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd.");
            }
        } else if (choice == 2) {
            System.out.print("Enter a year: ");
            int year = input.nextInt();

            boolean isLeapYear = (year % 400 == 0) ||
                                 (year % 4 == 0 && year % 100 != 0);

            if (isLeapYear) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        } else {
            System.out.println("Invalid choice.");
        }

        input.close();
    }
}