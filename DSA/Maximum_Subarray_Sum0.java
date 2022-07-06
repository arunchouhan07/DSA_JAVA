class GfG
{
    int maxLen(int arr[], int n)
    {
      //Let arr[]={1 -1 3 2 -2  -8 1 7 10 23 } 
       Map<Integer,Integer>map=new HashMap<>();
       
       int maxLength=0;
       int currentLength=0;
       int sum=0;
       int i=0;
       
       while(i<n){
           sum+=arr[i];
           
           if(sum==0){
               currentLength=i+1;
           }
           else if(!map.containsKey(sum)){
               map.put(sum,i);
           }
           else
           {
               currentLength=i-map.get(sum);
           }
           i++;
           maxLength=Math.max(maxLength,currentLength);
       }
        return maxLength;
     }
}