public class Abstract {
    public static void main(String[] args) {
       Horse h = new Horse();
       h.walk();
       h.eat();
       
       System.out.println(h.color);
       
    
    }
}
abstract class Animal{  // can't create object of animal class
   String color; 
    Animal(){
        color = "brown";
    }

    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal{
    void walk(){
        System.out.println("walks on 2 legs");
    }

    void changeColor(){
        color = "dark Brown";
    }
}