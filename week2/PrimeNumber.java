package Week2;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0;i < n;i++) {
            long temp = scan.nextInt();
            if(temp == 1)
                System.out.println(temp + " nao eh primo");
            else if(temp == 2)
                System.out.println(temp + " eh primo");
            else {
                int counter = 0;
                for (int j = 2; j < temp; j++) {
                    if (temp % j == 0) {
                        counter++;
                    }
                }
                if(counter > 0)
                    System.out.println(temp + " nao eh primo");
                else
                    System.out.println(temp + " eh primo");

            }

        }
    }
}
