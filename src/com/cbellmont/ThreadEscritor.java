package com.cbellmont;

public class ThreadEscritor extends Thread {

    @Override
    public void run() {
        Main.escribiendoEnDb(getName());
    }
}
