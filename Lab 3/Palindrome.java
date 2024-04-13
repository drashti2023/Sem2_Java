public class Palindrome {
    public static void main(String[] args) {

        String str = "abA", reverseStr = "";
        
        int strLength = str.length();
    
        for (int i = (strLength - 1); i >=0; --i) {
          reverseStr = reverseStr + str.charAt(i);
        }
    
        if (str.equals(reverseStr)) {
          System.out.println(str + " is a Palindrome String.");
        }
        else {
          System.out.println(str + " is not a Palindrome String.");
        }
      }
    }
    
    
/*  Palindrom number 

import java.util.*;
class Palindrom{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
 int r,sum=0,temp;
 System.out.print("Enter Number :: ");
int n=sc.nextInt();
temp=n;
while(n>0){ 
   r=n%10;
  sum=(sum*10)+r;
  n=n/10;
}if(temp==sum){
 System.out.println("Given number is palindrome ");
}else{
System.out.println("Given number is not palindrome");
}
}
} 
  */