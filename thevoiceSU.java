import java.util.Scanner;

public class thevoiceSU {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scan.nextInt();
        int K = scan.nextInt();
        int s1 = 0, s2 = 0;
        for (int i = 0; i < N; i++) {
            int g = scan.nextInt();
            int score_1 = scan.nextInt();
            int score_2 = scan.nextInt();
            if (K == s1 && K == s2) {
                continue;
            } else if (K != s1 && K == s2) {
                if (score_1 > 8) {
                    System.out.println(i + 1 + " 1");
                    s1++;
                }
            } else if (K == s1 && K != s2) {
                if (score_2 > 8) {
                    System.out.println(i + 1 + " 2");
                    s2++;
                }
            } else if (K != s1 && K != s2) {
                if (score_1 > 8 && score_2 > 8) {
                    if (g == 1) {
                        System.out.println(i + 1 + " " + g);
                        s1++;
                    } else if (g == 2) {
                        System.out.println(i + 1 + " " + g);
                        s2++;
                    }
                } else if (score_1 > 8 && score_2 <= 8) {
                    System.out.println(i + 1 + " 1");
                    s1++;
                } else if (score_1 <= 8 && score_2 > 8) {
                    System.out.println(i + 1 + " 2");
                    s2++;
                }
            }
        }
    }
}
