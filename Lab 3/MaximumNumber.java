import java.util.Scanner;
public class MaximumNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number1:");
        int n1=sc.nextInt();
        System.out.println("Enter number2:");
        int n2=sc.nextInt();
        System.out.println("Enter number3:");
        int n3=sc.nextInt();

        if(n1>=n2 && n1>=n3){
         System.out.println(n1+" is the largest Number");
         }  

         else if (n2>=n1 && n2>=n3){  
          System.out.println(n2+" is the largest Number"); 
 }
         else {
          System.out.println(n3+" is the largest number");   
 }

    }
    
}
