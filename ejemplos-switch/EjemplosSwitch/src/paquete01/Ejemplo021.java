/*
*   Generar un programa que permita ingresar el número de día de la semana;
*   (1 - 7)
*   Si el usuario ingresa el 1, debe presentar el mensaje: Día 1  es Lunes
*   Si el usuario ingresa el 2, debe presentar el mensaje: Día 2  es Martes
*   Si el usuario ingresa el 3, debe presentar el mensaje: Día 3  es Miércoles
*   Si el usuario ingresa el 4, debe presentar el mensaje: Día 4  es Jueves
*   Si el usuario ingresa el 5, debe presentar el mensaje: Día 5  es Viernes
*   Si el usuario ingresa el 6, debe presentar el mensaje: Día 6  es Sábado
*   Si el usuario ingresa el 7, debe presentar el mensaje: Día 7  es Domingo
*   Si el usuario ingresa un número diferente de 1,2,3,4,5,6,7; debe presentar
*   un mensaje: Opción incorrecta

 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Ingrese el número de día de la semana");
        int numeroDia = entrada.nextInt();
        
        System.out.println("Ingrese el número de mes del año");
        int numeroMes = entrada.nextInt();
        
        System.out.println("Ingrese el año correspondiente");
        int numeroyear = entrada.nextInt();
        
        String mesCadena = " ";

        switch (numeroDia) {
            case 1:
                mesCadena = "Lunes";
                break;
                
            case 2:
                mesCadena = "Martes";
                break;

            case 3:
                mesCadena = "Miercoles";
                break;

            case 4:
                mesCadena = "Jueves";
                break;

            case 5:
                mesCadena = "Viernes";
                break;

            case 6:
                mesCadena = "Sabado";
                break;

            case 7:
                mesCadena = "Domingo";
                break;

            default:
                System.out.println("Opción incorrecta");
                break;
        }
        System.out.printf("Ustded ha nacido el %s %d del %d/n", mesCadena ,
                numeroDia , numeroyear);
                
    }
}
