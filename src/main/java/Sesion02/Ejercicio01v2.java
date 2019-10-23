package Sesion02;

import java.util.Scanner;

/**
 * Clase que nos permite calcular la media de n números.
 * @author Antonio Ramos
 * @version 2.0
 */
public class Ejercicio01v2 {
    /**
     * Método principal de la clase
     * @param args 
     */
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int n = 5, sumaParcial = 0;
        
        System.out.println("Vamos a calcular la media de " + n + " números.");
        
        for(int i = 0; i < n; i++){
            System.out.print("Introduzca un valor: ");
            sumaParcial += teclado.nextInt();
        }
        
        System.out.println("La media de los 5 números es: " + sumaParcial/n);
    }
}
