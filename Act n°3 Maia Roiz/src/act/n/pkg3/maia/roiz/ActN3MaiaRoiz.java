/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act.n.pkg3.maia.roiz;

import java.util.Scanner;

/**
 *
 * @author ET20
 */
public class ActN3MaiaRoiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        /**1-
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = teclado.nextInt();

        if (edad >= 18) {
        System.out.println("Es mayor de edad");
        } else {
        System.out.println("No es mayor de edad");
        
        * teclado.close();
        }*/
        
        /**2-
         Scanner teclado = new Scanner(System.in);
        String contrasenaGuardada = "12345678";

        System.out.print("Ingrese la contraseña: ");
        String contrasenaUsuario = teclado.nextLine();
        if (contrasenaGuardada.equals(contrasenaUsuario)) {
        System.out.println("La contraseña es correcta");
        } else {
        System.out.println("La contraseña es incorrecta");
        
        teclado.close();
        }*/
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = teclado.nextInt();

        System.out.print("Ingrese el segundo número (divisor): ");
        int num2 = teclado.nextInt();
        
        if (num2 == 0) {
        System.out.println("Error: no se puede dividir por cero");
        } else {
        int resultado = num1 / num2;
        System.out.println("El resultado es: " + resultado);
        }

       
        
        
        
        
        
      
    
    }
    
}
