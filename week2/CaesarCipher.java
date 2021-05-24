package Week2;
import java.util.Scanner;
public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char [] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int n = scan.nextInt();
        for(int i = 0;i < n; i++){
            String str = scan.next();//ABCDEFGH
            int shift = scan.nextInt();//10
            for(int x = 0;x < str.length();x++){
                for(int j = 0;j < alphabet.length;j++) {
                    if (str.charAt(x) == alphabet[j]) {
                        int temp = j - shift;
                        if(temp >= 0)
                            System.out.print(alphabet[j-shift]);
                        else{
                            System.out.print(alphabet[alphabet.length + temp]);
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}
