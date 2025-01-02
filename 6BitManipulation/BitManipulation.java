import java.util.*;

public class BitManipulation{

    public static void evenOrOdd(int n){
        int bitMask = 1; 
        if((n & bitMask) == 0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }

    public static void getIthbit(int n , int i){
        int bitMask = 1<<i;

        if((n & bitMask) == 0){
            System.out.println("bit is 0");
        }else{
            System.out.println("bit is 1");
        }
    }
    public static void setIthbit(int n, int i){
        int bitMask = 1<<i;

        System.out.println(n | bitMask);
    }

    public static void clearIthbit(int n, int i){
        int bitMask = ~(1<<i);
         System.out.println(n & bitMask);
    }

    public static int clearBitsRange(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }
   public static int countSetBit(int n){
        int count = 0;
        while (n>0) {
            if((n & 1) != 0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static int fastExpo(int a, int n){
        int ans = 1;
        while (n > 0) {
            if((n & 1) != 0){
                ans = ans * a;
            }
            a = a * a;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        // evenOrOdd(8);
        // getIthbit(10,2);

        // setIthbit(10, 2);
        // clearIthbit(10, 1);
        // System.out.println(clearBitsRange(10, 2, 4)); 
        // System.out.println(countSetBit(10));
        System.out.println(fastExpo(5, 3));
    }
}