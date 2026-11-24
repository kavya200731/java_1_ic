class Device{
    String powerSource;
    void turnOn(){
        System.out.println( " Device powered on");
    }
}
class Mobile extends Device{
    double screenSize;
    void makeCall(){
        System.out.println("Making a call");
    }

}
class Android extends Mobile{
    void openPlayStore(){
        System.out.println("Opening Play Store");
    }
}
class Iphone extends Mobile{
    void openAppStore(){
        System.out.println("Opening App Store");
    }
}
public class Inheritance44 {
    public static void main(String[] args){
        Android a=new Android();
        a.turnOn();
        a.makeCall();
        a.openPlayStore();

        Iphone i=new Iphone();
        i.turnOn();
        i.makeCall();
        i.openAppStore();
    }
}