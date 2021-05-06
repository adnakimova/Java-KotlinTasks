import java.util.Scanner;
public class TriangleTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        double temp = A;
        if(A < B) {
            A = B;
            B = temp;
        }
        if(A < C) {
            temp = A;
            A = C;
            C = temp;
        }
        if(B < C){
            temp = B;
            B = C;
            C = temp;
        }
        double powA = A*A;
        double powB = B*B;
        double powC = C*C;
        if(A >= B + C)
            System.out.println("NAO FORMA TRIANGULO");
        if(Math.pow(A,2) == (powB + powC))
            System.out.println("TRIANGULO RETANGULO");
        if(Math.pow(A,2) > (powB + powC))
            System.out.println("TRIANGULO OBTUSANGULO");
        if(Math.pow(A,2) < (powB + powC))
            System.out.println("TRIANGULO ACUTANGULO");
        if(A==B && A==C)
            System.out.println("TRIANGULO EQUILATERO");
        if((A==B && A!=C) || B==C && B!=A)
            System.out.println("TRIANGULO ISOSCELES");


    }
}
