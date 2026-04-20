/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act.n.pkg4.maia.roiz;
import java.util.Scanner;
/**
 *
 * @author ET20
 */
public class ActN4MaiaRoiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**Ejercicio 1 For
        int n = 1; 
           for (int n = 1; n <= 100; n++) {
            System.out.println(n);
        }*/ 
        
        /**Ejercicio 1 While
         while(n<=100){
        System.out.println(n);
            n++;   
        }*/
        /**Ejercicio 1 doWhile
         do{ 
          System.out.println(n);
            n++;
         } while (n <=100);*/   
        
        /**Ejercicio 2 for 
        System.out.print("Ingrese un numero :");
        int n = sc.nextInt();
        
        for (int t = 1; t <= n; t++) {
            System.out.println(t);
        }
        */
         /** Ejercicio 2 While
        System.out.print("Ingrese un numero: ");
        int n = sc.nextInt();

        int t = 1;
        while (t <= n) {
            System.out.println(t);
            t++;
        }
        */
         
        /** Ejercicio 2 do While 
        System.out.print("Ingrese un numero: ");
        int n = sc.nextInt();

        int t = 1;
        do {
            System.out.println(t);
            t++;
        } while (t <= n);
        
        */
        
        /** Ejercicio 3 for
        System.out.print("Ingrese un numero: ");
        int n = sc.nextInt();

        for (int t = n; t >= 1; t--) {
            System.out.println(t);
        }
        */
  
        
        
        /**Ejercicio 3 While 
        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();
        int t= 1;
        while(t <= n){
            System.out.println(t);
            t++;
        }*/
        
        /**Ejercicio 3 doWhile 
        System.out.println("Ingrese un numero:");
        int N = sc.nextInt();
        int t = 1;
        do{
            System.out.println(N);
            N--;
        } while (t<= N);    
        */
        
        /**Ejercicio 4 do While
        int num1, num2;
         do {
            System.out.print("Ingrese el primer numero: ");
            num1 = sc.nextInt();

            System.out.print("Ingrese el segundo numero: ");
            num2 = sc.nextInt();

            if (num1 == num2) {
                System.out.println("Los numeros son iguales. Intente nuevamente");
            }

        } while (num1 == num2);

        int menor, mayor;

        if (num1 < num2) {
            menor = num1;
            mayor = num2;
        } else {
            menor = num2;
            mayor = num1;
        }

        System.out.println("Numeros desde el menor hasta el mayor:");

        for (int i = menor; i <= mayor; i++) {
            System.out.println(i);
        }*/

        
        /**Ejercicio 4 While
        int num1 = 0, num2 = 0;
        while (num1 == num2) {
            System.out.println("Ingrese el primer numero: ");
            num1 = sc.nextInt();

            System.out.println("Ingrese el segundo numero: ");
            num2 = sc.nextInt();

            if (num1 == num2) {
                System.out.println("Los numeros no pueden ser iguales. Intente nuevamente");
            }
        }
        int menor, mayor;
        if (num1 < num2) {
            menor = num1;
            mayor = num2;
        } else {
            menor = num2;
            mayor = num1;
        }
        System.out.println("Numeros desde el menor hasta el mayor:");
        int t = menor;
        while (t <= mayor) {
        System.out.println(t);
        t++;
        }*/
        
        
        /**Ejercicio 5 do Whle 
        int A, B;

        
        do {
            System.out.println("Ingrese el valor de A: ");
            A = sc.nextInt();

            System.out.println("Ingrese el valor de B: ");
            B = sc.nextInt();

            if (A >= B) {
                
                System.out.println("A debe ser menor que B. Intente nuevamente");
            }

        } while (A >= B);

        System.out.println("Numeros pares entre A y B:");

        
        for (int i = A; i <= B; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }*/

        /**Ejercicio 5 While
        int A = 0, B = 0;

       
        while (A >= B) {
            System.out.println("Ingrese el valor de A: ");
            A = sc.nextInt();

            System.out.println("Ingrese el valor de B: ");
            B = sc.nextInt();

            if (A >= B) {
                System.out.println("A debe ser menor que B. Intente nuevamente.\n");
            }
        }

        System.out.println("Numeros pares entre A y B:");

        int t = A;

       
        while (t <= B) {
            if (t % 2 == 0) {
                System.out.println(t);
            }
            t++;
        }                                      
        */
        
        /**
        Scanner teclado = new Scanner(System.in);
        int A, B;

        
        System.out.print("Ingrese el numero A: ");
        A = sc.nextInt();

        System.out.print("Ingrese el numero B: ");
        B = sc.nextInt();

        
        while (A >= B) {
            System.out.println("Error: A debe ser menor que B. Intente nuevamente.");

            System.out.print("Ingrese el número A: ");
            A = sc.nextInt();

            System.out.print("Ingrese el número B: ");
            B = sc.nextInt();
        }

        
        for (int i = A; i <= B; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        
*/

        /**Ejercicio 6 while
         int N = 0; 
         int M = 0;

        System.out.print("Ingrese N: ");
        N = sc.nextInt();
        System.out.print("Ingrese M: ");
        M = sc.nextInt();

        while (N <= 0 || M <= 0 || N >= M) {
            System.out.println("Error: valores inválidos, N debe ser menor.");

            System.out.print("Ingrese N: ");
            N = sc.nextInt();
            System.out.print("Ingrese M: ");
            M = sc.nextInt();
        }

        int i = 1;
        while (i <= M) {
            if (i % N == 0) {
                System.out.println(i);
            }
            i++;
        }
       */
         
        /**Ejercicio 6 do Whie 
        Scanner teclado = new Scanner(System.in);
        int N, M;

        do {
            System.out.print("Ingrese N: ");
            N = sc.nextInt();
            System.out.print("Ingrese M: ");
            M = sc.nextInt();

            if (N <= 0 || M <= 0 || N >= M) {
                System.out.println("Error: valores inválidos.");
            }

        } while (N <= 0 || M <= 0 || N >= M);

        int i = 1;
        do {
            if (i % N == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= M);

        */
        
        /**Ejercicio 6 for
        Scanner teclado = new Scanner(System.in);
        int N, M;

        System.out.print("Ingrese N: ");
        N = sc.nextInt();
        System.out.print("Ingrese M: ");
        M = sc.nextInt();

        while (N <= 0 || M <= 0 || N >= M) {
            System.out.println("Error: valores inválidos.");

            System.out.print("Ingrese N: ");
            N = sc.nextInt();
            System.out.print("Ingrese M: ");
            M = sc.nextInt();
        }

        for (int i = 1; i <= M; i++) {
            if (i % N == 0) {
                System.out.println(i);
            }
        }*/
        
       
        /**Ejercicio 7 do while 
        Scanner teclado = new Scanner(System.in);
        double millas, km;

        do {
            System.out.println("Ingrese millas (0 para salir): ");
            millas = teclado.nextDouble();

            if (millas != 0) {
                km = millas * 1.6093;
                System.out.printf("Kilometros: %.2f\n", km);
            }

        } while (millas != 0);
        */
        
        /**Ejercicio 7 while 
        Scanner teclado = new Scanner(System.in);
        double millas, km;

        System.out.println("Ingrese millas (0 para salir): ");
        millas = teclado.nextDouble();

        while (millas != 0) {
            km = millas * 1.6093;
            System.out.printf("Kilometros: %.2f\n", km);

            System.out.println("Ingrese millas (0 para salir): ");
            millas = teclado.nextDouble();
        }
        */
        
        Scanner teclado = new Scanner(System.in);
        double millas, km;

        for (;;) {
            System.out.println("Ingrese millas (0 para salir): ");
            millas = teclado.nextDouble();

            if (millas == 0) {
                break;
            }

            km = millas * 1.6093;
            System.out.printf("Kilómetros: %.2f\n", km);
        }


        
        
        
        
        
       
       
            
        
        

    
    
    
    
    }
    
    
       
    
    
    
    }
    
    

