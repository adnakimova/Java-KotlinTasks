package Week1;

import java.util.Scanner;

public class PopulationIncrease {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for(int i = 0; i < T; i++){
            int pa = scanner.nextInt();
            int pb = scanner.nextInt();
            double ga = scanner.nextDouble();
            double gb = scanner.nextDouble();
            int temp;
            double temp1,timeA = 0,timeB = 0;
            if(pa > pb) {
                temp = pa;
                pa = pb;
                pb = temp;
            }
            if(ga < gb) {
                temp1 = ga;
                ga = gb;
                gb = temp1;
            }
            int count = 0;
            while(pa <= pb){
                if(count >= 100){
                    System.out.println("Mais de 1 seculo.");
                    return;
                }
                timeA = (pa * ga)/100;
                pa = (int)(pa + timeA);

                timeB = (pb * gb)/100;
                pb = (int)(pb + timeB);
                count++;
            }
            System.out.println(count + " anos.");

        }

    }
}
