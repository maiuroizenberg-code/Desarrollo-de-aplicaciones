/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maia.roiz.act.pkg9;

/**
 *
 * @author ET20
 */
//public class MaiaRoizAct9 {

    /**
     * @param args the command line arguments
     */
    //public static void main(String[] args) {
       /**Ejercicio 1

import java.util.Scanner;
    private String nombreCliente;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;

 
    public MaiaRoizAct9() {
    }

  
    public MaiaRoizAct9(String nombreCliente, String numeroCuenta, double tipoInteres, double saldo) {
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            this.saldo = 0;
        }
    }

  ¿
    public MaiaRoizAct9(MaiaRoizAct9 otraCuenta) {
        this.nombreCliente = otraCuenta.nombreCliente;
        this.numeroCuenta = otraCuenta.numeroCuenta;
        this.tipoInteres = otraCuenta.tipoInteres;
        this.saldo = otraCuenta.saldo;
    }


    public String getNombre() {
        return nombreCliente;
    }

    public void setNombre(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }

 
    public boolean ingreso(double cantidad) {
        if (cantidad >= 0) {
            this.saldo += cantidad;
            return true;
        }
        return false;
    }

  
    public boolean reintegro(double cantidad) {
        if (cantidad >= 0 && this.saldo >= cantidad) {
            this.saldo -= cantidad;
            return true;
        }
        return false;
    }


    public boolean transferencia(ActividadN8LeandroGonzalezClases cuentaDestino, double importe) {
        if (importe >= 0 && this.saldo >= importe) {
            this.reintegro(importe);
            cuentaDestino.ingreso(importe);
            return true;
        }
        return false;
    }

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, numero;
        double tipo, importe;

     
        MaiaRoizAct9 cuenta1 = new MaiaRoizAct9();
        
        System.out.print("Nombre : ");
        nombre = sc.nextLine();
        System.out.print("Número de cuenta : ");
        numero = sc.nextLine();
        System.out.print("Tipo de interes : ");
        tipo = sc.nextDouble();
        System.out.print("Saldo: ");
        importe = sc.nextDouble();

        
        cuenta1.setNombre(nombre);
        cuenta1.setNumeroCuenta(numero);
        cuenta1.setTipoInteres(tipo);
        cuenta1.setSaldo(importe);

       
        MaiaRoizAct9 cuenta2 = new MaiaRoizAct9("Maria Lujan", "123456789", 1.60, 200);
        
       
        MaiaRoizAct9 cuenta3 = new MaiaRoizAct9(cuenta1);

        
        System.out.println("\nDatos de la cuenta 1");
        System.out.println("Nombre del titular: " + cuenta1.getNombre());
        System.out.println("Número de cuenta: " + cuenta1.getNumeroCuenta());
        System.out.println("Tipo de interés: " + cuenta1.getTipoInteres());
        System.out.println("Saldo: " + cuenta1.getSaldo());
        System.out.println();

        cuenta1.ingreso(4000);
        System.out.println("Saldo de cuenta 1 despues del ingreso: " + cuenta1.getSaldo());

        System.out.println("Datos de la cuenta 2");
        System.out.println("Nombre del titular: " + cuenta2.getNombre());
        System.out.println("Número de cuenta: " + cuenta2.getNumeroCuenta());
        System.out.println("Tipo de interés: " + cuenta2.getTipoInteres());
        System.out.println("Saldo: " + cuenta2.getSaldo());
        System.out.println();

        System.out.println("Datos de la cuenta 3");
        System.out.println("Nombre del titular: " + cuenta3.getNombre());
        System.out.println("Número de cuenta: " + cuenta3.getNumeroCuenta());
        System.out.println("Tipo de interés: " + cuenta3.getTipoInteres());
        System.out.println("Saldo: " + cuenta3.getSaldo());
        System.out.println();

       
        cuenta3.transferencia(cuenta2, 10);

        System.out.println("Saldo de la cuenta 2");
        System.out.println("Saldo: " + cuenta2.getSaldo());
        System.out.println();

        System.out.println("Saldo de la cuenta 3");
        System.out.println("Saldo: " + cuenta3.getSaldo());
        System.out.println();
        
        sc.close();
    }

}
*/

/** Ejercicio 2
public class Contador {
    private int cont;


    public Contador() {
    }

*
    public Contador(int cont) {
        if (cont < 0) {
            this.cont = 0;
        } else {
            this.cont = cont;
        }
    }

 
    public Contador(Contador otroContador) {
        this.cont = otroContador.cont;
    }


    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        if (cont < 0) {
            this.cont = 0;
        } else {
            this.cont = cont;
        }
    }


    public void incrementar() {
        this.cont++;
    }


    public void decrementar() {
        this.cont--;
        if (this.cont < 0) {
            this.cont = 0;
        }
    }


    public static void main(String[] args) {
        System.out.println("--- PRUEBA CONTADOR ---");
        Contador c1 = new Contador(-3); 
        System.out.println("Valor inicial c1 (enviado -3): " + c1.getCont());

        Contador c2 = new Contador(2);
        System.out.println("Valor inicial c2 (enviado 2): " + c2.getCont());
        
        c2.incrementar();
        System.out.println("c2 tras incrementar: " + c2.getCont());

        c2.decrementar();
        c2.decrementar();
        c2.decrementar();
        c2.decrementar();
        System.out.println("c2 tras decrementar en exceso: " + c2.getCont());
    }
}
*/


/** Ejercicio 3
public class Libro {
    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;

 
    public Libro() {
    }

   
    public Libro(String titulo, String autor, int ejemplares, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }

 
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }

  
    public boolean prestamo() {
        if (this.prestados < this.ejemplares) {
            this.prestados++;
            return true;
        }
        return false;
    }

   
    public boolean devolucion() {
        if (this.prestados > 0) {
            this.prestados--;
            return true;
        }
        return false;
    }

   
    @Override
    public String toString() {
        return "Libro: " + titulo + " | Autor: " + autor 
                + " | Ejemplares totales: " + ejemplares 
                + " | Prestados: " + prestados;
    }

   
    public static void main(String[] args) {
        System.out.println("--- PRUEBA LIBRO ---");
        Libro libro1 = new Libro("El principito", " Antoine de Saint-Exupéry ", 2, 0);
        System.out.println(libro1);

        System.out.println("Prestamo 1 realizado: " + libro1.prestamo());
        System.out.println("Prestamo 2 realizado: " + libro1.prestamo());
        System.out.println("Prestamo 3 realizado: " + libro1.prestamo()); 
        
        System.out.println(libro1);

        System.out.println("Devolucion realizada: " + libro1.devolucion());
        System.out.println(libro1);
    }
}

*/

   