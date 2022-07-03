import java.util.*;
public class Solution {
    
    public static void rearrange(int[] arr) {
       // Create an Array for storing positive and negative elements.
       ArrayList<Integer>negative=new ArrayList<Integer>();
       ArrayList<Integer>positive=new ArrayList<Integer>();
        
        int i=0,j=0,k=0;
        for(i=0;i<arr.length;i++){
            if(arr[i]>=0){
              positive.add(arr[i]);
              j++;
            }
            else{
              negative.add(arr[i]);
              k++;
            }
        }
        
        i=0;
        j=0;
        k=0;
        //Retriving element from positive and negative array into the         orignal array. 
        while(i<arr.length)
        {
           if(j<negative.size())
            {
               arr[i]=negative.get(j);
               j++;
               i++;
            }
            if(k<positive.size())
            {
               arr[i]=positive.get(k);
               k++;
               i++;
            }
        }   
      }
   }