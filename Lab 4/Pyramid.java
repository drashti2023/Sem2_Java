import java.util.* ;
public class Pyramid { public static void main(String[] args) {
         String s; 
         Scanner sc;
         sc=new Scanner(System.in);

         System.out.println("Enter a string:");
         s=sc.next(); 
         int i,j,k,n;
         n =s.length();
         int spaces=n-1;
         for(i=0;i<n;i++) { 
          
            for(j=0;j<spaces;j++) {
               System.out.print(" ");
                } 
             for(k=0;k<=i ;k++) { 
               System.out.print(s.charAt(k)+" ");
                } 
                spaces--;
            System.out.println();
               } 
              } 
            }