
import java.util.*;

public class DSAsheet4 {

    public static boolean  containDuplicates(int nums[]){  
        // Approach 1 = Brute Force (O(n^2))
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums [] = {1,2,3,4};
        System.out.println(containDuplicates(nums));
      
    }
}
