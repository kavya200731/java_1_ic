class Car{
    private int speed=300;
    public void getter(){
        System.out.println(speed);

    }
    public void setter(int s){
        speed=s;
    }
}
    public class getter_setter1 {
        public static void main(String[] args){
            Car c=new Car();
            c.getter();
            c.setter(1000);
            c.getter();
        }
    
}