package Week2;
import java.util.Scanner;
public class perfectNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0;i < n;i++){
            int sum = 0;
            int temp = scan.nextInt();
            for(int j = 1;j < temp; j++){
                if(temp % j == 0)
                    sum+=j;
            }
            if(temp == sum)
                System.out.println(temp + " eh perfeito");
            else
                System.out.println(temp + " nao eh perfeito");
        }

    }
}
