import java.io.IOException;
import java.util.*;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		for (int i = 0; i < N; i++){
			scanner.nextLine();
			String str = scanner.nextLine();
			int sdvig = scanner.nextInt();
			char[] s = str.toCharArray();
			for (int x=0 ; x<s.length ; x++){
				if((s[x] - sdvig) < 65) {
				    s[x] += (26 - sdvig);
				}
				else {
					s[x] -= sdvig;   
				}
			}
			System.out.println(s);
		}
		scanner.close();
    }
}