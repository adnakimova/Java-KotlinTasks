package Week2;
import java.util.Scanner;
public class Huahaha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String str = scanner.nextLine();
            String temp = "";
            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                    temp+=str.charAt(i);
                }
            }
            boolean bool = true;
            for(int i = 0, j = temp.length() - 1; i < j; i++, j--) {
                if(temp.charAt(i) != temp.charAt(j)) {
                    bool = false;
                    break;
                }
            }
            if(bool)
                System.out.println('S');
            else
                System.out.println('N');
        }


    }
}
