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
        
        int num1, num2;

        
        do {
            System.out.print("Ingrese el primer número: ");
            num1 = sc.nextInt();

            System.out.print("Ingrese el segundo número: ");
            num2 = sc.nextInt();

            if (num1 == num2) {
                System.out.println("Los números son iguales. Intente nuevamente.");
            }
        } while (num1 == num2);
        int min = Math.min(num1,num2);
        int max = Math.max(num1, num2);
        for (int a = min; a <= max; a++ ) {
            System.out.println(a
            );
        }

       
            
        
        

    
    
    
    
    }
    
    
       
    
    
    
    }
    
    

