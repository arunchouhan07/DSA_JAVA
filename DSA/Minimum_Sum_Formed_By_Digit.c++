class Solution{
    public:
    long long int minSum(int arr[], int n)
    {
        //let Array[]={6,8,4,5,2,3};
        sort(arr,arr+n);
        //after sort[]={2,3,4,5,6,8};
       long long int ans=0;
       int i=1;
       for(int j=n-1;j>=0;j-=2){
           ans+=i*arr[j];
           //if Array is odd
           if(j-1>=0){
           ans+=i*arr[j-1];
           }
           
           i*=10;
       }
       return ans;
        
    }
};