import java.util.*;
public class ArrayLInearS {
    public static int LinearSearch(int numbers[], int key){ //timecomplexity o  
        for(int i=0; i<numbers.length; i++){
            if ( key == numbers[i]) {
                return i;

            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12};
        int key = 10;
       int index = LinearSearch(numbers,key);
       if (index == -1) {
        System.out.println("Not Found");

       }else{
        System.out.println("Key is at index " + index);
       }



    }

}
