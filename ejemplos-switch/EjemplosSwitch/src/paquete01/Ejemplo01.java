/*
*   Ingrese una cadena de texto y verifique que pertenece a un  de un día de la 
*   semana.
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese el nombre del día de la semana");
        String cadena = entrada.nextLine();
        cadena = cadena.toLowerCase();
        
        switch(cadena){
            case "Lunes":
            case "LUNES":
            
                System.out.printf("%s", cadena.toUpperCase());
                break;
            
            case "Martes":
            case "martes":
            case "MARTES":
                System.out.printf("%s", cadena.toUpperCase());
                break;
                
            case "Miercoles":
            case "miercoles":
            case "MIERCOLES":
                System.out.printf("%s", cadena.toUpperCase());
                break;
                
            case "Jueves":
            case "JUEVES":
            case "jueves":
                System.out.printf("%s", cadena.toUpperCase());
                break;
            
            case "Viernes":
            case "VIERNES":
            case "viernes":
                System.out.printf("%s", cadena.toUpperCase());
                break;
                
            case "Sabado":
            case "sabado":
            case "SABADO":
                System.out.printf("%s", cadena.toUpperCase());
                break;
            
            case "Domingo":
            case "DOMINGO":
            case "domingo":
                System.out.printf("%s, es el séptimo día "
                        + "de la semana", cadena);
                break;
                
            default:
                System.out.printf("%s", cadena.toUpperCase());
                break;
        }
        
    }
}
