package Version1;

import java.util.Scanner;

/**
 *
 * @author GAME
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int opcion = 0;

            while (opcion != 2) {
                System.out.println("Números en Kichwa");
                System.out.println("1. Ingresar un número");
                System.out.println("2. Salir");
                System.out.print("Ingrese una opción: ");
                opcion = sc.nextInt();
                System.out.println("");
                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese un número: ");
                        int numero = sc.nextInt();
                        String numeroKichwa = convertirAKichwa(numero);
                        System.out.println("El número en kichwa es: " + numeroKichwa);
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción inválida");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Número no válido");

        }

    }

    public static String convertirAKichwa(int numero) {
        if (numero < 0 || numero > 9999) {
            return "Número fuera de rango.";
        }

        String[] unidades = {"", "Shuk", "Ishkay", "Kimsa", "Chusku", "Pichka", "Sukta", "Kanchis", "Pusak", "Iskun"};
        String[] decenas = {"", "Chunka ", "Ishkay Chunka ", "Kimsa Chunka ", "Chusku Chunka ", "Pichka Chunka ", "Sukta Chunka ", "Kanchis Chunka ", "Pusak Chunka ", "Iskun Chunka "};
        String[] centenas = {"", "Patsak ", "Ishkay Patsak ", "Kimsa Patsak ", "Chusku Patsak ", "Pichka Patsak ", "Sukta Patsak ", "Kanchis Patsak ", "Pusak Patsak ", "Iskun Patsak "};
        String[] miles = {"", "Waranka ", "Ishkay Waranka ", "Kimsa Waranka ", "Chusku Waranka ", "Pichka Waranka ", "Sukta Waranka ", "Kanchis Waranka ", "Pusak Waranka ", "Iskun Waranka "};

        String resultado = " ";

        // Procesar las unidades
        int unidad = numero % 10;
        resultado = unidades[unidad] + resultado;
        //System.out.println("unidad: " + unidad);

        // Procesar las decenas
        int decena = (numero / 10) % 10;
        resultado = decenas[decena] + resultado;
        //System.out.println("decena: " + decena);

        // Procesar las centenas
        int centena = (numero / 100) % 10;
        resultado = centenas[centena] + resultado;
        //System.out.println("centena: " + centena);

        // Procesar los miles
        int mil = (numero / 1000) % 10;
        resultado = miles[mil] + resultado;
        //System.out.println("mil: " + mil);

        return resultado.trim();
    }
}