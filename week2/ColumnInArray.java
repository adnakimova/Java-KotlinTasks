import java.util.Scanner;
public class ColumnInArray{
	public static void main (String[] args){
		double[][] diArray = new double[12][12];
		Scanner scanner = new Scanner(System.in);
		int columnNumber = scanner.nextInt();
		char c = scanner.next().charAt(0);
		double sum = 0;
		for(int i = 0; i < 12; i++){
			for(int j = 0; j < 12; j++){
				diArray[i][j] = scanner.nextDouble();
				if(j == columnNumber)
					sum+=diArray[i][j];
			}
		}
		if(c == 'S')
		     System.out.printf("%.1f\n",sum);
		else if(c == 'M')
		     System.out.printf("%.1f\n",sum/12);
	}


}