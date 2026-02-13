package exercicioh;
import  java.util.Scanner;
public class Conversor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os segundos para a conversao:");
        int segundos = sc.nextInt();
        int horas,minutos,totalSegundos;
         horas = segundos / 3600;
         minutos = (segundos % 3600) / 60;
         totalSegundos = segundos % 60;
        System.out.println("Resultado: " + horas + "h " + minutos + "m " + totalSegundos + "s");
    }
}
