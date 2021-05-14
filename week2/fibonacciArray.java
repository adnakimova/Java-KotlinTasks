import java.io.IOException;
import java.util.Scanner;

public class Main {
     public static long fib(int n)
        {
            long f[] = new long[n + 2];
            int i;
            f[0] = 0;
            f[1] = 1;
            for (i = 2; i <= n; i++) {

                f[i] = f[i - 1] + f[i - 2];
            }
            return f[n];
        }
    
    
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int inputSize = scanner.nextInt();
        int i = 0;
        int[] arr = new int[inputSize];
        while(inputSize > i) {
            arr[i++] = scanner.nextInt();
        }
        for(int x: arr) {
            System.out.println("Fib(" + x + ") = " + fib(x));
        }
 
    }
 
}
