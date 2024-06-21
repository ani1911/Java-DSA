public class javaBasic{

    public static int multiply(int a, int b){
        int product = a * b;
        return product;
    }

    public static int factorial(int n){
        int f = 1;

        for(int i = 1; i<=n ; i++){
            f = f * i;
        }

        return f;

    }

    public static int binCoeff(int n , int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }

    public static boolean isPrime(int n){
    //    boolean isPrime = true;

    if(n == 2){
        return true;
    }

       for(int i = 2; i<=n-1; i++){
        if ( n % i == 0) {
            // isPrime = false;
            return false;
          }
       }
       return true;
     }

     public static void primesInRange(int n){
        for(int i=2; i<=n; i++){
            if (isPrime(i)){
                System.out.print(i+ " ");
            }
        }
        System.out.println();
     }

     public static void binToDec(int binNum){
        int pow = 0;
        int orginal = binNum;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

            pow++;
            binNum = binNum/10;

        }
        System.out.println("decimal of " + orginal + " = " + decNum);

     }

     public static void decToBin(int n ){
        int Mynum = n;
        int pow = 0;
        int binNum = 0;

        while (n > 0) {
            int rem = n % 2 ;
            binNum = binNum + (rem * (int) Math.pow(10, pow));

            pow++;
            n = n/2;

        }
        System.out.println("Binary of " + Mynum + " = " + binNum);
     }






    public static void main(String[] args) {
        // int a = 3;
    //     int b = 5;
    //    int prod = multiply(a, b);
    //    System.out.println("a * b = " + prod);
    //    prod = multiply(10,30);
    //    System.out.println(prod);

    // System.out.println(binCoeff(5, 2));
    // System.out.println(isPrime(2));

    //   primesInRange(30);

    // binToDec(101);

    decToBin(7) ;







    }
}


