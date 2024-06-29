package trabajos;
import java.util.Scanner;
public class Numero_mayor {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int num1 = 0, num2 = 0, num3 = 0;

        System.out.println("Digita tres numeros: ");
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();

        if (num1>num2 && num1>num3){
            System.out.println(num1 + " es el numero mayor");
        } else if (num2>num1 && num2>num3){
            System.out.println(num2 + " es el numero mayor");
        } else {
            System.out.println(num3 + " es el numero mayor");
        }
    }
}
