import java.util.ArrayList;
import java.util.*;
public class Solution {
	public static int maximumProduct(ArrayList<Integer> arr, int n) {
		//mx For Maximum Product
        int mx=arr.get(0);
        //mn For Minimum Product
        int mn=arr.get(0);
        int ans=arr.get(0);
        
        for(int i=1;i<n;i++){
            //if we get 0 in array
            if(arr.get(i)==0)
            {
                mx=1;
                mn=1;
            }
        // 3 5 -2 -4 output:120
        // -3 -1 0 4 output:4   
            int temp=mx*arr.get(i);
            //find maximum element
            mx=Math.max(temp,mn*arr.get(i));
            mx=Math.max(mx,arr.get(i));
            //find minimum element
            mn=Math.min(temp,mn*arr.get(i));
            mn=Math.min(mn,arr.get(i));
            
            ans=Math.max(ans,mx);
         }
        return ans;
	}
}