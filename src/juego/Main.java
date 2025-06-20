package juego;

import java.util.Scanner; // importamos el scanner de java

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {  //agrego un while para poder salir cuando el usuario seleccione la opcion 2
            System.out.println("\n==========================");
            System.out.println("   JUEGO DE ADIVINAR Nº");
            System.out.println("==========================");
            System.out.println("1. Jugar");
            System.out.println("2. Salir");
            System.out.print("Selecciona una opción: ");
            String opcion = scanner.nextLine();

            switch (opcion) { //aqui hago un switch para leer lo que puso el usuario y en cada casa interactuo con mi clase JuegoAdivinaNumero
                case "1":
                    JuegoAdivinaNumero juego = new JuegoAdivinaNumero(100, 5); // aca genero un nuevo objeto de la clase que cree, y pongo rango maximo 100 e intentos maximos 5
                    juego.jugar(); // aqui accedo al metodo jugar para iniciar mi juego.
                    break;
                case "2":
                    System.out.println("¡Gracias por jugar! 👋");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
                    break;
            }
        }

        scanner.close(); // Cierro el scanner
    }
}