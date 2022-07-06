import java.util.*;
//Time complexity O(N) and space O(N);
public class Solution {
	public static ArrayList<Integer> countTheNumber(ArrayList<Integer> arr, int n, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        int count=n/k;
        //let arr[]={1,2,3,3,3,3,4,4,4,1,2,0};
        //and k=4;
        //Majority Elements >=n/k ie. 3,4
        for(int i=0;i<n;i++){
            if(!map.containsKey(arr.get(i))){
                map.put(arr.get(i),1);
            }
            else{
                map.put(arr.get(i),map.get(arr.get(i))+1);
            }
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(map.get(arr.get(i))>=count){
                map.put(arr.get(i),0);
                list.add(arr.get(i));
            }
        }
       return list;
	}
}
