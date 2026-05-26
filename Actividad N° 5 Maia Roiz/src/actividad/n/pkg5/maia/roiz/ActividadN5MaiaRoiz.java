/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad.n.pkg5.maia.roiz;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
/**
 *
 * @author ET20
 */
public class ActividadN5MaiaRoiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Ejercicio 1 Método Arrays.sort()
        /**Integer[] vector = new Integer[10];

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


        Arrays.sort(vector);

        System.out.println("Vector ordenado ascendente:");
        for (int n : vector) {
            System.out.println(n);
        }

     
        Arrays.sort(vector, Collections.reverseOrder());

        System.out.println("Vector ordenado descendente:");
        for (int n : vector) {
            System.out.println(n);
        }

       
        if (contPos > 0) {
            System.out.println("Media de positivos: " + (double) sumaPos / contPos);
        } else {
            System.out.println("No hay positivos");
        }

        if (contNeg > 0) {
            System.out.println("Media de negativos: " + (double) sumaNeg / contNeg);
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

        
        Arrays.sort(vector);

        System.out.println("Vector ordenado:");

        for (int num : vector) {
            System.out.print(num + " ");
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {

            if (i % 2 == 0) {
                suma += vector[i];
                contador++;
            }
        }

        if (contador > 0) {

            double media = (double) suma / contador;

            System.out.println("Media de posiciones pares: "
                    + media);
        }

        teclado.close();
        */
        //Ejercicio 3 
        /**Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese número de alumnos: ");
        int n = teclado.nextInt();

        double[ ] notas = new double[n];

        for (int i = 0; i < notas.length; i++) {

            System.out.print("Nota del alumno "
                    + (i + 1) + ": ");

            notas[i] = teclado.nextDouble();
        }

        
        Arrays.sort(notas);

        System.out.println("Notas ordenadas:");

        for (double nota : notas) {
            System.out.print(nota + " ");
        }

        System.out.println();

        double suma = 0;

        for (double nota : notas) {
            suma += nota;
        }

        double media = suma / notas.length;

        System.out.println("Nota media: " + media);

        System.out.println("Alumnos con nota superior a la media:");

        for (int i = 0; i < notas.length; i++) {

            if (notas[i] > media) {
                System.out.println("Alumno "
                        + (i + 1)
                        + " -> "
                        + notas[i]);
            }
        }

        teclado.close();
        */
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

        
        Arrays.sort(pares);

        System.out.println("Números pares ordenados:");

        for (int num : pares) {
            System.out.println(num);
        }

        teclado.close();
    }
}*/ 
        //Ejercicio 5 
        /**int[] vector = new int[10];

        Scanner teclado = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        System.out.println("Introduce 10 números enteros:");

        for (int i = 0; i < vector.length; i++) {
            vector[i] = teclado.nextInt();
        }

        
        Arrays.sort(vector);

        System.out.println("Vector ordenado:");

        for (int num : vector) {
            System.out.print(num + " ");
        }

        System.out.println();

        for (int i = 0; i < vector.length; i++) {

            if (vector[i] > 0) {
                positivos++;
            } else if (vector[i] < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        System.out.println("Cantidad de positivos: "
                + positivos);

        System.out.println("Cantidad de negativos: "
                + negativos);

        System.out.println("Cantidad de ceros: "
                + ceros);

        teclado.close();
    }
}*/
        //Ejercicio 6 
        /**int[] vector = new int[10];

        Scanner teclado = new Scanner(System.in);

        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int countPositivos = 0;
        int countNegativos = 0;

        System.out.println("Introduce 10 números enteros:");

        for (int i = 0; i < vector.length; i++) {
            vector[i] = teclado.nextInt();
        }

        
        Arrays.sort(vector);

        System.out.println("Vector ordenado:");

        for (int num : vector) {
            System.out.print(num + " ");
        }

        System.out.println();

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

            double mediaPositivos =
                    (double) sumaPositivos / countPositivos;

            System.out.println("Media de positivos: "
                    + mediaPositivos);

        } else {
            System.out.println("No hay números positivos.");
        }

        if (countNegativos > 0) {

            double mediaNegativos =
                    (double) sumaNegativos / countNegativos;

            System.out.println("Media de negativos: "
                    + mediaNegativos);

        } else {
            System.out.println("No hay números negativos.");
        }

        teclado.close();
    }
}*/
        //Ejercicio 8 
        /**String[ ] nombres = new String[20];
        double[ ] sueldos = new double[20];

        Scanner teclado = new Scanner(System.in);

        double mayorSueldo;
        int indiceMayor = 0;

        System.out.println("Empleado 1:");

        System.out.print("Nombre: ");
        nombres[0] = teclado.nextLine();

        System.out.print("Sueldo: ");
        sueldos[0] = teclado.nextDouble();

        mayorSueldo = sueldos[0];

        teclado.nextLine();

        for (int i = 1; i < 20; i++) {

            System.out.println("Empleado " + (i + 1) + ":");

            System.out.print("Nombre: ");
            nombres[i] = teclado.nextLine();

            System.out.print("Sueldo: ");
            sueldos[i] = teclado.nextDouble();

            teclado.nextLine();

            if (sueldos[i] > mayorSueldo) {
                mayorSueldo = sueldos[i];
                indiceMayor = i;
            }
        }

        
        Arrays.sort(sueldos);

        System.out.println("Sueldos ordenados:");

        for (double sueldo : sueldos) {
            System.out.println(sueldo);
        }

        System.out.println();

        System.out.println("Empleado con mayor sueldo:");
        System.out.println("Nombre: " + nombres[indiceMayor]);
        System.out.println("Sueldo: " + mayorSueldo);

        teclado.close();
    }
}*/
        //Ejercicio 9 
        /**int[] array = generarArray(1, 10, 5);

        
        Arrays.sort(array);

        System.out.println("Array ordenado:");

        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static int[] generarArray(int desde,
                                     int hasta,
                                     int tamaño) {

        int[] array = new int[tamaño];

        Random random = new Random();

        for (int i = 0; i < tamaño; i++) {

            int numero;

            do {

                numero =
                        random.nextInt(hasta - desde + 1)
                        + desde;

            } while (comprobarSiContiene(array,
                    i,
                    numero));

            array[i] = numero;
        }

        return array;
    }

    public static boolean comprobarSiContiene(
            int[] array,
            int posicion,
            int numero) {

        for (int i = 0; i < posicion; i++) {

            if (array[i] == numero) {
                return true;
            }
        }

        return false;
    }
}*/
//Ejercicio 1 Metodo de la burbuja
        /**int[] vector = new int[10];

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

      
        int aux;

        for (int i = 0; i < vector.length - 1; i++) {

            for (int j = 0; j < vector.length - i - 1; j++) {

                if (vector[j + 1] < vector[j]) {

                    aux = vector[j + 1];
                    vector[j + 1] = vector[j];
                    vector[j] = aux;
                }
            }
        }

      
        System.out.println("\nVector ordenado:");

        for (int n : vector) {
            System.out.println(n);
        }


        if (contPos > 0) {
            System.out.println("Media de positivos: " + (double) sumaPos / contPos);
        } else {
            System.out.println("No hay positivos");
        }

    
        if (contNeg > 0) {
            System.out.println("Media de negativos: " + (double) sumaNeg / contNeg);
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

        
        for (int i = 0; i < vector.length - 1; i++) {

            for (int j = 0; j < vector.length - 1 - i; j++) {

                if (vector[j] > vector[j + 1]) {

                    int aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                }
            }
        }

        System.out.println("Vector ordenado:");

        for (int num : vector) {
            System.out.print(num + " ");
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {

            if (i % 2 == 0) {
                suma += vector[i];
                contador++;
            }
        }

        if (contador > 0) {

            double media = (double) suma / contador;

            System.out.println("Media de posiciones pares: "
                    + media);
        }

        teclado.close();
    }
}*/
        //Ejercicio 3 
        /**Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese número de alumnos: ");
        int n = teclado.nextInt();

        double[] notas = new double[n];

        for (int i = 0; i < notas.length; i++) {

            System.out.print("Nota del alumno "
                    + (i + 1) + ": ");

            notas[i] = teclado.nextDouble();
        }

        
        for (int i = 0; i < notas.length - 1; i++) {

            for (int j = 0; j < notas.length - 1 - i; j++) {

                if (notas[j] > notas[j + 1]) {

                    double aux = notas[j];
                    notas[j] = notas[j + 1];
                    notas[j + 1] = aux;
                }
            }
        }

        System.out.println("Notas ordenadas:");

        for (double nota : notas) {
            System.out.print(nota + " ");
        }

        System.out.println();

        double suma = 0;

        for (double nota : notas) {
            suma += nota;
        }

        double media = suma / notas.length;

        System.out.println("Nota media: " + media);

        System.out.println("Alumnos con nota superior a la media:");

        for (int i = 0; i < notas.length; i++) {

            if (notas[i] > media) {

                System.out.println("Alumno "
                        + (i + 1)
                        + " -> "
                        + notas[i]);
            }
        }

        teclado.close();
    }
}*/
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

        
        for (int i = 0; i < pares.length - 1; i++) {

            for (int j = 0; j < pares.length - 1 - i; j++) {

                if (pares[j] > pares[j + 1]) {

                    int aux = pares[j];
                    pares[j] = pares[j + 1];
                    pares[j + 1] = aux;
                }
            }
        }

        System.out.println("Números pares ordenados:");

        for (int num : pares) {
            System.out.println(num);
        }

        teclado.close();
    }
}*/
        //Ejercicio 5
        /**int[] vector = new int[10];

        Scanner teclado = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        System.out.println("Introduce 10 números enteros:");

        for (int i = 0; i < vector.length; i++) {
            vector[i] = teclado.nextInt();
        }

        
        for (int i = 0; i < vector.length - 1; i++) {

            for (int j = 0; j < vector.length - 1 - i; j++) {

                if (vector[j] > vector[j + 1]) {

                    int aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                }
            }
        }

        System.out.println("Vector ordenado:");

        for (int num : vector) {
            System.out.print(num + " ");
        }

        System.out.println();

        for (int i = 0; i < vector.length; i++) {

            if (vector[i] > 0) {
                positivos++;
            } else if (vector[i] < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        System.out.println("Cantidad de positivos: "
                + positivos);

        System.out.println("Cantidad de negativos: "
                + negativos);

        System.out.println("Cantidad de ceros: "
                + ceros);

        teclado.close();
    }
}*/
        //Ejercicio 6 
        /**int[] vector = new int[10];

        Scanner teclado = new Scanner(System.in);

        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int countPositivos = 0;
        int countNegativos = 0;

        System.out.println("Introduce 10 números enteros:");

        for (int i = 0; i < vector.length; i++) {
            vector[i] = teclado.nextInt();
        }

        
        for (int i = 0; i < vector.length - 1; i++) {

            for (int j = 0; j < vector.length - 1 - i; j++) {

                if (vector[j] > vector[j + 1]) {

                    int aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                }
            }
        }

        System.out.println("Vector ordenado:");

        for (int num : vector) {
            System.out.print(num + " ");
        }

        System.out.println();

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

            double mediaPositivos =
                    (double) sumaPositivos / countPositivos;

            System.out.println("Media de positivos: "
                    + mediaPositivos);

        } else {
            System.out.println("No hay números positivos.");
        }

        if (countNegativos > 0) {

            double mediaNegativos =
                    (double) sumaNegativos / countNegativos;

            System.out.println("Media de negativos: "
                    + mediaNegativos);

        } else {
            System.out.println("No hay números negativos.");
        }

        teclado.close();
    }
}*/
        //Ejercicio 8        
        /**String[] nombres = new String[20];
        double[] sueldos = new double[20];

        Scanner teclado = new Scanner(System.in);

        double mayorSueldo;
        int indiceMayor = 0;

        System.out.println("Empleado 1:");

        System.out.print("Nombre: ");
        nombres[0] = teclado.nextLine();

        System.out.print("Sueldo: ");
        sueldos[0] = teclado.nextDouble();

        mayorSueldo = sueldos[0];

        teclado.nextLine();

        for (int i = 1; i < 20; i++) {

            System.out.println("Empleado " + (i + 1) + ":");

            System.out.print("Nombre: ");
            nombres[i] = teclado.nextLine();

            System.out.print("Sueldo: ");
            sueldos[i] = teclado.nextDouble();

            teclado.nextLine();

            if (sueldos[i] > mayorSueldo) {
                mayorSueldo = sueldos[i];
                indiceMayor = i;
            }
        }

        
        for (int i = 0; i < sueldos.length - 1; i++) {

            for (int j = 0; j < sueldos.length - 1 - i; j++) {

                if (sueldos[j] > sueldos[j + 1]) {

                    double auxSueldo = sueldos[j];
                    sueldos[j] = sueldos[j + 1];
                    sueldos[j + 1] = auxSueldo;

                    String auxNombre = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = auxNombre;
                }
            }
        }

        System.out.println("Empleados ordenados por sueldo:");

        for (int i = 0; i < sueldos.length; i++) {
            System.out.println(nombres[i] + " -> " + sueldos[i]);
        }

        System.out.println();

        System.out.println("Empleado con mayor sueldo:");
        System.out.println("Nombre: " + nombres[indiceMayor]);
        System.out.println("Sueldo: " + mayorSueldo);

        teclado.close();
    }
}*/
        //Ejercicio 9 
        /**int[] array = generarArray(1, 10, 5);

        
        for (int i = 0; i < array.length - 1; i++) {

            for (int j = 0; j < array.length - 1 - i; j++) {

                if (array[j] > array[j + 1]) {

                    int aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }

        System.out.println("Array ordenado:");

        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static int[] generarArray(int desde,
                                     int hasta,
                                     int tamaño) {

        int[] array = new int[tamaño];

        Random random = new Random();

        for (int i = 0; i < tamaño; i++) {

            int numero;

            do {

                numero =
                        random.nextInt(hasta - desde + 1)
                        + desde;

            } while (comprobarSiContiene(array,
                    i,
                    numero));

            array[i] = numero;
        }

        return array;
    }

    public static boolean comprobarSiContiene(
            int[] array,
            int posicion,
            int numero) {

        for (int i = 0; i < posicion; i++) {

            if (array[i] == numero) {
                return true;
            }
        }

        return false;
    }
}*/
//Ejercicio 1 Metodo Ordenamiento por Inserción directa
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


        int p;
        int j;
        int aux;

        for (p = 1; p < vector.length; p++) {

            aux = vector[p];
            j = p - 1;

            while ((j >= 0) && (aux < vector[j])) {

                vector[j + 1] = vector[j];
                j--;
            }

            vector[j + 1] = aux;
        }

        System.out.println("\nVector ordenado:");

        for (int n : vector) {

            System.out.println(n);
        }


        if (contPos > 0) {

            System.out.println("\nMedia de positivos: " + (double) sumaPos / contPos);

        } else {

            System.out.println("No hay positivos");
        }


        if (contNeg > 0) {

            System.out.println("Media de negativos: " + (double) sumaNeg / contNeg);

        } else {

            System.out.println("No hay negativos");
        }

        teclado.close();
        }
    }*/
        //Ejercicio 2 
        /**int[] vector = new int[10];

        Scanner teclado = new Scanner(System.in);

        int suma = 0;
        int contador = 0;

        for (int i = 0; i < 10; i++) {

            System.out.print("Ingrese un número: ");
            vector[i] = teclado.nextInt();
        }

        
        for (int i = 1; i < vector.length; i++) {

            int aux = vector[i];
            int j = i - 1;

            while (j >= 0 && vector[j] > aux) {

                vector[j + 1] = vector[j];
                j--;
            }

            vector[j + 1] = aux;
        }

        System.out.println("Vector ordenado:");

        for (int num : vector) {
            System.out.print(num + " ");
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {

            if (i % 2 == 0) {
                suma += vector[i];
                contador++;
            }
        }

        if (contador > 0) {

            double media = (double) suma / contador;

            System.out.println("Media de posiciones pares: "
                    + media);
        }

        teclado.close();
    }
}*/
        
        //Ejercicio 3 
        /**Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese número de alumnos: ");
        int n = teclado.nextInt();

        double[] notas = new double[n];

        for (int i = 0; i < notas.length; i++) {

            System.out.print("Nota del alumno "
                    + (i + 1) + ": ");

            notas[i] = teclado.nextDouble();
        }

        
        for (int i = 1; i < notas.length; i++) {

            double aux = notas[i];
            int j = i - 1;

            while (j >= 0 && notas[j] > aux) {

                notas[j + 1] = notas[j];
                j--;
            }

            notas[j + 1] = aux;
        }

        System.out.println("Notas ordenadas:");

        for (double nota : notas) {
            System.out.print(nota + " ");
        }

        System.out.println();

        double suma = 0;

        for (double nota : notas) {
            suma += nota;
        }

        double media = suma / notas.length;

        System.out.println("Nota media: " + media);

        System.out.println("Alumnos con nota superior a la media:");

        for (int i = 0; i < notas.length; i++) {

            if (notas[i] > media) {

                System.out.println("Alumno "
                        + (i + 1)
                        + " -> "
                        + notas[i]);
            }
        }

        teclado.close();
    }
}*/
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

        
        for (int i = 1; i < pares.length; i++) {

            int aux = pares[i];
            int j = i - 1;

            while (j >= 0 && pares[j] > aux) {

                pares[j + 1] = pares[j];
                j--;
            }

            pares[j + 1] = aux;
        }

        System.out.println("Números pares ordenados:");

        for (int num : pares) {
            System.out.println(num);
        }

        teclado.close();
    }
}*/
        
        //Ejercicio 5 
        /**int[] vector = new int[10];

        Scanner teclado = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        System.out.println("Introduce 10 números enteros:");

        for (int i = 0; i < vector.length; i++) {
            vector[i] = teclado.nextInt();
        }

        
        for (int i = 1; i < vector.length; i++) {

            int aux = vector[i];
            int j = i - 1;

            while (j >= 0 && vector[j] > aux) {

                vector[j + 1] = vector[j];
                j--;
            }

            vector[j + 1] = aux;
        }

        System.out.println("Vector ordenado:");

        for (int num : vector) {
            System.out.print(num + " ");
        }

        System.out.println();

        for (int i = 0; i < vector.length; i++) {

            if (vector[i] > 0) {
                positivos++;
            } else if (vector[i] < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        System.out.println("Cantidad de positivos: "
                + positivos);

        System.out.println("Cantidad de negativos: "
                + negativos);

        System.out.println("Cantidad de ceros: "
                + ceros);

        teclado.close();
    }
}*/
        //Ejercicio 6 
        /**int[] vector = new int[10];

        Scanner teclado = new Scanner(System.in);

        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int countPositivos = 0;
        int countNegativos = 0;

        System.out.println("Introduce 10 números enteros:");

        for (int i = 0; i < vector.length; i++) {
            vector[i] = teclado.nextInt();
        }

        
        for (int i = 1; i < vector.length; i++) {

            int aux = vector[i];
            int j = i - 1;

            while (j >= 0 && vector[j] > aux) {

                vector[j + 1] = vector[j];
                j--;
            }

            vector[j + 1] = aux;
        }

        System.out.println("Vector ordenado:");

        for (int num : vector) {
            System.out.print(num + " ");
        }

        System.out.println();

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

            double mediaPositivos =
                    (double) sumaPositivos / countPositivos;

            System.out.println("Media de positivos: "
                    + mediaPositivos);

        } else {
            System.out.println("No hay números positivos.");
        }

        if (countNegativos > 0) {

            double mediaNegativos =
                    (double) sumaNegativos / countNegativos;

            System.out.println("Media de negativos: "
                    + mediaNegativos);

        } else {
            System.out.println("No hay números negativos.");
        }

        teclado.close();
    }
}*/
        //Ejercicio 8 
        /**String[] nombres = new String[20];
        double[] sueldos = new double[20];

        Scanner teclado = new Scanner(System.in);

        double mayorSueldo;
        int indiceMayor = 0;

        System.out.println("Empleado 1:");

        System.out.print("Nombre: ");
        nombres[0] = teclado.nextLine();

        System.out.print("Sueldo: ");
        sueldos[0] = teclado.nextDouble();

        mayorSueldo = sueldos[0];

        teclado.nextLine();

        for (int i = 1; i < 20; i++) {

            System.out.println("Empleado " + (i + 1) + ":");

            System.out.print("Nombre: ");
            nombres[i] = teclado.nextLine();

            System.out.print("Sueldo: ");
            sueldos[i] = teclado.nextDouble();

            teclado.nextLine();

            if (sueldos[i] > mayorSueldo) {
                mayorSueldo = sueldos[i];
                indiceMayor = i;
            }
        }

        
        for (int i = 1; i < sueldos.length; i++) {

            double auxSueldo = sueldos[i];
            String auxNombre = nombres[i];

            int j = i - 1;

            while (j >= 0 && sueldos[j] > auxSueldo) {

                sueldos[j + 1] = sueldos[j];
                nombres[j + 1] = nombres[j];

                j--;
            }

            sueldos[j + 1] = auxSueldo;
            nombres[j + 1] = auxNombre;
        }

        System.out.println("Empleados ordenados por sueldo:");

        for (int i = 0; i < sueldos.length; i++) {
            System.out.println(nombres[i] + " -> " + sueldos[i]);
        }

        System.out.println();

        System.out.println("Empleado con mayor sueldo:");
        System.out.println("Nombre: " + nombres[indiceMayor]);
        System.out.println("Sueldo: " + mayorSueldo);

        teclado.close();
    }
}*/
        //Ejercicio 9 
        /**int[] array = generarArray(1, 10, 5);

        
        for (int i = 1; i < array.length; i++) {

            int aux = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > aux) {

                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = aux;
        }

        System.out.println("Array ordenado:");

        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static int[] generarArray(int desde,
                                     int hasta,
                                     int tamaño) {

        int[] array = new int[tamaño];

        Random random = new Random();

        for (int i = 0; i < tamaño; i++) {

            int numero;

            do {

                numero =
                        random.nextInt(hasta - desde + 1)
                        + desde;

            } while (comprobarSiContiene(array,
                    i,
                    numero));

            array[i] = numero;
        }

        return array;
    }

    public static boolean comprobarSiContiene(
            int[] array,
            int posicion,
            int numero) {

        for (int i = 0; i < posicion; i++) {

            if (array[i] == numero) {
                return true;
            }
        }

        return false;
    }
}*/
//Ejercicio 1 Metodo Shell de Ordenación
        /** int[] vector;
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


        int salto;
        int aux;
        int i;
        boolean cambios;

        for (salto = vector.length / 2; salto != 0; salto /= 2) {

            cambios = true;

            while (cambios) {

                cambios = false;

                for (i = salto; i < vector.length; i++) {

                    if (vector[i - salto] > vector[i]) {

                        aux = vector[i];
                        vector[i] = vector[i - salto];
                        vector[i - salto] = aux;

                        cambios = true;
                    }
                }
            }
        }

 
        System.out.println("\nVector ordenado:");

        for (int n : vector) {

            System.out.println(n);
        }

    
        if (contPos > 0) {

            System.out.println("Media de positivos: " + (double) sumaPos / contPos);

        } else {

            System.out.println("No hay positivos");
        }

        
        if (contNeg > 0) {

            System.out.println("Media de negativos: " + (double) sumaNeg / contNeg);

        } else {

            System.out.println("No hay negativos");
        }

        teclado.close();
    }
}*/
        //Ejercicio 2 
        /**int[] vector = new int[10];

        Scanner teclado = new Scanner(System.in);

        int suma = 0;
        int contador = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número: ");
            vector[i] = teclado.nextInt();
        }

        
        int salto = vector.length / 2;

        while (salto != 0) {

            for (int i = salto; i < vector.length; i++) {

                int aux = vector[i];
                int j = i;

                while (j >= salto && vector[j - salto] > aux) {
                    vector[j] = vector[j - salto];
                    j -= salto;
                }

                vector[j] = aux;
            }

            salto = salto / 2;
        }

        System.out.println("Vector ordenado:");

        for (int num : vector) {
            System.out.print(num + " ");
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {

            if (i % 2 == 0) {
                suma += vector[i];
                contador++;
            }
        }

        if (contador > 0) {

            double media = (double) suma / contador;

            System.out.println("Media de posiciones pares: " + media);
        }

        teclado.close();
    }
}*/
        
        //Ejercicio 3 
        /**Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese número de alumnos: ");
        int n = teclado.nextInt();

        double[] notas = new double[n];

        for (int i = 0; i < notas.length; i++) {

            System.out.print("Nota del alumno " + (i + 1) + ": ");
            notas[i] = teclado.nextDouble();
        }

        
        int salto = notas.length / 2;

        while (salto != 0) {

            for (int i = salto; i < notas.length; i++) {

                double aux = notas[i];
                int j = i;

                while (j >= salto && notas[j - salto] > aux) {
                    notas[j] = notas[j - salto];
                    j -= salto;
                }

                notas[j] = aux;
            }

            salto = salto / 2;
        }

        System.out.println("Notas ordenadas:");

        for (double nota : notas) {
            System.out.print(nota + " ");
        }

        System.out.println();

        double suma = 0;

        for (double nota : notas) {
            suma += nota;
        }

        double media = suma / notas.length;

        System.out.println("Nota media: " + media);

        System.out.println("Alumnos con nota superior a la media:");

        for (int i = 0; i < notas.length; i++) {

            if (notas[i] > media) {
                System.out.println("Alumno " + (i + 1) + " -> " + notas[i]);
            }
        }

        teclado.close();
    }
}*/
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

        
        int salto = pares.length / 2;

        while (salto != 0) {

            for (int i = salto; i < pares.length; i++) {

                int aux = pares[i];
                int j = i;

                while (j >= salto && pares[j - salto] > aux) {
                    pares[j] = pares[j - salto];
                    j -= salto;
                }

                pares[j] = aux;
            }

            salto = salto / 2;
        }

        System.out.println("Números pares ordenados:");

        for (int num : pares) {
            System.out.println(num);
        }

        teclado.close();
    }
}*/
        //Ejercicio 5 
        /**int[] vector = new int[10];

        Scanner teclado = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        System.out.println("Introduce 10 números enteros:");

        for (int i = 0; i < vector.length; i++) {
            vector[i] = teclado.nextInt();
        }

        
        int salto = vector.length / 2;

        while (salto != 0) {

            for (int i = salto; i < vector.length; i++) {

                int aux = vector[i];
                int j = i;

                while (j >= salto && vector[j - salto] > aux) {
                    vector[j] = vector[j - salto];
                    j -= salto;
                }

                vector[j] = aux;
            }

            salto = salto / 2;
        }

        System.out.println("Vector ordenado:");

        for (int num : vector) {
            System.out.print(num + " ");
        }

        System.out.println();

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

        teclado.close();
    }
}*/
        //Ejercicio 6 
        /**int[] vector = new int[10];

        Scanner teclado = new Scanner(System.in);

        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int countPositivos = 0;
        int countNegativos = 0;

        System.out.println("Introduce 10 números enteros:");

        for (int i = 0; i < vector.length; i++) {
            vector[i] = teclado.nextInt();
        }

        
        int salto = vector.length / 2;

        while (salto != 0) {

            for (int i = salto; i < vector.length; i++) {

                int aux = vector[i];
                int j = i;

                while (j >= salto && vector[j - salto] > aux) {
                    vector[j] = vector[j - salto];
                    j -= salto;
                }

                vector[j] = aux;
            }

            salto = salto / 2;
        }

        System.out.println("Vector ordenado:");

        for (int num : vector) {
            System.out.print(num + " ");
        }

        System.out.println();

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

            double mediaPositivos =
                    (double) sumaPositivos / countPositivos;

            System.out.println("Media de positivos: "
                    + mediaPositivos);

        } else {
            System.out.println("No hay números positivos.");
        }

        if (countNegativos > 0) {

            double mediaNegativos =
                    (double) sumaNegativos / countNegativos;

            System.out.println("Media de negativos: "
                    + mediaNegativos);

        } else {
            System.out.println("No hay números negativos.");
        }

        teclado.close();
    }
}*/
        //Ejercicio 8 
        /**String[ ] nombres = new String[20];
        double[ ] sueldos = new double[20];

        Scanner teclado = new Scanner(System.in);

        double mayorSueldo;
        int indiceMayor = 0;

        System.out.println("Empleado 1:");

        System.out.print("Nombre: ");
        nombres[0] = teclado.nextLine();

        System.out.print("Sueldo: ");
        sueldos[0] = teclado.nextDouble();

        mayorSueldo = sueldos[0];

        teclado.nextLine();

        for (int i = 1; i < 20; i++) {

            System.out.println("Empleado " + (i + 1) + ":");

            System.out.print("Nombre: ");
            nombres[i] = teclado.nextLine();

            System.out.print("Sueldo: ");
            sueldos[i] = teclado.nextDouble();

            teclado.nextLine();

            if (sueldos[i] > mayorSueldo) {
                mayorSueldo = sueldos[i];
                indiceMayor = i;
            }
        }

        
        int salto = sueldos.length / 2;

        while (salto != 0) {

            for (int i = salto; i < sueldos.length; i++) {

                double auxSueldo = sueldos[i];
                String auxNombre = nombres[i];

                int j = i;

                while (j >= salto &&
                        sueldos[j - salto] > auxSueldo) {

                    sueldos[j] = sueldos[j - salto];
                    nombres[j] = nombres[j - salto];

                    j -= salto;
                }

                sueldos[j] = auxSueldo;
                nombres[j] = auxNombre;
            }

            salto = salto / 2;
        }

        System.out.println("Empleados ordenados por sueldo:");

        for (int i = 0; i < sueldos.length; i++) {
            System.out.println(nombres[i] + " -> " + sueldos[i]);
        }

        System.out.println();

        System.out.println("Empleado con mayor sueldo:");
        System.out.println("Nombre: " + nombres[indiceMayor]);
        System.out.println("Sueldo: " + mayorSueldo);

        teclado.close();
    }
}*/

