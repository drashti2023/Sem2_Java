
 public class Rev{
    public static void main(String[] args) {
        int[] num = { 10, 20, 30, 40, 50 };

        System.out.println("Original array:");
        System.out.println(num);

        System.out.println("\nArray in reverse order:");
        System.out.println(num);


        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }
    }
    
}