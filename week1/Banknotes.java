import java.util.Scanner;

public class Banknotes {

    public static void banknotes(int value){
        int [] arr = {100,50,20,10,5,2,1};
        for(int i = 0;i < arr.length;i++){
            int temp = value / arr[i];
            System.out.println(temp + " nota(s) de R$ " + arr[i] + ",00");
            value = value % arr[i];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        banknotes(value);
    }
}
