public class SearchRotatedSorted { // O(nlogn)  array is sorted and rotated about pivot
    public static int search(int arr[], int tar, int si, int ei){

        //base case
        if(si > ei){
            return -1;
        }

         int mid = si + (ei - si)/2;
         
         // case found
         if(arr[mid] == tar) return mid;

         // mid on l1
         if(arr[si] <= arr[mid]){
             //case a : left
             if(arr[si] <= tar && tar <= arr[mid]){
                return search(arr,tar,si,mid-1);
             }else{
                // case b : right
                return search(arr,tar,mid+1,ei);
             }
         }else{
            //mid on l2

            // case c : l2 right
            if(arr[mid] <= tar && tar <= arr[ei]){
                return search(arr,tar,mid+1,ei);
            }else{
                 // case d : l2 left
                 return search(arr,tar,si,mid-1);
            }

         }

    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        int tarId = search(arr, target,0,arr.length-1);
        System.out.println(tarId);
    }
}
