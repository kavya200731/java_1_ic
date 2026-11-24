class Person{
    String name;
    void displayPerson(){
        System.out.println("Name: "+name);
    }
}

class Employee extends Person{
    int empid;
    void displayEmployee(){
        System.out.println("Employee id: "+empid);
    }
}
class Manager extends Employee{
    String department;
    void displayManager(){
        System.out.println("Department: "+department);
    }
}

public class Inheritance33 {
    public static void main(String[] args){
        Manager m=new Manager();
        m.name="Shahida";
        m.empid=3247;
        m.department="IT";

        m.displayPerson();
        m.displayEmployee();
        m.displayManager();
    }
}