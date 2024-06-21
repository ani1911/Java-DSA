public class MaxSubarraySum {
    public static void maxSubarraySum(int numbers[]){
        int CurrSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
           int start = i;
            for(int j=i; j<numbers.length; j++){
               int end = j;
                CurrSum = 0;
                for(int k = start; k<= end ; k++){
                    CurrSum += numbers[k];
                    System.out.println(CurrSum);

                }
            }
            if (CurrSum > maxSum) {
                maxSum = CurrSum;

            }
        }
        System.out.println("Maximum sum is :" + maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        maxSubarraySum(numbers);
    }

}
