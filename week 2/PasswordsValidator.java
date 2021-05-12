import java.io.IOException;
import java.util.*;

public class PasswordsValidator {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
		int upper = 0, lower = 0, num = 0;
		
		while(scanner.hasNext()){

			String str = scanner.nextLine();

			if (str.length() >= 6 && str.length() <= 32){
				for(int i = 0; i < str.length(); i++){
					if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
						lower++;   
					} else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
						upper++;   
					} else if (str.charAt(i) >= '0' && str.charAt(i) <= '9'){
						num++;					    
					}
				}
				
				if (upper == 0) {
					System.out.println("Senha invalida.");   
				} else if (lower == 0) {
					System.out.println("Senha invalida.");   
				} else if (num == 0) {
					System.out.println("Senha invalida.");   
				} else if (upper + lower + num == str.length()) {
					System.out.println("Senha valida.");   
				} else {
					System.out.println("Senha invalida.");   
				}
			} else {
				System.out.println("Senha invalida.");   
			}

			lower=0;
			upper=0;
			num=0;
		}
		scanner.close();
    }
}