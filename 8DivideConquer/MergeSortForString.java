

public class MergeSortForString {
    
    public static void merge(String arr[] , int l , int mid, int r){
        String temp[] = new String[r-l+1];

        int i=l;
        int j=mid+1;
        int k = 0;

        while(i <= mid && j <= r){
            if(isSmaller(arr[i], arr[j])){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=r){
            temp[k++] = arr[j++];
        }

        for(k=0; k<temp.length;k++){
            arr[k+l] = temp[k];
        }




    }
    public static void mergeSort(String arr[] ,int l , int r){
        if(l == r){
            return;
        }
        int mid = l + (r - l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);

        merge(arr,l,mid,r);
    }



    public static boolean isSmaller(String str1, String str2){
        if(str1.compareTo(str2) < 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String arr[] = {"sun","earth","mars","mercury"};
        mergeSort(arr, 0, arr.length-1);
        
        for(String s : arr){
            System.out.print(s + " ");
        }
    }
}
