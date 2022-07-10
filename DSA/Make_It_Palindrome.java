public class Solution 
{
    public static int palindrome(int[] A)
	{
        //Base Case
        int n=A.length;
        if(n==1){
            return 0;
        }
        
		int operation=0;
        int j=n-1;
        for(int i=0;i<=j;){
          //when both elements are same ex {1,4,5,1};
            if(A[i]==A[j]){
              i++;
              j--;
          }    
            //if left element is greater ex {5,2,3,1};
            else if(A[i]>A[j]){
                j--;
                A[j]+=A[j+1];
                operation++;
            }
            //if right element id greater ex{1,3,2,5};
            else{
                i++;
                A[i]+=A[i-1];
                operation++;
            }
        }
        
        return operation;
	}

}