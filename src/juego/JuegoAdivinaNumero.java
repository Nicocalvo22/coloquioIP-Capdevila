package juego;

import java.util.Random; // importamos random para más tarde generar el numero aleatorio
import java.util.Scanner;

public class JuegoAdivinaNumero {
    private int numeroSecreto;
    private int intentosMaximos;
    private int intentosUsados;

    public JuegoAdivinaNumero(int rangoMaximo, int intentosMaximos) {
        Random rand = new Random();
        this.numeroSecreto = rand.nextInt(rangoMaximo + 1); // Número entre 0 y rangoMaximo
        this.intentosMaximos = intentosMaximos;
        this.intentosUsados = 0;
    }

    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("Debes adivinar un número entre 0 y 100.");
        System.out.println("Tienes " + intentosMaximos + " intentos.");  //aqui agrego este metodo jugar() para inciar el juego en mi clase main.

        while (intentosUsados < intentosMaximos) {
            System.out.print("Intento #" + (intentosUsados + 1) + ": Ingresa tu número: ");  // Aqui uso este while para poder mostrarle al usuario cuantos intentos le quedan

            int intento;
            try {
                intento = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Debes ingresar un número."); // Aqui utilizo try catch por si el usuario ingresa un caracter invalido
                continue;
            }

            intentosUsados++;  // Aqui modifico la variable intentosUsados para que en algun momento el while sea false.

            if (intento == numeroSecreto) {
                System.out.println("🎉 ¡Felicidades! Adivinaste el número en " + intentosUsados + " intentos.");
                return;
            } else if (intento < numeroSecreto) {
                System.out.println("📉 Demasiado bajo.");
            } else {
                System.out.println("📈 Demasiado alto.");
            }
        }

        System.out.println("😢 Lo siento, has agotado tus intentos.");
        System.out.println("El número correcto era: " + numeroSecreto);
    }
}