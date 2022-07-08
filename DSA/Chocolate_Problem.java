import java.util.Collection;
import java.util.*;
public class Solution {
	static int findMinDiff(int n, int m, ArrayList<Integer> chocolates) {
		Collections.sort(chocolates);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=n-m;i++){
            int temp=chocolates.get(i+m-1)-chocolates.get(i);
            min=Math.min(min,temp);
        }
        return min;
	}
}