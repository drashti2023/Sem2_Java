import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = input.nextLine();

        int len = str.length();
        int halfLen = len / 2;

        System.out.printf("Length of the string: %d\n", len);
        System.out.printf("Second half of the string: %s\n", str.substring(halfLen));

        input.close();
    }
}

