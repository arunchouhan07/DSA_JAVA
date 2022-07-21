import java.util.*;
// Remove Digits In String...
class Demo{
    static String removeDigit(String str){
        return str.replaceAll("\\d","");
    }
    
    public static void main(String[] args) {
        String str="Hello12World534";
        System.out.println(removeDigit(str));
    }
}
// Output :- HelloWorld