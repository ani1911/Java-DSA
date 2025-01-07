// multiple inheritance not possible in java c inherit property from a and b
public class Inheritance {
    public static void main(String[] args) {
        Mammal human = new Mammal();
        human.walk();
        human.eat();
    }
}

class Animal {
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("walks");
    }
}


