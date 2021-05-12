import java.io.IOException;
import java.util.Scanner;

public class FibonacciArray {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            long num = scanner.nextInt();
            long first = 0;
            long second = 1;
            long result = num;
            for (int j = 1; j < num; j++) {
                result = first + second;
                first = second;
                second = result;
            }
            System.out.println("Fib(" + num + ")" + " = " + result);
        }
    }
}