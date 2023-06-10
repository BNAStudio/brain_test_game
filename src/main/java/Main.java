
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int puntaje = 0;
        
        // El ciclo se repite mientras el jugador responda de forma correcta

        while (true) {
            int termino1 = random.nextInt(100); // Genera un número aleatorio entre 0 y 99
            int termino2 = random.nextInt(100); // Genera un número aleatorio entre 0 y 99
            int resultado;
            
            int operador = random.nextInt(4);  // Genera un operador aleatorio (+, -, *, /), cada numero representa un caso en la estructura Switch
            char operadorChar;

            // Define que operacion se imprimira
            switch (operador) {
                case 0 -> {
                    resultado = termino1 + termino2;
                    operadorChar = '+';
                }
                case 1 -> {
                    resultado = termino1 - termino2;
                    operadorChar = '-';
                }
                case 2 -> {
                    resultado = termino1 * termino2;
                    operadorChar = '*';
                }
                case 3 -> {
                    if (termino2 == 0) {  // Evita división por cero
                        continue;
                    }
                    resultado = termino1 / termino2;
                    operadorChar = '/';
                }
                default -> {
                    continue;
                }
            }

            System.out.println("¡Bienvenido Brain Test!");
            System.out.print("Cuánto es " + termino1 + " " + operadorChar + " " + termino2 + "? ");

            System.out.println("Responde correctamente para acumular puntos.");
            int respuesta = scanner.nextInt();

            if (respuesta == resultado) { // Valida si la respuesta del usuario es igual al resultado
                puntaje += 5;
                System.out.println("¡Respuesta correcta! Puntaje actual: " + puntaje);
            } else {
                System.out.println("Respuesta incorrecta. Fin del juego.");
                break;
            }
        }

        System.out.println("Tu puntaje final es: " + puntaje);
    }
}
