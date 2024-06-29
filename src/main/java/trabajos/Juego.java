package trabajos;
import java.util.Random;
import java .util.Scanner;
public class Juego {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] opciones = {"Piedra", "Papel", "Tijera"};
        while (true) {
            System.out.println("Elige una opcion: Piedra - Papel - Tijera o `Salir` para terminar el juego.");
            String eleccionUsuario = scanner.nextLine();
            if (eleccionUsuario.equalsIgnoreCase("Salir")){
                break;
            }
            String eleccionPC = opciones[random.nextInt(opciones.length)];
            System.out.println("Tu elegiste: " + eleccionUsuario);
            System.out.println("La Computadora eligio: " + eleccionPC);
            String resultado =  Ganador(eleccionUsuario,eleccionPC);
            System.out.println(resultado);
            System.out.println();
        }
        scanner.close();
    }
    public static String Ganador(String usuario, String PC) {
        if (usuario.equalsIgnoreCase(PC)) {
            return "Es un empate X|";
        }
        switch (usuario.toLowerCase()) {
            case "piedra":
                return (PC.equalsIgnoreCase("Tijera")) ? "Ganaste :)" : "Perdiste :(";
            case "papel":
                return (PC.equalsIgnoreCase("Piedra")) ? "Ganaste :)" : "Perdiste :(";
            case "tijera":
                return (PC.equalsIgnoreCase("Papel")) ? "Ganaste :)" : "Perdiste :(";
            default: return "No valido. Elije Piedra - Papel - Tijera o Salir.";

        }
    }
}
