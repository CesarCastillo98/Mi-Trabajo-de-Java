package trabajos;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el primer numero");
        int num1= scanner.nextInt();

        System.out.println("Digite el segundo numero");
        int num2= scanner.nextInt();

        System.out.println("La Suma de"+ num1+ "y" + num2 +"es:" +(num1+num2));
        System.out.println("La Resta de"+num1+ "y" +num2 +"es:" +(num1-num2));
        System.out.println("La Multiplicación de"+num1+ "y" +num2 +"es:" +(num1*num2));
        System.out.println("La División de"+num1+ "y" +num2 +"es:" +(num1/num2));
    }
}
// pedir 4 datos al usuario, almacenarlas en un arreglo y sacar el promedio de esas notas
