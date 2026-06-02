/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad.n.pkg7;
import java.util.Scanner;
/**
 *
 * @author ET20
 */
public class ActividadN7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Ejercicio 1 
        /**int[][] matriz = new int[2][2];

        matriz[0][0] = 4;
        matriz[0][1] = 5;
        matriz[1][0] = 3;
        matriz[1][1] = 2;

        for (int fila = 0; fila < 2; fila++) {
            for (int col = 0; col < 2; col++) {
                System.out.print("[" + matriz[fila][col] + "]");
            }
            System.out.println();
        }
    }
}*/
        //Ejercicio 2 
        /**int[][] matriz = {
            {1, 5, 4},
            {2, 4, 5},
            {1, 2, 3}
        };

        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(matriz[fila][col] + " ");
            }
            System.out.println();
        }
    }
}*/
        //Eejercicio 3 
        /**Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
        int n = teclado.nextInt();

        int[][] matriz = new int[n][n];

        for (int fila = 0; fila < n; fila++) {
            for (int col = 0; col < n; col++) {
                System.out.print("Ingrese valor [" + fila + "][" + col + "]: ");
                matriz[fila][col] = teclado.nextInt();
            }
        }

        System.out.println("Matriz:");

        for (int fila = 0; fila < n; fila++) {
            for (int col = 0; col < n; col++) {
                System.out.print(matriz[fila][col] + " ");
            }
            System.out.println();
        }

        teclado.close();
    }
}*/
        //Ejercicio 4 
        /**Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese cantidad de filas: ");
        int filas = teclado.nextInt();

        System.out.print("Ingrese cantidad de columnas: ");
        int columnas = teclado.nextInt();

        int[][] matriz = new int[filas][columnas];

        for (int fila = 0; fila < filas; fila++) {
            for (int col = 0; col < columnas; col++) {
                System.out.print("Ingrese valor [" + fila + "][" + col + "]: ");
                matriz[fila][col] = teclado.nextInt();
            }
        }

        System.out.println("\nMatriz:");

        for (int fila = 0; fila < filas; fila++) {
            for (int col = 0; col < columnas; col++) {
                System.out.print(matriz[fila][col] + " ");
            }
            System.out.println();
        }

        teclado.close();
    }
}*/
        //Ejercicio 5
        /**Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese cantidad de filas: ");
        int filas = teclado.nextInt();
        teclado.nextLine();

        String[][] matriz = new String[filas][2];

        for (int fila = 0; fila < filas; fila++) {

            System.out.print("Ingrese nombre: ");
            matriz[fila][0] = teclado.nextLine();

            System.out.print("Ingrese número: ");
            matriz[fila][1] = teclado.nextLine();
        }

        System.out.println("\nNombre\tNúmero");

        for (int fila = 0; fila < filas; fila++) {
            System.out.println(matriz[fila][0] + "\t" + matriz[fila][1]);
        }

        teclado.close();
    }
}*/
         //Ejercicio 6
        /**String[][] matriz = {
            {"Juan", "25", "Ana"},
            {"30", "Pedro", "40"},
            {"Lucia", "22", "Carlos"}
        };

        System.out.println("Nombres\tNumeros");

        for (int fila = 0; fila < matriz.length; fila++) {  M
            for (int col = 0; col < matriz[fila].length - 1; col += 2) {

                String nombre = matriz[fila][col];
                String numero = matriz[fila][col + 1];

                System.out.println(nombre + "\t" + numero);
            }
        }
    }
}*/








        //Ejercicio 7 
        /**Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese cantidad de empleados: ");
        int empleados = teclado.nextInt();
        teclado.nextLine();

        String[][] matriz = new String[empleados][3];

        for (int fila = 0; fila < empleados; fila++) {

            System.out.print("Nombre: ");
            matriz[fila][0] = teclado.nextLine();

            System.out.print("Edad: ");
            matriz[fila][1] = teclado.nextLine();

            System.out.print("Sueldo: ");
            matriz[fila][2] = teclado.nextLine();
        }

        System.out.println("\nNombre\tEdad\tSueldo");

        for (int fila = 0; fila < empleados; fila++) {
            System.out.println(
                matriz[fila][0] + "\t" +
                matriz[fila][1] + "\t" +
                matriz[fila][2]
            );
        }

        teclado.close();
    }
}*/
        //Ejercicio 8 
        /**Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese cantidad de filas: ");
        int filas = teclado.nextInt();

        System.out.print("Ingrese cantidad de columnas: ");
        int columnas = teclado.nextInt();

        int[][] matriz = new int[filas][columnas];

        int suma = 0;
        int contador = 0;

        for (int fila = 0; fila < filas; fila++) {
            for (int col = 0; col < columnas; col++) {

                System.out.print("Ingrese valor [" + fila + "][" + col + "]: ");
                matriz[fila][col] = teclado.nextInt();

                if (matriz[fila][col] > 0 && matriz[fila][col] % 2 != 0) {
                    suma += matriz[fila][col];
                    contador++;
                }
            }
        }

        System.out.println("\nMatriz:");

        for (int fila = 0; fila < filas; fila++) {
            for (int col = 0; col < columnas; col++) {
                System.out.print(matriz[fila][col] + " ");
            }
            System.out.println();
        }

        if (contador > 0) {
            double promedio = (double) suma / contador;
            System.out.println(nPromedio de los números positivos e impares: " + promedio);
        } else {
            System.out.println("No hay números positivos e impares.");
        }

        teclado.close();
    }
}*/
