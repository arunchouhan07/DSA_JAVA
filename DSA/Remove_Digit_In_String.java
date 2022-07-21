import java.util.*;
// Remove Digits In String...
class Demo{
    public static void main(String[] args) {
        String str="Hello12World534";
        String result="";
        for(int i=0;i<str.length();i++){
            if(!Character.isDigit(str.charAt(i))){
                result+=str.charAt(i);
            }
        }
        System.out.println("String after Remove Digit is : "+result);
    }
}

// Output :- HelloWorld