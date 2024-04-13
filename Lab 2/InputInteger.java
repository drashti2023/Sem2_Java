import java.util.*;
public class InputInteger {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number1 :");
        int n1=sc.nextInt();
        System.out.println("enter the number 2:");
        int n2=sc.nextInt();
        System.out.println("sum:"+(n1+n2));
        sc.close();
    }
    
}
