//Time complexity O(N) and space O(1);
class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        //let arr[]={3,1,3,3,2};
        //majority element>n/2 ie 3
       int count=1;
       int maxIndex = 0;
       for(int i=1; i<size; i++)
       {
           if(a[i]==a[maxIndex])
           {
               count++;
           }
           else
           {
               count--;
           }
           
           if(count==0)
           {
               maxIndex = i;
               count=1;
           }
       }
       
       int candidate = a[maxIndex];
       int countCand = 0;
       
       for(int i=0; i<size; i++)
       {
           if(a[i]==candidate)
           {
               countCand++;
           }
       }
       if(countCand>size/2)
       {
           return candidate;
       }
       else
       {
           return -1;
       }
       
   }
}