import java.util.* ;
import java.io.*; 
public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
       //let arr[]={9 5 4 9 10 10 6};
       Set<Integer>set=new HashSet<Integer>();
        for(int num:arr){
            set.add(num);
        }
        //in Set=9 5 4 10 6
        
        int length=1;
        
        for(int num:arr){
            if(!set.contains(num-1)){
                int currentNum=num;
                int currentLength=1;
                
               while(set.contains(currentNum+1)){
                    currentNum+=1;
                    currentLength+=1;
                }
                
                length=Math.max(length,currentLength);
            
            }
        }
        return length;
    }
}