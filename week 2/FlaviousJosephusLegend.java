import java.io.IOException;
import java.util.Scanner;

public class FlaviousJosephusLegend {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
	    int NC = scanner.nextInt();
	    int n, k;
        for (int i = 1; i <= NC; i++) {
            n = scanner.nextInt();
            k = scanner.nextInt();
            System.out.println("Case " + i + ": " + (josephus(n, k) + 1));
        }
        scanner.close();
    }
    
    private static int josephus(int n, int k) {
        int ans = 0;
        for (int i = 2; i <= n; i++) {
            ans = (ans + k) % i;
        }
        return ans;
    }
}