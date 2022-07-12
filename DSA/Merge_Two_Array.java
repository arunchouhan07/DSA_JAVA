import java.util.*;
public class Solution {
    public static double median(int[] a, int[] b) {
   //let a[]={2,4,6,8}; and  b[]={1,3,5,7}; 
        int temp[]=new int[a.length+b.length];
      
        int k=0;
        //putting array a[] into temp array;
        for(int i=0;i<a.length;i++){
            temp[k]=a[i];
            k++;
        }
        //putting array b[] into temp array;
        for(int i=0;i<b.length;i++){
            temp[k]=b[i];
            k++;
        }
        // now temp array[]={2,4,6,8,1,3,5,7};
        //Sort the temp array;
        Arrays.sort(temp);
        //after sorting ={1,2,3,4,5,6,7,8};
        
        Double ans;
        //if length is even.
        if((a.length+b.length)%2==0){
            ans=(Double.valueOf(temp[(a.length+b.length)/2])+Double.valueOf(temp[(a.length+b.length-1)/2]))/2;
        }
        //if length is odd.
        else{
            ans=Double.valueOf(temp[(a.length+b.length)/2]);
        }
        
        return ans;
    }
}