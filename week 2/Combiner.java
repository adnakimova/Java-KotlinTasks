import java.io.IOException;
import java.util.Scanner;

public class Combiner {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		for (int i = 0; i < N; i++) {
			String strOne = scanner.next();
			String strTwo = scanner.next();
			String more, less;
			String result = "";
			if (strOne.length() > strTwo.length()) {
				more = strOne;
				less = strTwo;
			} else {
				more = strTwo;
				less = strOne;
			}
			for (int j = 0; j < less.length(); j++) {
				result += strOne.charAt(j) + "" + strTwo.charAt(j);
			}
			result += more.substring(less.length(), more.length());
			System.out.println(result);
		}
    }
}