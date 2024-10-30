package com.seyma;

import java.util.Scanner;

public class alistirma7 {
    public static void main(String[] args) {
        /**
         * Bir öğrencinin notunu (0-100 arası)
         * kullanıcıdan alın ve 50’den büyükse “Geçti”, küçükse “Kaldı” şeklinde sonuç yazdırın.
         */

        System.out.println("Notunuzu giriniz...:(0-100 arası)");
        int not =new Scanner(System.in).nextInt();
         if (not>=50){
            System.out.println("geçti");
        }else{
            System.out.println("kaldı");}








    }
}
