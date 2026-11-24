public class homework_array2 {
    static class Employee {
        private String name;
        private double baseSalary;

        public Employee(String name, double baseSalary) {
            this.name = name;
            this.baseSalary = baseSalary;
        }

        public void displayBasicInfo() {
            System.out.println("Name: " + name);
            System.out.println("Base Salary: " + baseSalary);
        }

        public String getName() {
            return name;
        }

        public double getBaseSalary() {
            return baseSalary;
        }
    }

    static class Developer extends Employee {
        private String programmingLanguage;

        public Developer(String name, double baseSalary, String programmingLanguage) {
            super(name, baseSalary);
            this.programmingLanguage = programmingLanguage;
        }

        public void setProgrammingLanguage(String programmingLanguage) {
            this.programmingLanguage = programmingLanguage;
        }

        public void writeCode() {
            System.out.println(getName() + " is writing code in " + programmingLanguage + ".");
        }
    }

    static class Tester extends Employee {
        private String testingTool;

        public Tester(String name, double baseSalary, String testingTool) {
            super(name, baseSalary);
            this.testingTool = testingTool;
        }

        public void setTestingTool(String testingTool) {
            this.testingTool = testingTool;
        }

        public void runTests() {
            System.out.println(getName() + " is running tests using " + testingTool + ".");
        }
    }

    public static void main(String[] args) {
        Developer developer = new Developer("Alice", 75000, "Java");
        Tester tester = new Tester("Bob", 65000, "Selenium");

        developer.displayBasicInfo();
        developer.writeCode();

        System.out.println();

        tester.displayBasicInfo();
        tester.runTests();
    }
}