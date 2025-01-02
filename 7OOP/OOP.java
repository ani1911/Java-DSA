public class OOP {
    public static void main(String[] args ){
        Pen p1 = new Pen();
        p1.setColor("Black");
        p1.setTip(4);
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());

        Student s = new Student();
        s.calPercentage(50, 50, 50);
        System.out.println(s.percentage);
    }
}

class Pen{
   private  String color;
   private  int tip;

    Pen(){                                        
        color = "Blue";
        tip = 1;
    } 

    //shallow  copy constructor

    Pen(Pen p){
        color = p.color;
        tip = p.tip;
    }


    //deep copy constructor
    // int marks = new int[3];
    // copy one by one using for loop



    // java has garbage collector no need of destructor
    

    String getColor() {
        return this.color;
    }

    int getTip(){
        return tip;
    }

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}


class BankAccount{

    public String  username;
    private String password;


    public void setPassword(String pwd){
        password = pwd;
    }

}


class Student{
    String name;
    int age;
    float percentage;

    void calPercentage(int phy, int chem, int bio){
        percentage = (phy + chem + bio) /3 ;
    }
}
