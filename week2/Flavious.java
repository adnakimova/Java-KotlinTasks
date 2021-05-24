package Week2;
import java.io.IOException;
import java.util.Scanner;
public class Flavious {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int nc = scanner.nextInt();
        for (int i = 1; i <= nc; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int temp = 0,j = 0;
            for (j = 2; j <= n; j++) {
                temp = (temp + k) % j;
            }
            System.out.printf("Case %d: %d\n",i,(temp + 1));
        }
    }

} 
