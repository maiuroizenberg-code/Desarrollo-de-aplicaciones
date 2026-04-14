package javaapplication39kmc;
class Recurso {
    String nombre;

    Recurso(String nombre) {
        this.nombre = nombre;
    }
}

class HiloDeadlock extends Thread {
    private Recurso r1;
    private Recurso r2;

    HiloDeadlock(String nombre, Recurso r1, Recurso r2) {
        super(nombre);
        this.r1 = r1;
        this.r2 = r2;
    }

    public void run() {
        synchronized (r1) {
            System.out.println(getName() + " bloqueó " + r1.nombre);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {}

            System.out.println(getName() + " espera " + r2.nombre);

            synchronized (r2) {
                System.out.println(getName() + " bloqueó " + r2.nombre);
            }
        }
    }
}
class HiloSeguro extends Thread {
    private Recurso r1;
    private Recurso r2;

    HiloSeguro(String nombre, Recurso r1, Recurso r2) {
        super(nombre);
        this.r1 = r1;
        this.r2 = r2;
    }

    public void run() {
        Recurso primero = r1.nombre.compareTo(r2.nombre) < 0 ? r1 : r2;
        Recurso segundo = r1.nombre.compareTo(r2.nombre) < 0 ? r2 : r1;

        synchronized (primero) {
            System.out.println(getName() + " bloqueó " + primero.nombre);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {}

            synchronized (segundo) {
                System.out.println(getName() + " bloqueó " + segundo.nombre);
                System.out.println(getName() + " terminó sin deadlock");
            }
        }
    }
}
public class JavaApplication39KMC {
    public static void main(String[] args){
 Recurso recursoA = new Recurso("RecursoA");
        Recurso recursoB = new Recurso("RecursoB");

        System.out.println("=== PROVOCANDO DEADLOCK ===");

        Thread t1 = new HiloDeadlock("Hilo-1", recursoA, recursoB);
        Thread t2 = new HiloDeadlock("Hilo-2", recursoB, recursoA);

        t1.start();
        t2.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}

        System.out.println("\n⚠ Los hilos quedaron bloqueados (deadlock).\n");

        System.out.println("=== SOLUCIÓN: EVITANDO DEADLOCK ===");

        Recurso recursoC = new Recurso("RecursoA");
        Recurso recursoD = new Recurso("RecursoB");

        Thread t3 = new HiloSeguro("Hilo-3", recursoC, recursoD);
        Thread t4 = new HiloSeguro("Hilo-4", recursoD, recursoC);

        t3.start();
        t4.start();
    }
}
