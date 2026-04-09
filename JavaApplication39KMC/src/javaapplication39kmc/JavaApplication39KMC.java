/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication39kmc;

import java.util.concurrent.atomic.AtomicInteger;

public class JavaApplication39KMC {

    private static AtomicInteger contador = new AtomicInteger(0);

    public static void main(String[] args)throws InterruptedException {
        Runnable tarea = () -> {
            for (int i = 0; i < 1000; i++) contador.incrementAndGet();
        };
        Thread h1 = new Thread(tarea);
        Thread h2 = new Thread(tarea);
        h1.start(); h2.start();
        h1.join(); h2.join();

        System.out.println("Resultado con Atomic: " + contador.get());
    }
}
