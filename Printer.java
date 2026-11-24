public class Printer {
    public void print(String text) {
        System.out.println("Text: " + text);
    }

    public void print(int number) {
        System.out.println("Integer: " + number);
    }

    public void print(double decimal) {
        System.out.println("Decimal: " + decimal);
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print("Hello");
        printer.print(42);
        printer.print(3.14);
    }
}