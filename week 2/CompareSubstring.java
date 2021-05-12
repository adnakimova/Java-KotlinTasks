import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CompareSubstring {
 
    public static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static final PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String s1, s2, max, min;
        while ((s1 = in.readLine()) != null) {
            s2 = in.readLine();
            if (s1.length() >= s2.length()) {
                max = s1;
                min = s2;
            } else {
                max = s2;
                min = s1;
            }
            int minLength = min.length();
            int maxStr = minLength;
            boolean f = true;
            while (maxStr > 0 && f) {
                int diff = minLength - maxStr;
                for (int i = 0; i <= diff; i++) {
                    if (max.contains(min.substring(i, i + maxStr))) {
                        f = false;
                        maxStr++;
                        break;
                    }
                }
                maxStr--;
            }
            System.out.println(maxStr);
        }
        out.close();
    }
}