abstract class Animal {
    abstract void sound(); // Just one method
}

interface Pet {
    void play(); // Single method in the interface
}

class Dog extends Animal implements Pet {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void play() {
        System.out.println("Dog plays");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound(); // Calls Dog's sound method
        d.play();  // Calls Dog's play method
    }
}
