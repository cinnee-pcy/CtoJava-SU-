import java.util.Scanner;

public class reserve_3_vans {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scan.nextInt();
        int Day_A = 0, Day_B = 0, Day_C = 0;
        for (int i = 0; i < N; i++) {
            int x = scan.nextInt();
            if (Day_A <= Day_B && Day_A <= Day_C) {
                Day_A += x;
                System.out.println("A");
            } 
            else if (Day_B < Day_A && Day_B <= Day_C) {
                Day_B += x;
                System.out.println("B");
            } 
            else if (Day_C < Day_A && Day_C < Day_B) {
                Day_C += x;
                System.out.println("C");
            }
        }
    }
}
