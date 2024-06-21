import java.util.*;

public class ArrayFunction {

    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks [i] = marks[i]+ 1;

        }
    }
    public static void main(String[] args) {
        int marks[] = {95,98,96};
        update(marks);
        // print our marks
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+ " ");
        }
        // System.out.println();
    }

}
