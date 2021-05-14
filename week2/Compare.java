package Week2;
import java.util.Scanner;
public class Compare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String str1 = scan.nextLine();
            String str2 = scan.nextLine();
            System.out.println(lenghtOfSub(str1, str2));
        }
    }
    public static int lenghtOfSub(String str1, String str2){
        int s1 = str1.length();
        int s2 = str2.length();
        int max = 0;
        int[][] dp = new int[s1][s2];
        int endIndex=-1;
        for(int i=0; i<s1; i++){
            for(int j=0; j<s2; j++){
                if(str1.charAt(i) == str2.charAt(j)){
                    if(i==0 || j==0){
                        dp[i][j]=1;
                    }
                    else{
                        dp[i][j] = dp[i-1][j-1]+1;
                    }

                    if(max < dp[i][j])
                    {
                        max = dp[i][j];
                        endIndex=i;
                    }
                }
            }
        }
        return str1.substring(endIndex-max+1,endIndex+1).length();
    }
}
