
public class ReverseString {  
    public static String reverseString(String str) {  
        char[] charArray = str.toCharArray();  
        int left = 0, right = charArray.length - 1;  
        while (left < right) {  
            char temp = charArray[left];  
            charArray[left++] = charArray[right];  
            charArray[right--] = temp;  
        }  
        return new String(charArray);  
    }  
    public static void main(String[] args) {  
        String str = "Darshan";  
        System.out.println("Original String is " + str);  
        System.out.print(" Reversed String is ");  
        String reversed = reverseString(str);  
        System.out.println(reversed);  
    }  
}  

