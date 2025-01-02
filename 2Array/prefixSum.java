public class prefixSum {
    public static void maxSubarraySum(int numbers[]){
        int CurrSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0]= numbers[0];
        // calculating prefix array
        for(int i=1; i<numbers.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;

                CurrSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];


            }
            if (CurrSum > maxSum) {
                maxSum = CurrSum;

            }
        }
        System.out.println("Maximum sum of subarray : " + maxSum);

    }
        public static void kadanes(int numbers[]){
            int cs = 0;
            int ms = Integer.MIN_VALUE;

            for(int i= 0; i<numbers.length; i++){
                cs = cs + numbers[i];
                if (cs < 0) {
                    cs = 0;
                 }
                 ms = Math.max(cs, ms);
            }
            System.out.println("Maximum sum is:" + ms);
        }

    public static void main(String[] args) {
        int numbers[] = {-2,-3,4,-1,-2,-3};
        kadanes(numbers);
    }

}
