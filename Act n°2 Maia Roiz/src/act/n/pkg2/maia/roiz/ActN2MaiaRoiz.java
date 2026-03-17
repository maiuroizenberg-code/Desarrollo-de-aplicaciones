package act.n.pkg2.maia.roiz;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class ActN2MaiaRoiz{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       /**Scanner teclado = new Scanner(System.in);

       
        System.out.print("Introduce el primer número: ");
          int num1 = teclado.nextInt();

        System.out.print("Introduce el segundo número: ");
            int num2 = teclado.nextInt();

        
       // if (num1 == num2) {
            System.out.println("Los números " + num1 + " y " + num2 + " son IGUALES.");
        } else {
            System.out.println("Los números " + num1 + " y " + num2 + " son DIFERENTES.");
        }

        
        //teclado.close();
        */
       /** 
       Scanner teclado = new Scanner(System.in);
         
         System.out.print("Introduce el primer número: ");
          int num1 = teclado.nextInt();
          
           System.out.print("Introduce el segundo número: ");
        int num2 = teclado.nextInt();
         if (num1 > num2) {
             System.out.println("El número  " + num1 + " es mayor que " + num2 );
        } else {
              System.out.println( "El número " + num2 + " es mayor que  " + num1 );
        }
        teclado.close();
        *  */
       
       
         
        /**Scanner teclado = new Scanner(System.in);


        System.out.print("Introduce el primer número: ");
            int num1 = teclado.nextInt();


        System.out.print("Introduce el segundo número: ");
           int num2 = teclado.nextInt();


        int ultima1 = num1 % 10;

        int ultima2 = num2 % 10;


        if (ultima1 == ultima2) {

            System.out.println("Los dos números terminan con la misma cifra.");

        } else {

            System.out.println("Los números terminan con cifras diferentes.");

        }


        teclado.close();*/
        
        /**Scanner teclado = new Scanner(System.in);


        System.out.print("Introduce un número entero: ");

        int numero = teclado.nextInt();


        if (numero % 3 == 0 && numero % 5 == 0) {

            System.out.println("El número SI es múltiplo de 3 y de 5.");

        } else {

            System.out.println("El número NO es múltiplo de 3 y de 5.");

        }


        teclado.close();*/

   
       //  Scanner teclado = new Scanner(System.in);


        //System.out.print("Introduce el primer número: ");

       // int num1 = teclado.nextInt();


     //   System.out.print("Introduce el segundo número: ");

       // int num2 = teclado.nextInt();


       // System.out.print("Introduce el tercer número: ");

       // int num3 = teclado.nextInt();


      //  int mayor = num1;


       // if (num2 > mayor) {

       //     mayor = num2;

      //  }


     //   if (num3 > mayor) {

         //   mayor = num3;

      //  }


     //   System.out.println("El número mayor es: " + mayor);


       // teclado.close();
       
       Scanner teclado = new Scanner(System.in);


        System.out.print("Introduce una nota entre 0 y 10: ");

        double nota = teclado.nextDouble();


        if (nota < 0 || nota > 10) {

            System.out.println("La nota introducida no es válida.");

        } else if (nota < 5) {

            System.out.println("Insuficiente");

        } else if (nota < 6) {

            System.out.println("Suficiente");

        } else if (nota < 7) {

            System.out.println("Bien");

        } else if (nota < 9) {

            System.out.println("Notable");

        } else {

            System.out.println("Sobresaliente");

        }


        teclado.close();

   

    }

}