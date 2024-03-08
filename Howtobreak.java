import java.util.Scanner;

public class Howtobreak {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 0;
        for (;;) {
            int x = scan.nextInt();
            if (x == 0) {
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}

