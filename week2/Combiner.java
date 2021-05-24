package Week2;
import java.util.Scanner;
public class Combiner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String first = scanner.next();
            String second = scanner.next();
            String next, pre;
            String result = "";
            if (first.length() > second.length()) {
                next = first;
                pre = second;
            } else {
                next = second;
                pre = first;
            }
            for (int j = 0; j < pre.length(); j++) {
                result += first.charAt(j) + "" + second.charAt(j);
            }
            result += next.substring(pre.length(), next.length());
            System.out.println(result);
        }
    }
}
