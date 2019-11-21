package com.java.igor;

public class Main {
    public static void main(String[] args) {
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
        //test for negative value
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
        //normal mode
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
    }
}
