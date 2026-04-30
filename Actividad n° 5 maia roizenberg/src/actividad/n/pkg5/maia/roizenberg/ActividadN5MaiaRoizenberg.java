/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad.n.pkg5.maia.roizenberg;
import java.util.Scanner;
/**
 *
 * @author ET20
 */
public class ActividadN5MaiaRoizenberg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        char c;

        System.out.println("Ingrese un caracter ");
        c = teclado.next().charAt(0);

        while (c != ' ') {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                System.out.println("VOCAL");
            } else {
                System.out.println("NO VOCAL");
            }

           
        System.out.println("Programa terminado");
    }
        
        
        
   } 
} 
        
        
   
    
