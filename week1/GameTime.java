import java.util.Scanner;
public class GameTime{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int initHour = scanner.nextInt();
		int initMinute = scanner.nextInt();
		int finalHour = scanner.nextInt();
		int finalMinute = scanner.nextInt();
		int time = 0,minute = 0;
		if(finalHour > initHour){
		           if(finalMinute >= initMinute){
		                   minute = finalMinute - initMinute;
			time = finalHour - initHour;
		            }
		            else{
			minute = finalMinute  + 60 -  initMinute;
			time = finalHour - initHour - 1;
			}
		}
		else{
		            time = initHour - finalHour;
		            time = 24 - time;
		            if(finalMinute >= initMinute){
		                   minute = finalMinute - initMinute;
		            }
		            else{
			minute = finalMinute  + 60 -  initMinute;
			time = time - 1;
			}
		}
		System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)",time,minute);
		            
	}
}