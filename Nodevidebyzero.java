import java.util.Scanner;

public class Nodevidebyzero {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            double x = scan.nextDouble();
            double y = scan.nextDouble();
            double z = scan.nextDouble();
            if (z != 0) {
                double result = (x + y) / z;
                System.out.println(String.format("%.6f", result));
            } else {
                System.out.println("cannot divide by zero");
            }
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
