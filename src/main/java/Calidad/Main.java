/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Calidad;
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
        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();
        
        String numeroKichwa = convertirAKichwa(numero);
        System.out.println("El número en kichwa es: " + numeroKichwa);
    }
    
    public static String convertirAKichwa(int numero) {
        if (numero < 0 || numero > 9999) {
            return "Número fuera de rango.";
        }
        
        String[] unidades = {"", "Shuk", "Ishkay", "Kimsa", "Chusku", "Pishka", "Shukta", "Kanchis", "Pushak", "Ishkun"};
        String[] decenas = {"", "Chunka ", "Ishkay Chunka ", "Kimsa Chunka ", "Chusku Chunka ", "Pishka Chunka ", "Shukta Chunka ", "Kanchis Chunka ", "Pushak Chunka","Ishkun Chunka "};
        String[] centenas = {"", "Patsak ", "Ishkay Patsak ", "Kimsa Patsak ", "Chusku Patsak ", "Pishka Patsak ", "Shukta Patsak ", "Kanchis Patsak ", "Pushak Patsak ","Ishkun Patsak "};
        String[] miles = {"", "Waranka ", "Ishkay Waranka ", "Kimsa Waranka ", "Chusku Waranka ", "Pishka Waranka ", "Shukta Waranka ", "Kanchis Waranka ", "Pushak Waranka ","Ishkun Waranka "};
        
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
