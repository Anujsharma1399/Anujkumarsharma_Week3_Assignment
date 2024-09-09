// Base class
class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting");
    }
}

// Derived class Car
class Car extends Vehicle {
    Override
    public void start() {
        System.out.println("Car is starting");
    }
}

// Derived class Bike
class Bike extends Vehicle {
    Override
    public void start() {
        System.out.println("Bike is starting");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();  
        Vehicle myBike = new Bike();

        myCar.start();  
        myBike.start(); 
    }
}
