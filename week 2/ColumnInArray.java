import java.io.IOException;
import java.util.Scanner;

public class ColumnInArray {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double[][] arrays = new double[12][12];
        int l = scanner.nextInt();
        String s = scanner.next();
        double sum = 0;
        if (l >= 0 && l <= 11) {
            for (int i = 0; i < arrays.length; i++) {
                for (int j = 0; j < arrays.length; j++) {
                    arrays[i][j] = scanner.nextDouble();
                    if (l == j) {
                        sum += arrays[i][j];
                    }
                }
            }
            if ("S".equals(s)) {
                System.out.printf("%.1f\n", sum);
            } else if ("M".equals(s)) {
                System.out.printf("%.1f\n", (sum / 12));
            }
        }
    }
}