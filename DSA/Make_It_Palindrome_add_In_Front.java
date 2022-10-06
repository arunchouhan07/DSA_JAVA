class Solution {
public:
    int minChar(string str){
        int n =str.length();
        int i=0;
        int j=n-1;
        int ans;
        int last_index=n-1;
        while(i<=j){
            if(str[i]==str[j]){
                i++;
                j--;
            }
            else{
                i=0;
                last_index--;
                j=last_index;
            }
        }
        ans=n-1-last_index;
        return ans;
     }
};