// interface is blueprint of class
// it is use for multiple inheritance
// to achieve total abstraction

public class Interface {
    public static void main(String[] args) {
        Rook r = new Rook();
        r.moves();
    }
}


interface ChessPlayer{
    void moves();
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}


// multiple inheritance

interface A{

}

interface B{

}

class C implements A , B{

}


