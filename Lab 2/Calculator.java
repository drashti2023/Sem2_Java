import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        char operator;
        int n1,n2;
        double result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an operator:+,-,*,/,%");
        operator = sc.next().charAt(0);
        System.out.println("Enter first number,n1:");
        n1 = sc.nextInt();
        System.out.println("Enter second number,n2:");
        n2 = sc.nextInt();

        switch(operator){
            case '+':
            result = n1 + n2;
            System.out.println(n1+"+"+n2+"="+result);
            break;
            case '-':
            result = n1 - n2;
            System.out.println(n1+"-"+n2+"="+result);
            break;
            case '*':
            result = n1 * n2;
            System.out.println(n1+"*"+n2+"="+result);
            break;
            case '/':
            result = (double)n1/n2;
            System.out.println(n1+"/"+n2+"="+result);
            break;
            case '%':
            result = (double)n1%n2;
            System.out.println(n1+"%"+n2+"="+result);
            break;
            default:
            System.out.println("Invalid operator!");
            break;

        }

    }
}
