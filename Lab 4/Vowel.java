import java.util.*;
public class Vowel
{
     public static void main(String []args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=sc.nextLine();           
        int vcount=0,ccount=0;   
        str=str.toLowerCase();          
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
            vcount++; 
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z')
            ccount++;  
        }        
        System.out.println("The total number of vowels is: "+vcount);
        System.out.println("The total number of consonants is: "+ccount);        
     }
    }

