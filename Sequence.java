package Week1;

public class Sequence{
	public static void main(String[] args){
		double [] s = {1,2,3};
		for(int i = 0;i < 3;i++)
			System.out.printf("I = %d  J = %.0f\n",i,(s[i]));

		for(double i = 0.2; i <= 2 ; i = i + 0.2){
			for(int j = 0; j < 3; j++){
				s[j] = i + s[j];
				System.out.printf("I = %.1f  J = %.1f\n",i,(s[j]));
			}
		}
	}
}