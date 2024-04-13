import java.util.Scanner;
public class Celcius {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of F:");
        double F = sc.nextDouble();
        System.out.println("Celcius= "+((F-32)*5/9));

    }
}
