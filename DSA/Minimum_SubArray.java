public class Solution {
	public static int minSubArrayLen(int arr[], int target, int n) {
		int ans=Integer.MAX_VALUE;
     
        for(int i=0;i<n;i++){
            int sum=0;
            int count=i;        
            while(count<n){
                sum+=arr[count];
                if(sum>target){
                    int temp=count-i+1;
                    ans=Math.min(ans,temp);
                    break;
                }
                else{
                    count++;
                }
            }
        }
        return  (ans==Integer.MAX_VALUE)? 0:ans;
	}
}
