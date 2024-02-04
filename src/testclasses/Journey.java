package testclasses;

 interface Vehicle {
    void start();
}
     
 class Car implements Vehicle {
    @Override
    public void start() {
          System.out.println("Travel by Car");
    }
}

 class Bike implements Vehicle {
     @Override 
     public void start() {
           System.out.println("Travel by Bike");
     }
}
         
// create main class Journey
 public class Journey {
     public static void main(String[] args) {
           Vehicle v = new Car();
           Vehicle v1 =new Bike();
           v.start();
           v1.start();
     }
}