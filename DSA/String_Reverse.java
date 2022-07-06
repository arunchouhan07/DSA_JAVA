class Solution {

  public static String stringReverse(char[] arr) {
      int n=arr.length-1;
      //in Java String is Immutable so we use StringBuffer class .
      StringBuffer str=new StringBuffer();
      
      while(n>=0){
         str.append(arr[n]);
          n--;
      }
      
      return str.toString();
  }
}