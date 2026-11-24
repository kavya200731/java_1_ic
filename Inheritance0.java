class Parent{
    void name(){
        System.out.println("This is parent class");
    }
}
class Child extends Parent{
}
class Child2 extends Parent{
}
public class Inheritance0 {
    public static void main(String[] args) {
        Child c=new Child();
        c.name();
        Child2 c2=new Child2();
        c2.name();
    }
}