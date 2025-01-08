public class QuickSort {  // O(nlongn)  worst case = O(n2)  when pivot is a always larger or smaller
    
    public static void quickSort(int arr[] ,int si,int ei){
        if(si >= ei){
            return;
        }  
        // last element 
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx-1);
        quickSort(arr, pIdx+1, ei);

    }

    public static int partition(int arr[], int si, int ei){
       int pivot = arr[ei];
       int  i = si -1 ; // to make place for element smaller than pivot

       for(int j = si; j<ei; j++){
          if(arr[j] <= pivot){
            i++;
            //swap
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
          }
       }
       i++;
       int temp = pivot;
       arr[ei] = arr[i];
       arr[i] = temp;
       return i;
    }
    public static void main(String[] args) {
        int arr[] = {3,5,2,1,8,2,4,9};
        int n  = arr.length;
        quickSort(arr,0, n-1);

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
