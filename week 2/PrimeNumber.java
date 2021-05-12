import java.io.IOException;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        while (N != 0) {
            int num = scanner.nextInt();
            int count = 0;
            
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0 && count != 1) {
                System.out.printf("%d eh primo\n", num);
            } else {
                System.out.printf("%d nao eh primo\n", num);
            }

            N -= 1;
        }
    }
}