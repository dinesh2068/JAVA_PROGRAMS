package Java_programs;

public class javabstract{
    public static void main(String[] args) {
        Car car = new Car();
    }
}

abstract class Vehicle {
    int vehicleid;
    String name;
    public abstract void complyRegls();
    public abstract void capacitycheck();
    public void concreatemethod(){
        System.out.println("This is a concreate Method");
    }
}

class Car extends Vehicle{
    @Override
    public void complyRegls(){
        System.out.println("checked for comply");
    }
    @Override
    public void capacitycheck(){
        System.out.println("checked for comply");
    }
}

interface location{
    
    public void cleanlocation();
    public void hourlymessage();

}
interface defaultuser{
    public void showidcard();
}

class servicemanager implements location,defaultuser{
    public void cleanlocation(){
        throw new UnsupportedOperationException("Not supported yet");
    }
    public void hourlymessage(){
        System.out.println("checked for comply");
    }
}