//Ejercicio 1 Método de un array en Java utilizando Comparable y Comparator
      
       /**Integer[] vector = new Integer[10];
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

       Arrays.sort(vector, Collections.reverseOrder());

       System.out.println("Vector ordenado:");

       for (int num : vector) {
       System.out.print(num + " ");
    }

       System.out.println();

       if (contPos > 0) {
       System.out.println("Media de positivos: " + (double) sumaPos / contPos);
       } else {
       System.out.println("No hay positivos");
    }

       if (contNeg > 0) {
       System.out.println("Media de negativos: " + (double) sumaNeg / contNeg);
       } else {
       System.out.println("No hay negativos");
    }

       teclado.close();
    }
}*/
      //Ejercicio 2 
      /**Integer[] vector = new Integer[10];
      Scanner teclado = new Scanner(System.in);

      int suma = 0;
      int contador = 0;

      for (int i = 0; i < 10; i++) {
      System.out.print("Ingrese un número: ");
      vector[i] = teclado.nextInt();
    }

      Arrays.sort(vector, Collections.reverseOrder());

      System.out.println("Vector ordenado:");

      for (int num : vector) {
      System.out.print(num + " ");
    }

      System.out.println();

      for (int i = 0; i < 10; i++) {

      if (i % 2 == 0) {
      suma += vector[i];
      contador++;
    }
}

      if (contador > 0) {
      double media = (double) suma / contador;
      System.out.println("Media de posiciones pares: " + media);
    }

      teclado.close();
    }
}*/
     //Ejercicio 3 
      /**Scanner teclado = new Scanner(System.in);

      System.out.print("Ingrese número de alumnos: ");
      int n = teclado.nextInt();

      Double[] notas = new Double[n];

      for (int i = 0; i < notas.length; i++) {
     System.out.print("Nota del alumno " + (i + 1) + ": ");
     notas[i] = teclado.nextDouble();
    }

     Arrays.sort(notas, Collections.reverseOrder());

     System.out.println("Notas ordenadas:");

     for (double nota : notas) {
     System.out.print(nota + " ");
    }

     System.out.println();

     double suma = 0;

     for (double nota : notas) {
     suma += nota;
    }

     double media = suma / notas.length;

     System.out.println("Nota media: " + media);

     System.out.println("Alumnos con nota superior a la media:");

     for (int i = 0; i < notas.length; i++) {

     if (notas[i] > media) {
    System.out.println("Alumno " + (i + 1) + " -> " + notas[i]);
    }
}

     teclado.close();
    }
}*/
     //Ejercicio 4 
      /**Scanner teclado = new Scanner(System.in);

      Integer[] pares = new Integer[20];

      int contador = 0;

      while (contador < 20) {

      System.out.print("Ingresa un número: ");
      int num = teclado.nextInt();

      if (num % 2 == 0) {
      pares[contador] = num;
      contador++;
    }
}

     Arrays.sort(pares, Collections.reverseOrder());

    System.out.println("Números pares ordenados:");

    for (int num : pares) {
    System.out.println(num);
   }

    teclado.close();
    }
}*/
     //Ejercicio 5 
     /**Integer[] vector = new Integer[10];

     Scanner teclado = new Scanner(System.in);

     int positivos = 0;
     int negativos = 0;
     int ceros = 0;

     System.out.println("Introduce 10 números enteros:");

     for (int i = 0; i < vector.length; i++) {
     vector[i] = teclado.nextInt();
    }

      Arrays.sort(vector, Collections.reverseOrder());

     System.out.println("Vector ordenado:");

     for (int num : vector) {
     System.out.print(num + " ");
    }

     System.out.println();

     for (int num : vector) {

     if (num > 0) {
     positivos++;
     } else if (num < 0) {
     negativos++;
     } else {
     ceros++;
    }
}

     System.out.println("Cantidad de positivos: " + positivos);
     System.out.println("Cantidad de negativos: " + negativos);
     System.out.println("Cantidad de ceros: " + ceros);

     teclado.close();
    }
}*/
    //Ejercicio 6 
      /**Integer[] vector = new Integer[10];

      Scanner teclado = new Scanner(System.in);

      int sumaPositivos = 0;
      int sumaNegativos = 0;
      int countPositivos = 0;
      int countNegativos = 0;

      System.out.println("Introduce 10 números enteros:");

      for (int i = 0; i < vector.length; i++) {
     vector[i] = teclado.nextInt();
    }

     Arrays.sort(vector, Collections.reverseOrder());

     System.out.println("Vector ordenado:");

     for (int num : vector) {
     System.out.print(num + " ");
    }

     System.out.println();

     for (int num : vector) {

     if (num > 0) {
     sumaPositivos += num;
     countPositivos++;
     } else if (num < 0) {
     sumaNegativos += num;
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

     teclado.close();
    }
}*/
     //Ejercicio 8 
       /*String[] nombres = new String[20];
        Double[] sueldos = new Double[20];

        Scanner teclado = new Scanner(System.in);

        System.out.println("Carga de empleados");

        for (int i = 0; i < 20; i++) {

            System.out.println("Empleado " + (i + 1));

            System.out.print("Nombre: ");
            nombres[i] = teclado.nextLine();

            System.out.print("Sueldo: ");
            sueldos[i] = teclado.nextDouble();

            teclado.nextLine();
        }

        Integer[] indices = new Integer[20];

        for (int i = 0; i < indices.length; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, new Comparator<Integer>() {

            @Override
            public int compare(Integer a, Integer b) {

                return sueldos[b].compareTo(sueldos[a]);
            }
        });

        System.out.println("Empleados ordenados por sueldo:");

        for (int i = 0; i < indices.length; i++) {

            int pos = indices[i];

            System.out.println(
                    nombres[pos] + " -> $" + sueldos[pos]);
        }

        System.out.println();

        System.out.println("Empleado con mayor sueldo:");

        System.out.println(
                nombres[indices[0]] + " -> $" + sueldos[indices[0]]);

        teclado.close();
    }
}*/
       //Ejercicio 9 
        /**Integer[] array = generarArray(1, 10, 5);

        
        Arrays.sort(array, Collections.reverseOrder());

        System.out.println("Array ordenado:");

        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static Integer[] generarArray(
            int desde,
            int hasta,
            int tamaño) {

        Integer[] array = new Integer[tamaño];

        Random random = new Random();

        for (int i = 0; i < tamaño; i++) {

            int numero;

            do {

                numero =
                        random.nextInt(hasta - desde + 1)
                        + desde;

            } while (comprobarSiContiene(
                    array,
                    i,
                    numero));

            array[i] = numero;
        }

        return array;
    }

    public static boolean comprobarSiContiene(
            Integer[] array,
            int posicion,
            int numero) {

        for (int i = 0; i < posicion; i++) {

            if (array[i] == numero) {
                return true;
            }
        }

        return false;
    }
}*/
        
