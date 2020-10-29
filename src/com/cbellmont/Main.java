package com.cbellmont;

public class Main {

    public static void main(String[] args) {
        final int maxNumThread = 10;

        for (int i = 0; i < maxNumThread; i++){
            ThreadEscritor t = new ThreadEscritor();
            t.setName("Hilo " + i);
            t.start();
        }

    }


    public synchronized static void escribiendoEnDb(String nombreHilo){
        try {
            System.out.println("El hilo : " + nombreHilo + " está escribiendo en la base de datos");
            Thread.sleep(1000);
            System.out.println("El hilo : " + nombreHilo + " ha terminado de escribir en la base de datos");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
