import java.util.*;
public class Solution {
    public static boolean checkSubset(int[] arr1, int[] arr2, int n, int m) {
        //let arr1[]={9,3,6,5,1};
        //let arr2[]={1,3,3};
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        //now arr1[]={1,3,5,6,9};
        //now arr2[]={1,3,3};
        
        int i=0;
        int j=0;
        
        while(i<n && j<m){
            if(arr1[i]==arr2[j]){
                j++;
            }
            i++;
        }
        
        return j==m;
        
    }
}