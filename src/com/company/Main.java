package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static boolean isRunning = true;
    public static void main(String[] args) {
        run();
    }

    private static void run() {
        while(isRunning) {
            System.out.println("Výběr:");
            System.out.println("1. Dec-Bin");
            System.out.println("2. Bin-Dec");
            System.out.println("3. Dec-Hex");
            System.out.println("4. Hex-Dec");
            System.out.println("5. Exit");
            switch (Integer.parseInt(sc.nextLine())) {
                case 1 -> convertDecToBin();
                case 2 -> convertBinToDec();
                case 3 -> convertDecToHex();
                case 4 -> convertHexToDec();
                case 5 -> {
                    isRunning = false;
                    System.out.println("Program se ukončuje");
                }
            }
        }
    }

    private static void convertDecToBin() {
        System.out.println("Zadejte cislo v DEC");
        System.out.println(Integer.toBinaryString(Integer.parseInt(sc.nextLine())));
    }

    private static void convertBinToDec() {
        System.out.println("Zadejte cislo v BIN");
        System.out.println(Integer.parseInt(sc.nextLine(),2));
    }

    private static void convertDecToHex() {
        System.out.println("Zadejte cislo v DEC");
        System.out.println(Integer.toHexString(Integer.parseInt(sc.nextLine())));
    }

    private static void convertHexToDec() {
        System.out.println("Zadejte cislo v HEX");
        System.out.println(Integer.parseInt(sc.nextLine(),16));
    }

}
