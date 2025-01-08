
public class MergeSort {

    
public static void mergeSort(int arr[], int l , int r){

    if(l>= r){
        return;
    }
    int mid = l + (r - l) /2 ;
    mergeSort(arr,l,mid);
    mergeSort(arr,mid+1,r);

    merge(arr,l,mid,r);
}

public static void merge(int arr[], int l, int mid, int r){

    int temp[] = new int[ r - l + 1];

    int i = l;
    int j = mid+1;
    int k = 0;


    while(i <= mid && j <= r){
        if(arr[i] < arr[j]){
            temp[k] = arr[i];
            i++;
        }else{
            temp[k] = arr[j];
            j++;
        }
        k++;
    }

    while (i<= mid) {
        temp[k++] = arr[i++];
    }
    while(j <= r){
        temp[k++] = arr[j++];
    }


    for(k = 0, i = l; k<temp.length; k++,i++){
        arr[i] = temp[k];
    }
}


public static void printArr(int arr[]){
    for(int i = 0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}




    public static void main(String[] args) {
        int arr[] = {7,5,9,3,2,1,5,};
        mergeSort(arr , 0 , arr.length - 1);
        printArr(arr);
    }
    
}
