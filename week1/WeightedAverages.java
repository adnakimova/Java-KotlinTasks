import java.util.Scanner;
public class WeightedAverages{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		double[][] numbers = new double[N][3];
		double[] weight = {0.2, 0.3, 0.5};
		double average = 0.0;
		for(int i = 0; i < N; i++){
			average = 0.0;
			for(int  j = 0; j < 3; j++){
				numbers[i][j] = scanner.nextDouble();
				average+=weight[j] * numbers[i][j];
			}
			System.out.printf("%.1f\n",average);
		}

	}

}