/*

ANA DIAZ con edad 19, es estudiante de UTPL

luis vera con edad 19, es estudiante de UNL

 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo031 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        System.out.println("Ingrese su nombre y apellido");
        String nombreap = entrada.nextLine();
        nombreap = nombreap.toLowerCase();
        
        System.out.println("Ingrese su edad");
        String edad = entrada.nextLine();
        
        System.out.println("Ingrese donde estudia");
        String uni = entrada.nextLine();
        uni = uni.toLowerCase ();
        
        
        // nombre = "atacames"
        char valor = nombreap.charAt(0); // obtener el primer caracter de una
        // ANA DIAZ con edad 19, es estudiante de UTPL

        // luis vera con edad 19, es estudiante de UNL
           
        switch(valor){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            nombreap = nombreap.toUpperCase();
                break;
            
            default:
                System.out.println("Ingrese un nombre correcto");
                break;
                
            
                
        }
        
        
        
    }
}