//Ejercicio 1 Método de Ordenación por Selección
        /**int[] vector = new int[10];

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

        
        for (int i = 0; i < vector.length - 1; i++) {

            int minimo = i;

            for (int j = i + 1; j < vector.length; j++) {

                if (vector[j] < vector[minimo]) {
                    minimo = j;
                }
            }

            int auxiliar = vector[i];
            vector[i] = vector[minimo];
            vector[minimo] = auxiliar;
        }

        System.out.println("Vector ordenado:");

        for (int num : vector) {
            System.out.print(num + " ");
        }

        System.out.println();

        if (contPos > 0) {
            System.out.println("Media de positivos: "
                    + (double) sumaPos / contPos);
        } else {
            System.out.println("No hay positivos");
        }

        if (contNeg > 0) {
            System.out.println("Media de negativos: "
                    + (double) sumaNeg / contNeg);
        } else {
            System.out.println("No hay negativos");
        }

        teclado.close();
    }
}*/
        //Ejercicio 2 
        /**int[] vector = new int[10];

        Scanner teclado = new Scanner(System.in);

        int suma = 0;
        int contador = 0;

        for (int i = 0; i < 10; i++) {

            System.out.print("Ingrese un número: ");
            vector[i] = teclado.nextInt();
        }

        
        for (int i = 0; i < vector.length - 1; i++) {

            int minimo = i;

            for (int j = i + 1; j < vector.length; j++) {

                if (vector[j] < vector[minimo]) {
                    minimo = j;
                }
            }

            int auxiliar = vector[i];
            vector[i] = vector[minimo];
            vector[minimo] = auxiliar;
        }

        System.out.println("Vector ordenado:");

        for (int num : vector) {
            System.out.print(num + " ");
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {

            if (i % 2 == 0) {
                suma += vector[i];
                contador++;
            }
        }

        if (contador > 0) {

            double media = (double) suma / contador;

            System.out.println(
                    "Media de posiciones pares: "
                    + media);
        }

        teclado.close();
    }
}*/
        //Ejercicio 3 
        /**Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese número de alumnos: ");
        int n = teclado.nextInt();

        double[] notas = new double[n];

        for (int i = 0; i < notas.length; i++) {

            System.out.print("Nota del alumno "
                    + (i + 1) + ": ");

            notas[i] = teclado.nextDouble();
        }

        
        for (int i = 0; i < notas.length - 1; i++) {

            int minimo = i;

            for (int j = i + 1; j < notas.length; j++) {

                if (notas[j] < notas[minimo]) {
                    minimo = j;
                }
            }

            double auxiliar = notas[i];
            notas[i] = notas[minimo];
            notas[minimo] = auxiliar;
        }

        System.out.println("Notas ordenadas:");

        for (double nota : notas) {
            System.out.print(nota + " ");
        }

        System.out.println();

        double suma = 0;

        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }

        double media = suma / notas.length;

        System.out.println("Nota media: " + media);

        System.out.println(
                "Alumnos con nota superior a la media:");

        for (int i = 0; i < notas.length; i++) {

            if (notas[i] > media) {

                System.out.println(
                        "Alumno "
                        + (i + 1)
                        + " -> "
                        + notas[i]);
            }
        }

        teclado.close();
    }
}*/
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

        
        for (int i = 0; i < pares.length - 1; i++) {

            int minimo = i;

            for (int j = i + 1; j < pares.length; j++) {

                if (pares[j] < pares[minimo]) {
                    minimo = j;
                }
            }

            int auxiliar = pares[i];
            pares[i] = pares[minimo];
            pares[minimo] = auxiliar;
        }

        System.out.println("Números pares ordenados:");

        for (int i = 0; i < 20; i++) {
            System.out.println(pares[i]);
        }

        teclado.close();
    }
}*/
        //Ejercicio 5 
        /**int[] vector = new int[10];

        Scanner teclado = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        System.out.println("Introduce 10 números enteros:");

        for (int i = 0; i < vector.length; i++) {
            vector[i] = teclado.nextInt();
        }

        
        for (int i = 0; i < vector.length - 1; i++) {

            int minimo = i;

            for (int j = i + 1; j < vector.length; j++) {

                if (vector[j] < vector[minimo]) {
                    minimo = j;
                }
            }

            int auxiliar = vector[i];
            vector[i] = vector[minimo];
            vector[minimo] = auxiliar;
        }

        System.out.println("Vector ordenado:");

        for (int num : vector) {
            System.out.print(num + " ");
        }

        System.out.println();

        for (int i = 0; i < vector.length; i++) {

            if (vector[i] > 0) {
                positivos++;
            } else if (vector[i] < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        System.out.println("Cantidad de positivos: "
                + positivos);

        System.out.println("Cantidad de negativos: "
                + negativos);

        System.out.println("Cantidad de ceros: "
                + ceros);

        teclado.close();
    }
}*/
        //Ejercicio 6 
        /**int[] vector = new int[10];

        Scanner teclado = new Scanner(System.in);

        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int countPositivos = 0;
        int countNegativos = 0;

        System.out.println("Introduce 10 números enteros:");

        for (int i = 0; i < vector.length; i++) {
            vector[i] = teclado.nextInt();
        }

        
        for (int i = 0; i < vector.length - 1; i++) {

            int minimo = i;

            for (int j = i + 1; j < vector.length; j++) {

                if (vector[j] < vector[minimo]) {
                    minimo = j;
                }
            }

            int auxiliar = vector[i];
            vector[i] = vector[minimo];
            vector[minimo] = auxiliar;
        }

        System.out.println("Vector ordenado:");

        for (int num : vector) {
            System.out.print(num + " ");
        }

        System.out.println();

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

            double mediaPositivos =
                    (double) sumaPositivos / countPositivos;

            System.out.println("Media de positivos: "
                    + mediaPositivos);

        } else {
            System.out.println("No hay números positivos.");
        }

        if (countNegativos > 0) {

            double mediaNegativos =
                    (double) sumaNegativos / countNegativos;

            System.out.println("Media de negativos: "
                    + mediaNegativos);

        } else {
            System.out.println("No hay números negativos.");
        }

        teclado.close();
    }
}*/
        //Ejercicio 8
        /**String[] nombres = new String[20];
        double[] sueldos = new double[20];

        Scanner teclado = new Scanner(System.in);

        double mayorSueldo;
        int indiceMayor = 0;

        System.out.println("Empleado 1:");

        System.out.print("Nombre: ");
        nombres[0] = teclado.nextLine();

        System.out.print("Sueldo: ");
        sueldos[0] = teclado.nextDouble();

        mayorSueldo = sueldos[0];

        teclado.nextLine();

        for (int i = 1; i < 20; i++) {

            System.out.println("Empleado " + (i + 1) + ":");

            System.out.print("Nombre: ");
            nombres[i] = teclado.nextLine();

            System.out.print("Sueldo: ");
            sueldos[i] = teclado.nextDouble();

            teclado.nextLine();

            if (sueldos[i] > mayorSueldo) {
                mayorSueldo = sueldos[i];
                indiceMayor = i;
            }
        }

        
        for (int i = 0; i < sueldos.length - 1; i++) {

            int minimo = i;

            for (int j = i + 1; j < sueldos.length; j++) {

                if (sueldos[j] < sueldos[minimo]) {
                    minimo = j;
                }
            }

            double auxSueldo = sueldos[i];
            sueldos[i] = sueldos[minimo];
            sueldos[minimo] = auxSueldo;

            String auxNombre = nombres[i];
            nombres[i] = nombres[minimo];
            nombres[minimo] = auxNombre;
        }

        System.out.println("Empleados ordenados por sueldo:");

        for (int i = 0; i < sueldos.length; i++) {

            System.out.println(
                    nombres[i] + " -> " + sueldos[i]);
        }

        System.out.println();

        System.out.println("Empleado con mayor sueldo:");
        System.out.println("Nombre: " + nombres[indiceMayor]);
        System.out.println("Sueldo: " + mayorSueldo);

        teclado.close();
    }
}*/
        //Ejercicio 9 
        /**int[] array = generarArray(1, 10, 5);

        
        for (int i = 0; i < array.length - 1; i++) {

            int minimo = i;

            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < array[minimo]) {
                    minimo = j;
                }
            }

            int auxiliar = array[i];
            array[i] = array[minimo];
            array[minimo] = auxiliar;
        }

        System.out.println("Array ordenado:");

        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static int[] generarArray(
            int desde,
            int hasta,
            int tamaño) {

        int[] array = new int[tamaño];

        Random random = new Random();

        for (int i = 0; i < tamaño; i++) {

            int numero;

            do {

                numero =
                        random.nextInt(hasta - desde + 1)
                        + desde;

            } while (comprobarSiContiene(
                    array,
                    i,
                    numero));

            array[i] = numero;
        }

        return array;
    }

    public static boolean comprobarSiContiene(
            int[] array,
            int posicion,
            int numero) {

        for (int i = 0; i < posicion; i++) {

            if (array[i] == numero) {
                return true;
            }
        }

        return false;
    }
}*/
 
