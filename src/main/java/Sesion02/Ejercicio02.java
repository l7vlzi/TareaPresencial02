package Sesion02;

import java.util.Scanner;

/**
 * Clase que nos permite sumar números hasta que sea mayor que 88.
 * @author Antonio Ramos
 * @version 1.0
 */
public class Ejercicio02 {
    /**
     * Método principal de la clase
     * @param args 
     */
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int numero, contador = 0, sumaNumeros = 0;
        
        System.out.println("Queremos pedir números mientras que la suma de los valores introducidos sea menor"
                + "que 88.");
        
        do{
            System.out.print("Introduzca un valor: ");
            numero = teclado.nextInt();
            sumaNumeros = sumaNumeros + numero;
            contador++;
        }while(sumaNumeros < 88);
        
        System.out.println("Se han introducido " + contador + " números. La suma de todos ellos es " + sumaNumeros);
    }
}
