package Sesion01;

import java.util.Scanner;

/**
 * Clase que permite indicar si una persona es mayor de edad (18 años) a partir de la edad introducida por teclado. 
 * Hay que tener en cuenta que no se puede introducir números negativos (una persona no puede tener -4 años)
 * @author Antonio Ramos
 * @version 1.0
 */
public class Ejercicio01 {
    /**
     * Método principal de la clase
     * @param args 
     */
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int edad;
        
        do{
            System.out.print("Introduzca la edad del usuario: ");
            edad = teclado.nextInt();
            
            if(edad < 0){
                System.out.println("Error. Una persona no puede tener menos de 0 años.");
            }
        }while (edad < 0);
        
        if(edad < 18){
            System.out.println("El usuario es mayor de edad.");
        }
        else{
            System.out.println("El usuario es menor de edad.");
        }
        
    }
}
