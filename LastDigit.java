import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int x = scan.nextInt();
            System.out.println(x % 10);
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
