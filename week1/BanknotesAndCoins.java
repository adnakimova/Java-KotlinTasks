import java.util.Scanner;

public class BanknotesAndCoins {
    public static void banknotes(double banknote){
        int converted = (int)banknote;
        double coins = (banknote - converted);
        int [] arr = {100,50,20,10,5,2};
        int sum = 0;
        for(int i = 0;i < arr.length;i++){
            long temp = converted / arr[i];
            System.out.println(temp + " nota(s) de R$ " + arr[i] + ",00");
            sum+=temp*arr[i];
            converted = converted % arr[i];
        }
        System.out.println();
        coins = (banknote - sum);
        double[] arr2 = {1.0,0.50,0.25,0.10,0.05,0.01};
        for(int i=0;i < arr2.length;i++){
            int count = 0;
            while(coins >= arr2[i]){
                coins-=arr2[i];
                count++;
            }
            System.out.println(count + " moeda (s) de R$ " + arr2[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double value = (scanner.nextFloat());
        banknotes(value);
    }
}
