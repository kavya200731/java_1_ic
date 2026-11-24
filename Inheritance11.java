class Vehicle{
    String brand="BMW";
    public void honk(){
System.out.println("Beep! Beep!");
    }
}
class Car extends Vehicle{
    String modelName="M4";
    public void displayDetails(){
        System.out.println(brand+" ");
        System.out.println(modelName+" ");
    }
}
public class Inheritance11{
    public static void main(String[] args){
        Car c=new Car();
        c.honk();
        c.displayDetails();
        
    }
}