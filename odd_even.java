import java.util.Scanner;

public class odd_even {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int sum_odd = 0;
        int sum_even = 0;
        for (int i = 0; i < 8; i++) {
            int x = scan.nextInt();
            if (x % 2 == 0) {
                sum_even += x;
            } else {
                sum_odd += x;
            }
        }
        if (sum_even > sum_odd) {
            System.out.println("even");
        } else if (sum_even < sum_odd) {
            System.out.println("odd");
        } else {
            System.out.println("equal");
        }
        System.out.println(sum_even);
        System.out.println(sum_odd);
    }
}
