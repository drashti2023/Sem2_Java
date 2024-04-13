import java.util.*;
class Using_Scanner
{
public static void main(String arg[])
{
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter RollNo :");
 int no=sc.nextInt();
 System.out.print("Enter Name :");
 String name=sc.next();
 System.out.println("Roll No :: "+no);
 System.out.println("Name :: "+name);
}
}