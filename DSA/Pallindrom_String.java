public class Solution {

	public static boolean checkPalindrome(String str) {
	
	   //String str="c1 O$d@eeD o1c";
       str=str.replace(" ","");
       str=str.toLowerCase();
       int i=0;
       String ans="";
       while(i<str.length()){
           if((str.charAt(i)>='1' && str.charAt(i)<='9')||str.charAt(i)>='a' && str.charAt(i)<='z'){
               ans+=str.charAt(i);
           }
           i++;
       }
        return isPalli(ans);
     }
    
    public static boolean isPalli(String ans){
        int i=0;
        int j=ans.length()-1;
        while(i<j){
           if(ans.charAt(i)!=ans.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}