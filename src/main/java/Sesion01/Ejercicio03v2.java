package Sesion01;

import java.util.Scanner;

/**
 * Clase que nos permite calcular el factorial de un número.
 * @author Antonio Ramos
 * @version 2.0
 */
public class Ejercicio03v2 {
    /**
     * Método principal de la clase
     * @param args 
     */
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int numero, factorial = 1;
        
        do{
            System.out.print("Introduzca el número para el que se quiere realizar el factorial: ");
            numero = teclado.nextInt();
            
            if(numero < 0){
                System.out.println("Error. Solo se pueden calcular el factorial para números mayores o iguales a 0.");
            }
        }while (numero < 0);
        
        for(int i = numero; i > 0; i--){
            factorial *= i;
        }
        
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
