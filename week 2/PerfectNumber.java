import java.io.IOException;
import java.util.Scanner;

public class PerfectNumber {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int sum = 0;
        
        while (N != 0) {
            int num = scanner.nextInt();
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }

            if (sum == num) {
                System.out.printf("%d eh perfeito\n", num);
            } else {
                System.out.printf("%d nao eh perfeito\n", num);
            }
            sum = 0;
            N -= 1;
        }
    }
}