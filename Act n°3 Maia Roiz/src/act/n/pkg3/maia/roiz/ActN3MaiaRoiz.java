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
        
        /**3-
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
        teclado.close();
        }*/
        
        /**4-
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = teclado.nextInt();

        System.out.print("Ingrese sus ingresos mensuales: ");
        double ingresos = teclado.nextDouble();

        if (edad > 16 && ingresos >= 1000) {
            System.out.println("Debe tributar");
        } else {
            System.out.println("No debe tributar");
            teclado.close();
        }*/
        
        /**5-
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese su puntuación: ");
        double puntos = teclado.nextDouble();

        String nivel;
        double dinero;

        if (puntos == 0.0) {
        nivel = "Inaceptable";
        } else if (puntos == 0.4) {
        nivel = "Aceptable";
        } else if (puntos >= 0.6) {
        nivel = "Meritorio";
        } else {
        nivel = "Puntuación inválida";
        }

        if (nivel.equals("Puntuación inválida")) {
            System.out.println(nivel);
        } else {
        dinero = 2400 * puntos;
        System.out.println("Nivel: " + nivel);
        System.out.println("Dinero recibido: €" + dinero);
         teclado.close();
        }*/
        
        /**6-
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la edad del cliente: ");
        int edad = teclado.nextInt();

        int precio;

        if (edad < 4) {
            precio = 0;
        } else if (edad <= 18) {
            precio = 5;
        } else {
            precio = 10;
        }

        System.out.println("El precio de la entrada es: €" + precio);
        teclado.close();
       }*/
        
  
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Quiere una pizza vegetariana? (si/no): ");
        String opcion = teclado.nextLine();

        String ingrediente = "";

        if (opcion.equalsIgnoreCase("si")) {

            System.out.println("Ingredientes disponibles:");
            System.out.println("1. Pimiento");
            System.out.println("2. Tofu");
            System.out.print("Elija un ingrediente (1 o 2): ");
            int eleccion = teclado.nextInt();

            if (eleccion == 1) {
                ingrediente = "Pimiento";
            } else if (eleccion == 2) {
                ingrediente = "Tofu";
            }

            System.out.println("\nPizza vegetariana con:");
            System.out.println("- Tomate");
            System.out.println("- Mozzarella");
            System.out.println("- " + ingrediente);

        } else {

            System.out.println("Ingredientes disponibles:");
            System.out.println("1. Peperoni");
            System.out.println("2. Jamón");
            System.out.println("3. Salmón");
            System.out.print("Elija un ingrediente (1, 2 o 3): ");
            int eleccion = teclado.nextInt();

            if (eleccion == 1) {
                ingrediente = "Peperoni";
            } else if (eleccion == 2) {
                ingrediente = "Jamón";
            } else if (eleccion == 3) {
                ingrediente = "Salmón";
            }

            System.out.println("\nPizza no vegetariana con:");
            System.out.println("- Tomate");
            System.out.println("- Mozzarella");
            System.out.println("- " + ingrediente);
        }
    
 
       
    }
    
}
