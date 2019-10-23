package Sesion02;

import Sesion01.*;
import java.util.Scanner;

/**
 * Clase que nos permite realizar la división entre tres mediante rectas.
 * @author Antonio Ramos
 * @version 1.0
 */
public class Ejercicio03 {
    /**
     * Método principal de la clase
     * @param args 
     */
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int dividendo, cociente = 0;
        
        do{
            System.out.print("Introduzca el número que quiere dividir entre 3. Recuerde que tiene que ser positivo: ");
            dividendo = teclado.nextInt();
            
            if(dividendo < 0){
                System.out.println("Error. El número tiene que ser mayor o igual que 0.");
            }
        }while (dividendo < 0);
        
        while(dividendo >= 3){
            dividendo = dividendo - 3;
            cociente++;
        }
        
        System.out.println("El resultado de la división es " + cociente + " y el resto " + dividendo);        
    }
}
