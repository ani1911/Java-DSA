public class Polymorphism {
   public static void main(String[] args) {
    //   Calculator cal = new Calculator();

    //   System.out.println(cal.sum(12,15));
    //   System.out.println(cal.sum((float)1.2,(float)1.5));
    //   System.out.println(cal.sum(12,15,10));


     Deer a = new Deer();
     a.eat();
   }
}


// method overloading
// class Calculator {
//    int sum (int a , int b){
//     return a+b;
//    }

//    float sum (float a , float b){
//     return a+b;
//    }

//    int sum (int a , int b , int c){
//     return a+b+c;
//    }
// }



// Method overriding (run time)

class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}