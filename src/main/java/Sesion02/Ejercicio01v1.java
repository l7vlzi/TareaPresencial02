package Sesion02;

import java.util.Scanner;

/**
 * Clase que nos permite calcular la media de 5 números.
 * @author Antonio Ramos
 * @version 1.0
 */
public class Ejercicio01v1 {
    /**
     * Método principal de la clase
     * @param args 
     */
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int numero, media, sumaParcial = 0;
        
        System.out.println("Vamos a calcular la media de 5 números.");
        
        for(int i = 0; i < 5; i++){
            System.out.print("Introduzca un valor: ");
            numero = teclado.nextInt();
            sumaParcial = sumaParcial + numero;
        }
        
        media = sumaParcial/5;
        System.out.println("La media de los 5 números es: " + media);
    }
}
