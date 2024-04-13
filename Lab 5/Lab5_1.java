import java.util.Scanner;
class Circle{
    int radius;

    public double areaOfCircle(){
        return Math.PI*radius*radius;
    }
}
public class Lab5_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius of Circle: ");
        int radius = sc.nextInt();

        Circle c = new Circle();
        c.radius = radius;

        double area = c.areaOfCircle();
        System.out.println("Area : "+area);
        
        sc.close();
    }
}