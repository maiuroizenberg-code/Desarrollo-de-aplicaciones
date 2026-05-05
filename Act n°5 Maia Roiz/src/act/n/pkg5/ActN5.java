/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act.n.pkg5;
import java.util.Scanner;
import java.util.Random;

public class ActN5 {

/**
 *
 * @author ET20
 */
//public class ActN5 {

    /**
     * @param args the command line arguments
     */
    //public static void main(String[] args) {
        //Ejercicio 1 
        /**int[] vector;
        vector = new int[10]; 

        Scanner teclado = new Scanner(System.in);

        int sumaPos = 0;
        int sumaNeg = 0;
        int contPos = 0;
        int contNeg = 0;

    
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número: ");
            vector[i] = teclado.nextInt();

            if (vector[i] >= 0) {
                sumaPos += vector[i];
                contPos++;
            } else {
                sumaNeg += vector[i];
                contNeg++;
            }
        }

  
        if (contPos > 0) {
            System.out.println("Media de positivos: " + (double)sumaPos / contPos);
        } else {
            System.out.println("No hay positivos");
        }

        if (contNeg > 0) {
            System.out.println("Media de negativos: " + (double)sumaNeg / contNeg);
        } else {
            System.out.println("No hay negativos");
        }

        teclado.close();*/
        
        
        //Ejercicio 2
        /**int[] vector = new int[10];
        Scanner teclado = new Scanner(System.in);

        int suma = 0;
        int contador = 0;

        
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número: ");
            vector[i] = teclado.nextInt();
        }

        
        for (int i = 0; i <10; i++) {
            if (i % 2 == 0) { 
                suma += vector[i];
                contador++;
            }
        }

        
        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("Media de posiciones pares: " + media);
        }

        teclado.close();*/
        
        
        //Ejercicio 3
        /**Scanner teclado = new Scanner(System.in);

        
        System.out.print("Ingrese número de alumnos: ");
        int n = teclado.nextInt();

        
        double[] notas = new double[n];

        
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota del alumno " + (i + 1) + ": ");
            notas[i] = teclado.nextDouble();
        }

        
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }

        double media = suma / notas.length;
        System.out.println("Nota media: " + media);

        
        System.out.println("Alumnos con nota superior a la media:");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                System.out.println("Alumno " + (i + 1) + " -> " + notas[i]);
            }
        }

        teclado.close();*/
 
        //Ejercicio 4
        /**Scanner teclado = new Scanner(System.in);   
        int[] pares = new int[20];

        int contador = 0; 

        
        while (contador < 20) {
            System.out.print("Ingresa un número: ");
            int num = teclado.nextInt();

            
            if (num % 2 == 0) {
                pares[contador] = num;
                contador++;
            }
        }

      
        System.out.println("Números pares ingresados:");
        for (int i = 0; i < 20; i++) {
            System.out.println(pares[i]);
        }

        teclado.close();*/
        
        //Ejercicio 5 
        /**int[] vector;
        vector = new int[10];

        Scanner teclado = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        
        System.out.println("Introduce 10 números enteros:");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = teclado.nextInt();
        }

        
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > 0) {
                positivos++;
            } else if (vector[i] < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        
        System.out.println("Cantidad de positivos: " + positivos);
        System.out.println("Cantidad de negativos: " + negativos);
        System.out.println("Cantidad de ceros: " + ceros);

        teclado.close();*/
    
        //Ejercicio 6 
        /**int[] vector;
        vector = new int[10];
        Scanner teclado = new Scanner(System.in);

        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int countPositivos = 0;
        int countNegativos = 0;

        
        System.out.println("Introduce 10 números enteros:");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = teclado.nextInt();
        }

        
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > 0) {
                sumaPositivos += vector[i];
                countPositivos++;
            } else if (vector[i] < 0) {
                sumaNegativos += vector[i];
                countNegativos++;
            }
        }

        
        if (countPositivos > 0) {
            double mediaPositivos = (double) sumaPositivos / countPositivos;
            System.out.println("Media de positivos: " + mediaPositivos);
        } else {
            System.out.println("No hay números positivos.");
        }

        if (countNegativos > 0) {
            double mediaNegativos = (double) sumaNegativos / countNegativos;
            System.out.println("Media de negativos: " + mediaNegativos);
        } else {
            System.out.println("No hay números negativos.");
        }

        teclado.close();*/
        
        //Ejercicio 8 
        /**String[] nombres;
        nombres = new String[20];
        double[] sueldos;
        sueldos = new double[20];

        Scanner teclado = new Scanner(System.in);

        double mayorSueldo;
        int indiceMayor = 0;

        
        System.out.println("Empleado 1:");
        System.out.print("Nombre: ");
        nombres[0] =  teclado .nextLine();
        System.out.print("Sueldo: ");
        sueldos[0] =  teclado .nextDouble();

        mayorSueldo = sueldos[0];

         teclado .nextLine();

        
        for (int i = 1; i < 20; i++) {
            System.out.println("Empleado " + (i + 1) + ":");

            System.out.print("Nombre: ");
            nombres[i] =  teclado .nextLine();

            System.out.print("Sueldo: ");
            sueldos[i] =  teclado .nextDouble();

             teclado .nextLine(); 

            
            if (sueldos[i] > mayorSueldo) {
                mayorSueldo = sueldos[i];
                indiceMayor = i;
            }
        }

       
        System.out.println("Empleado con mayor sueldo:");
        System.out.println("Nombre: " + nombres[indiceMayor]);
        System.out.println("Sueldo: " + mayorSueldo);

         teclado .close();*/
        
        //Ejercicio 9 
        

    public static void main(String[] args) {
        int[] array = generarArray(1, 10, 5);

        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static int[] generarArray(int desde, int hasta, int tamaño) {
        int[] array = new int[tamaño];
        Random random = new Random();

        for (int i = 0; i < tamaño; i++) {
            int numero;

            do {
                numero = random.nextInt(hasta - desde + 1) + desde;
            } while (comprobarSiContiene(array, i, numero));

            array[i] = numero;
        }

        return array;
    }

    public static boolean comprobarSiContiene(int[] array, int posicion, int numero) {
        for (int i = 0; i < posicion; i++) {
            if (array[i] == numero) {
                return true;
            }
        }
        return false;
        
    }


    }
    
}
