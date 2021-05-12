import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Huaauhahhuahau {
 
    public static void main(String[] args) throws IOException {
 
       Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toLowerCase();
        List<Character> lists = new ArrayList<>(str.length());
        
        for(int i = 0; i < str.length(); i++) {
			char charAt = str.charAt(i);

			if(charAt == 'a' || charAt == 'e' || charAt == 'i' || charAt == 'o' || charAt == 'u') {
				lists.add(charAt);
			}
		}

		boolean b = true;
		for(int i = 0, j = lists.size() - 1; i < j; i++, j--) {
			if(lists.get(i) != lists.get(j)) {
				b = false;
				break;
			}
		}


		System.out.println(b ? "S" : "N");
 
    }
 
}