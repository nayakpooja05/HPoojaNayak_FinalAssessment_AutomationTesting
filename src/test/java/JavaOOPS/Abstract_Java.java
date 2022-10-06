package JavaOOPS;

abstract class vehicle1{
    abstract void m1();
    void m2() {
        System.out.println("Given vehicles are: ");
    }
}
public class Abstract_Java extends vehicle1 {
    

    public static void main(String[] args) {
    	Abstract_Java obj = new Abstract_Java();
        
        obj.m2();
        obj.m1();

    }
    void m1() {
        System.out.println("Car,Bus,Truck");
    }

}

