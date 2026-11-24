import java.util.Scanner;

public class LARGEST_OF_THREE_NUMBERS1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = scanner.nextInt();

        System.out.print("Enter second number: ");
        int second = scanner.nextInt();

        System.out.print("Enter third number: ");
        int third = scanner.nextInt();

        if (first >= second) {
            if (first >= third) {
                System.out.println("Largest number: " + first);
            } else {
                System.out.println("Largest number: " + third);
            }
        } else {
            if (second >= third) {
                System.out.println("Largest number: " + second);
            } else {
                System.out.println("Largest number: " + third);
            }
        }

        scanner.close();
    }
}