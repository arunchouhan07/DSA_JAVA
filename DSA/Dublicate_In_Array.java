import java.util.*;

public class Solution {
	public static int findDuplicate(ArrayList<Integer> arr) {
	   for(int i=0;i<arr.size();i++)
       {
           //1 2 3 4 4 output: 4
           if(arr.get(Math.abs(arr.get(i)))>0){            arr.set(Math.abs(arr.get(i)),-1*arr.get(Math.abs(arr.get(i))));
           }
  
           else{
               return Math.abs(arr.get(i));}
           }
        return 0;
         
    }
}