//Ejercicio 1 Método Java Quicksort
        /**int[] vector = new int[10];

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

        quickSort(vector, 0, vector.length - 1);

        System.out.println("Vector ordenado:");

        for (int num : vector) {
            System.out.print(num + " ");
        }

        System.out.println();

        if (contPos > 0) {
            System.out.println("Media de positivos: "
                    + (double) sumaPos / contPos);
        } else {
            System.out.println("No hay positivos");
        }

        if (contNeg > 0) {
            System.out.println("Media de negativos: "
                    + (double) sumaNeg / contNeg);
        } else {
            System.out.println("No hay negativos");
        }

        teclado.close();
    }

    public static void quickSort(int[] vector, int izquierda, int derecha) {

        int pivote = vector[izquierda];
        int i = izquierda;
        int j = derecha;
        int auxiliar;

        while (i < j) {

            while (vector[i] <= pivote && i < j) {
                i++;
            }

            while (vector[j] > pivote) {
                j--;
            }

            if (i < j) {
                auxiliar = vector[i];
                vector[i] = vector[j];
                vector[j] = auxiliar;
            }
        }

        vector[izquierda] = vector[j];
        vector[j] = pivote;

        if (izquierda < j - 1) {
            quickSort(vector, izquierda, j - 1);
        }

        if (j + 1 < derecha) {
            quickSort(vector, j + 1, derecha);
        }
    }
}*/
        //Ejercicio 2 
        /**int[] vector = new int[10];

        Scanner teclado = new Scanner(System.in);

        int suma = 0;
        int contador = 0;

        for (int i = 0; i < 10; i++) {

            System.out.print("Ingrese un número: ");
            vector[i] = teclado.nextInt();
        }

        quickSort(vector, 0, vector.length - 1);

        System.out.println("Vector ordenado:");

        for (int num : vector) {
            System.out.print(num + " ");
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {

            if (i % 2 == 0) {
                suma += vector[i];
                contador++;
            }
        }

        if (contador > 0) {

            double media = (double) suma / contador;

            System.out.println("Media de posiciones pares: "
                    + media);
        }

        teclado.close();
    }

    public static void quickSort(int[] vector, int izquierda, int derecha) {

        int pivote = vector[izquierda];
        int i = izquierda;
        int j = derecha;
        int auxiliar;

        while (i < j) {

            while (vector[i] <= pivote && i < j) {
                i++;
            }

            while (vector[j] > pivote) {
                j--;
            }

            if (i < j) {
                auxiliar = vector[i];
                vector[i] = vector[j];
                vector[j] = auxiliar;
            }
        }

        vector[izquierda] = vector[j];
        vector[j] = pivote;

        if (izquierda < j - 1) {
            quickSort(vector, izquierda, j - 1);
        }

        if (j + 1 < derecha) {
            quickSort(vector, j + 1, derecha);
        }
    }
}*/
        //Ejercicio 3 

        /**Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese número de alumnos: ");
        int n = teclado.nextInt();

        double[] notas = new double[n];

        for (int i = 0; i < notas.length; i++) {

            System.out.print("Nota del alumno "
                    + (i + 1) + ": ");

            notas[i] = teclado.nextDouble();
        }

        quickSort(notas, 0, notas.length - 1);

        System.out.println("Notas ordenadas:");

        for (double nota : notas) {
            System.out.print(nota + " ");
        }

        System.out.println();

        double suma = 0;

        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }

        double media = suma / notas.length;

        System.out.println("Nota media: " + media);

        System.out.println("Alumnos con nota superior a la media:");

        for (int i = 0; i < notas.length; i++) {

            if (notas[i] > media) {

                System.out.println("Alumno "
                        + (i + 1)
                        + " -> "
                        + notas[i]);
            }
        }

        teclado.close();
    }

    public static void quickSort(double[] vector,
            int izquierda,
            int derecha) {

        double pivote = vector[izquierda];
        int i = izquierda;
        int j = derecha;
        double auxiliar;

        while (i < j) {

            while (vector[i] <= pivote && i < j) {
                i++;
            }

            while (vector[j] > pivote) {
                j--;
            }

            if (i < j) {

                auxiliar = vector[i];
                vector[i] = vector[j];
                vector[j] = auxiliar;
            }
        }

        vector[izquierda] = vector[j];
        vector[j] = pivote;

        if (izquierda < j - 1) {
            quickSort(vector, izquierda, j - 1);
        }

        if (j + 1 < derecha) {
            quickSort(vector, j + 1, derecha);
        }
    }
}*/
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

        quickSort(pares, 0, pares.length - 1);

        System.out.println("Números pares ordenados:");

        for (int i = 0; i < 20; i++) {
            System.out.println(pares[i]);
        }

        teclado.close();
    }

    public static void quickSort(int[] vector,
            int izquierda,
            int derecha) {

        int pivote = vector[izquierda];
        int i = izquierda;
        int j = derecha;
        int auxiliar;

        while (i < j) {

            while (vector[i] <= pivote && i < j) {
                i++;
            }

            while (vector[j] > pivote) {
                j--;
            }

            if (i < j) {

                auxiliar = vector[i];
                vector[i] = vector[j];
                vector[j] = auxiliar;
            }
        }

        vector[izquierda] = vector[j];
        vector[j] = pivote;

        if (izquierda < j - 1) {
            quickSort(vector, izquierda, j - 1);
        }

        if (j + 1 < derecha) {
            quickSort(vector, j + 1, derecha);
        }
    }
}*/
        
        //Ejercicio 5 

        /**int[] vector = new int[10];

        Scanner teclado = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        System.out.println("Introduce 10 números enteros:");

        for (int i = 0; i < vector.length; i++) {
            vector[i] = teclado.nextInt();
        }

        quickSort(vector, 0, vector.length - 1);

        System.out.println("Vector ordenado:");

        for (int num : vector) {
            System.out.print(num + " ");
        }

        System.out.println();

        for (int i = 0; i < vector.length; i++) {

            if (vector[i] > 0) {
                positivos++;
            } else if (vector[i] < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        System.out.println("Cantidad de positivos: "
                + positivos);

        System.out.println("Cantidad de negativos: "
                + negativos);

        System.out.println("Cantidad de ceros: "
                + ceros);

        teclado.close();
    }

    public static void quickSort(int[] vector,
            int izquierda,
            int derecha) {

        int pivote = vector[izquierda];
        int i = izquierda;
        int j = derecha;
        int auxiliar;

        while (i < j) {

            while (vector[i] <= pivote && i < j) {
                i++;
            }

            while (vector[j] > pivote) {
                j--;
            }

            if (i < j) {

                auxiliar = vector[i];
                vector[i] = vector[j];
                vector[j] = auxiliar;
            }
        }

        vector[izquierda] = vector[j];
        vector[j] = pivote;

        if (izquierda < j - 1) {
            quickSort(vector, izquierda, j - 1);
        }

        if (j + 1 < derecha) {
            quickSort(vector, j + 1, derecha);
        }
    }
}*/
        //Ejercicio 6 
        /**int[] vector = new int[10];

        Scanner teclado = new Scanner(System.in);

        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int countPositivos = 0;
        int countNegativos = 0;

        System.out.println("Introduce 10 números enteros:");

        for (int i = 0; i < vector.length; i++) {
            vector[i] = teclado.nextInt();
        }

        
        quickSort(vector, 0, vector.length - 1);

        System.out.println("Vector ordenado:");

        for (int num : vector) {
            System.out.print(num + " ");
        }

        System.out.println();

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

            double mediaPositivos =
                    (double) sumaPositivos / countPositivos;

            System.out.println("Media de positivos: "
                    + mediaPositivos);

        } else {
            System.out.println("No hay números positivos.");
        }

        if (countNegativos > 0) {

            double mediaNegativos =
                    (double) sumaNegativos / countNegativos;

            System.out.println("Media de negativos: "
                    + mediaNegativos);

        } else {
            System.out.println("No hay números negativos.");
        }

        teclado.close();
    }

    public static void quickSort(int[] vector, int izquierda, int derecha) {

        int pivote = vector[izquierda];
        int i = izquierda;
        int j = derecha;
        int auxiliar;

        while (i < j) {

            while (vector[i] <= pivote && i < j) {
                i++;
            }

            while (vector[j] > pivote) {
                j--;
            }

            if (i < j) {
                auxiliar = vector[i];
                vector[i] = vector[j];
                vector[j] = auxiliar;
            }
        }

        vector[izquierda] = vector[j];
        vector[j] = pivote;

        if (izquierda < j - 1) {
            quickSort(vector, izquierda, j - 1);
        }

        if (j + 1 < derecha) {
            quickSort(vector, j + 1, derecha);
        }
    }
}*/
        //Ejercicio 8 
        /**String[] nombres = new String[20];
        double[] sueldos = new double[20];

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {

            System.out.println("Empleado " + (i + 1));

            System.out.print("Nombre: ");
            nombres[i] = teclado.nextLine();

            System.out.print("Sueldo: ");
            sueldos[i] = teclado.nextDouble();

            teclado.nextLine();
        }

        
        quickSort(sueldos, nombres, 0, sueldos.length - 1);

        System.out.println("Empleados ordenados por sueldo:");

        for (int i = 0; i < sueldos.length; i++) {

            System.out.println(
                    nombres[i] + " -> " + sueldos[i]);
        }

        teclado.close();
    }

    public static void quickSort(
            double[] sueldos,
            String[] nombres,
            int izquierda,
            int derecha) {

        double pivote = sueldos[izquierda];

        int i = izquierda;
        int j = derecha;

        while (i < j) {

            while (sueldos[i] <= pivote && i < j) {
                i++;
            }

            while (sueldos[j] > pivote) {
                j--;
            }

            if (i < j) {

                double auxSueldo = sueldos[i];
                sueldos[i] = sueldos[j];
                sueldos[j] = auxSueldo;

                String auxNombre = nombres[i];
                nombres[i] = nombres[j];
                nombres[j] = auxNombre;
            }
        }

        sueldos[izquierda] = sueldos[j];
        sueldos[j] = pivote;

        if (izquierda < j - 1) {
            quickSort(sueldos, nombres, izquierda, j - 1);
        }

        if (j + 1 < derecha) {
            quickSort(sueldos, nombres, j + 1, derecha);
        }
    }
}*/
        //Ejercicio 9 
        /**int[] array = generarArray(1, 10, 5);

        
        quickSort(array, 0, array.length - 1);

        System.out.println("Array ordenado:");

        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static int[] generarArray(
            int desde,
            int hasta,
            int tamaño) {

        int[] array = new int[tamaño];

        Random random = new Random();

        for (int i = 0; i < tamaño; i++) {

            int numero;

            do {

                numero =
                        random.nextInt(hasta - desde + 1)
                        + desde;

            } while (comprobarSiContiene(
                    array,
                    i,
                    numero));

            array[i] = numero;
        }

        return array;
    }

    public static boolean comprobarSiContiene(
            int[] array,
            int posicion,
            int numero) {

        for (int i = 0; i < posicion; i++) {

            if (array[i] == numero) {
                return true;
            }
        }

        return false;
    }

    public static void quickSort(
            int[] vector,
            int izquierda,
            int derecha) {

        int pivote = vector[izquierda];

        int i = izquierda;
        int j = derecha;

        while (i < j) {

            while (vector[i] <= pivote && i < j) {
                i++;
            }

            while (vector[j] > pivote) {
                j--;
            }

            if (i < j) {

                int auxiliar = vector[i];
                vector[i] = vector[j];
                vector[j] = auxiliar;
            }
        }

        vector[izquierda] = vector[j];
        vector[j] = pivote;

        if (izquierda < j - 1) {
            quickSort(vector, izquierda, j - 1);
        }

        if (j + 1 < derecha) {
            quickSort(vector, j + 1, derecha);
        }
    }
}*/
//Ejercicio 1 Método de ordenación MergeSort
        /**public static void mergeSort(
                int[] vector, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int medio = (izquierda + derecha) / 2;

            mergeSort(vector, izquierda, medio);
            mergeSort(vector, medio + 1, derecha);

            merge(vector, izquierda, medio, derecha);
        }
    }

    public static void merge(int[] vector, int izquierda, int medio, int derecha) {
        int[] aux = new int[vector.length];

        for (int i = izquierda; i <= derecha; i++) {
            aux[i] = vector[i];
        }

        int i = izquierda;
        int j = medio + 1;
        int k = izquierda;

        while (i <= medio && j <= derecha) {
            if (aux[i] <= aux[j]) {
                vector[k] = aux[i];
                i++;
            } else {
                vector[k] = aux[j];
                j++;
            }
            k++;
        }

        while (i <= medio) {
            vector[k] = aux[i];
            i++;
            k++;
        }
    }

    public static void main(String[] args) {

        int[] vector = new int[10];
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

        mergeSort(vector, 0, vector.length - 1);

        System.out.println("Vector ordenado:");
        for (int num : vector) {
            System.out.print(num + " ");
        }

        System.out.println();

        if (contPos > 0) {
            System.out.println("Media de positivos: " + (double) sumaPos / contPos);
        } else {
            System.out.println("No hay positivos");
        }

        if (contNeg > 0) {
            System.out.println("Media de negativos: " + (double) sumaNeg / contNeg);
        } else {
            System.out.println("No hay negativos");
        }

        teclado.close();
    }
}*/
        //Ejercicio 2 
        /**public static void mergeSort(int[] vector, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int medio = (izquierda + derecha) / 2;

            mergeSort(vector, izquierda, medio);
            mergeSort(vector, medio + 1, derecha);

            merge(vector, izquierda, medio, derecha);
        }
    }

    public static void merge(int[] vector, int izquierda, int medio, int derecha) {
        int[] aux = new int[vector.length];

        for (int i = izquierda; i <= derecha; i++) {
            aux[i] = vector[i];
        }

        int i = izquierda;
        int j = medio + 1;
        int k = izquierda;

        while (i <= medio && j <= derecha) {
            if (aux[i] <= aux[j]) {
                vector[k] = aux[i];
                i++;
            } else {
                vector[k] = aux[j];
                j++;
            }
            k++;
        }

        while (i <= medio) {
            vector[k] = aux[i];
            i++;
            k++;
        }
    }

    public static void main(String[] args) {

        int[] vector = new int[10];
        Scanner teclado = new Scanner(System.in);

        int suma = 0;
        int contador = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número: ");
            vector[i] = teclado.nextInt();
        }

        mergeSort(vector, 0, vector.length - 1);

        System.out.println("Vector ordenado:");
        for (int num : vector) {
            System.out.print(num + " ");
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                suma += vector[i];
                contador++;
            }
        }

        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("Media de posiciones pares: " + media);
        }

        teclado.close();
    }
}*/
         //Ejercicio 3 

    public static void mergeSort(double[] vector, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int medio = (izquierda + derecha) / 2;

            mergeSort(vector, izquierda, medio);
            mergeSort(vector, medio + 1, derecha);

            merge(vector, izquierda, medio, derecha);
        }
    }

    public static void merge(double[] vector, int izquierda, int medio, int derecha) {
        double[] aux = new double[vector.length];

        for (int i = izquierda; i <= derecha; i++) {
            aux[i] = vector[i];
        }

        int i = izquierda;
        int j = medio + 1;
        int k = izquierda;

        while (i <= medio && j <= derecha) {
            if (aux[i] <= aux[j]) {
                vector[k] = aux[i];
                i++;
            } else {
                vector[k] = aux[j];
                j++;
            }
            k++;
        }

        while (i <= medio) {
            vector[k] = aux[i];
            i++;
            k++;
        }
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

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

        mergeSort(notas, 0, notas.length - 1);

        System.out.println("Notas ordenadas:");
        for (double nota : notas) {
            System.out.print(nota + " ");
        }

        System.out.println();
        System.out.println("Nota media: " + media);

        System.out.println("Alumnos con nota superior a la media:");

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                System.out.println(notas[i]);
            }
        }

        teclado.close();
    }
}





























        
        
        
        

    

        
        
        
    
    

