package Sesion01;

import java.util.Scanner;

/**
 * Clase que nos permite saber cuantos días tiene un mes.
 * @author Antonio Ramos
 * @version 2.0
 */
public class Ejercicio02v2 {
    /**
     * Método principal de la clase
     * @param args 
     */
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int mes;
        
        do{
            System.out.print("Introduzca un mes del año en formato numérico: ");
            mes = teclado.nextInt();
            
            if(mes < 1 || mes > 12){
                System.out.println("Error. El número tiene que estar entre 1 y 12 (ambos incluidos).");
            }
        }while (mes < 1 || mes > 12);
        
        switch(mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("El mes tiene 31 días.");
                break;
            case 2:
                System.out.println("El mes tiene 28 ó 29 días dependiendo de si el año es bisiesto.");
                break;
            default:
                System.out.println("El mes tiene 30 días.");
                break;
        }
        
    }
}
