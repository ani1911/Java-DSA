public class MajorityElement {
    // public static int majorityElement(int arr[]){  //Brute force  O(n^2)
    //     int majorelment = (arr.length)/2;
    //     int element = -1;
        
    //     for(int i =0 ; i< arr.length; i++){
    //          int count = 0;
    //          for(int j= 0; j<arr.length; j++){
    //             if(arr[i]==arr[j]){
    //                 count++;
    //             }
    //          }
    //          if(majorelment <= count){
    //             majorelment = count;
    //             element = arr[i];
    //          }
             
    //     }
    //     return element;
    // }




    

     public static void main(String[] args) {
        int arr[] = {3,2,3,2,2,2,3};

        System.out.println(majorityElement(arr));
    }
}
