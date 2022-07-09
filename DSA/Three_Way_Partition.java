import java.util.ArrayList;
import java.util.*;
public class Solution {
    public static ArrayList<Integer> threeWayPartition(ArrayList<Integer> arr, int n, int a, int b) {
      //let array[]={2,0,1,3,4}; and a=2; b=3;
        int start=0;
        int end=n-1;
        
        for(int i=0;i<=end;){
          if(arr.get(i)<a){
              int temp=arr.get(start);
              arr.add(start,arr.get(i));
              arr.add(i,temp);
              start++;
              i++; 
          }   
            else if(arr.get(i)>b){
             int temp=arr.get(end);
             arr.add(end,arr.get(i));
             arr.add(i,temp);
             end--;
            }
            else{i++;}
        }
        
        return arr;
    }
}