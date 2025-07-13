package org.example;

public class Main {

    public static void main(String[] args) throws Exception {

        BonusSystem client = new BonusSystem();

        Thread t = new Thread(client);
        t.start();
    }
}
