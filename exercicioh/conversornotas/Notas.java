package conversornotas;
import java.util.Scanner;
public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int notas50, notas20, notas10;
        System.out.println("Digite as notas:");
        int notas = sc.nextInt();
        notas50= notas/50;
        notas20= (notas%50)/20;
        notas10= notas20%20;
        System.out.println("notas 50: "+ notas50 +"\nnotas 20: "+notas20+ "\nnotas 10: "+ notas10);

    }
}
