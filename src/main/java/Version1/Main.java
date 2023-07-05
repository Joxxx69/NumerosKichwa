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
        Scanner sc = new Scanner(System.in);
        String opcion = "0";
        do {
            System.out.println("Números en Kichwa");
            System.out.println("1. Ingresar un número");
            System.out.println("2. Salir");
            System.out.print("Ingrese una opción: ");
            try {
                opcion = sc.nextLine().trim();
                Integer.parseInt(opcion);
                switch (opcion) {
                    case "1":
                        System.out.print("Ingrese un número: ");
                        String numero = sc.nextLine().trim();
                        String numeroKichwa = convertirAKichwa(Integer.parseInt(numero));
                        String mensaje = (numeroKichwa == "Número fuera de rango") ? "\n Número fuera de rango"
                                : ("\nEl número en kichwa es: " + numeroKichwa);
                        System.out.println(mensaje);
                        System.out.println("");
                        break;
                    case "2":
                        System.out.println("Saliendo del programa...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("\n Opción inválida \n ");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("\n No es un número válido. \n");
            }
        } while (opcion != "1" || opcion != "2");
    }
    

    public static String convertirAKichwa(int numero) {
        if (numero < 0 || numero > 9999) {
            return "Número fuera de rango";
        }
        if (numero == 0) {
            return "Illak";
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
