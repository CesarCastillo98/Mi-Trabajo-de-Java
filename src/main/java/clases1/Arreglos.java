package clases1;
import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Double[] notas = new Double[4];

        System.out.println("Digita tu 1ra notas");
        notas[0] = scanner.nextDouble();
        System.out.println("Digita tu 2da notas");
        notas[1] = scanner.nextDouble();
        System.out.println("Digita tu 3ra notas");
        notas[2] = scanner.nextDouble();
        System.out.println("Digita tu 4ra notas");
        notas[3] = scanner.nextDouble();

        System.out.println((notas[0]+notas[1]+notas[2]+notas[3])/4);




    }
}
