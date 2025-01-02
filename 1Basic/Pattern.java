public class Pattern {

    public static void hollowrectangle(int totRows, int totCols) {
           //outer loop
        for(int i = 1; i <= totRows; i++){
            // inner loop
            for(int j = 1; j <= totCols; j++){
                // boundary condition
                if (i == 1 || i == totRows || j == 1 || j == totCols ) {
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

    }

    public static void inverted_rotated_half_pyramid(int n ){
        // outer loop
        for(int i =1; i<= n; i++){
            //space
            for(int j=1; j<= n-i; j++ ){
                System.out.print(" ");

            }
            //star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void inverted_half_pyramid_withNumber(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<= n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
     public static void floyds_triangle(int n){
        int counter = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }

     }
     public static void zero_one_triangle(int n){
        for(int i = 1; i<=n ; i++){
            for(int j = 1; j<=i; j++){
                if ((i+j) % 2 == 0) {
                    System.out.print("1");
                  }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
     }
     public static void butterfly(int n){
        // 1st half
        for(int i=1; i<=n; i++){
            // star  - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // space - 2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            // Star - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

        }
        // 2nd half
        for(int i=n; i>=1; i--){
           // star  - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // space - 2*(n-i)
            for(int j=1; j<=2*(n-i    ); j++){
                System.out.print(" ");
            }
            // Star - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void solid_rhombus(int n){
        for(int i=1; i<=n; i++){
            // space = (n-i)
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // star = **** or j =1 to n
            // System.out.print("*****");
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
    public static void hollow_rhombus(int n){
        for(int i=1; i<=n; i++){
            // spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // hollow rectangle
            for(int j =1; j<=n; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
    public static void diamond(int n){
        for(int i=1; i<=n; i++){
            // spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // stars = 2(i-1)+1
            for(int j =1; j<=(2*i -1); j++){
                System.out.print("*");
            }
            System.out.println();

        }
        //2nd half
        for(int i=n; i>=1; i--){
              // spaces
              for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // stars = 2(i-1)+1
            for(int j =1; j<=(2*i -1); j++){
                System.out.print("*");
            }
            System.out.println();

        }

    }
    public static void number_pyramid(int n){
        // outer loop
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //numbers
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
             }
             System.out.println();
        }

    }
    public static void palindromicPatternwithNums(int n){
        //outer loop
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // descending
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            // ascending
            for(int j=2; j<=i; j++){
                System.out.print (j);
            }
            System.out.println();
        }
    }







    public static void main(String[] args) {
       // hollowrectangle(4, 5);

    //    inverted_rotated_half_pyramid(4);

    // inverted_half_pyramid_withNumber(6);

    // floyds_triangle(6);
    // zero_one_triangle(5);
    // butterfly(4);
    // solid_rhombus(5);
    // hollow_rhombus(5);
    // diamond(4);
    // number_pyramid(5);
    palindromicPatternwithNums(5);



    }

}
