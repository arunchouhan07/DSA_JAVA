// Sort the array in 0_1_2 order.
import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        int i=0;
        int j=0;
        int k=arr.length-1;
        int temp;
        
        while(i<=k)
        {
           if(arr[i]==0)
          {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j++;
            i++;
          }
           else if(arr[i]==1)
          {
            i++;
          }
            
          else if(arr[i]==2)
          {
             temp=arr[i];
             arr[i]=arr[k];
             arr[k]=temp;
             k--;
           }
          }
    }
}