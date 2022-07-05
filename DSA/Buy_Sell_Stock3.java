//Best Time to Buy and Sell a Stock using Dynamic Programming 
// Time complexity-O(N) , Space complexity-O(N);
import java.util.*; 
public class Solution {
	public static int maxProfit(ArrayList<Integer> prices, int n) {
        //Create an Empty Array
        int profit[]=new int[n];
        //10 22 5 75 65 80
        int mx=prices.get(n-1);//mx=80
        int mn=prices.get(0);//mn=10
        // First Iteration
        for(int i=n-2;i>=0;i--){
            if(prices.get(i)>mx){
                mx=prices.get(i);
            }
            profit[i]=Math.max(profit[i+1],mx-prices.get(i));
        }//After First Iteration
        //profit[]= 75 75 75 15 15 0
        
        // Second Iteration
        for(int i=1;i<n;i++){
            if(prices.get(i)<mn){
                mn=prices.get(i);
            }
            profit[i]=Math.max(profit[i-1],profit[i]+(prices.get(i)-mn));
        }//After Second Iteration
         //profit[]=75 87 87 87 87 87
        
        int result=profit[n-1];//result=87
        return result;
	}
}