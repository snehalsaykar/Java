import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Enter array elements");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("sum=" + sum);
    }
}
