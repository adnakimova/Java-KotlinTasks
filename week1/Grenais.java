import java.util.Scanner;

public class Grenais {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int interCount = 0,gremioCount = 0,empates = 0;
        int repet = 1,grenais = 0;
        while(repet == 1){
            int inter = scanner.nextInt();
            int gremio = scanner.nextInt();
            grenais++;
            System.out.println("Novo grenal (1-sim 2-nao)");
            if(inter > gremio)
                interCount++;
            else if(inter == gremio)
                empates++;
            else
                gremioCount++;
            repet = scanner.nextInt();
        }
        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + interCount);
        System.out.println("Gremio:" + gremioCount);
        System.out.println("Empates:" + empates);
        if(interCount > gremioCount)
            System.out.println("Inter venceu mais");
        else
            System.out.println("Gremio venceu mais");

    }
}
