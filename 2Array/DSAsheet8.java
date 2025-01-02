import  java.util.*;
public class DSAsheet8 {

    public static int stockProfit(int prices[]){
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        for(int i = 0; i<prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);

            }else{
                buyPrice = prices[i];
            }
        } 
        return maxProfit;

    }
    public static void main(String[] args) {
       int prices [] = {7,6,4,3,1};

       System.out.println(stockProfit(prices));

    }
    
}
