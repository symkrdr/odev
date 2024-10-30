package com.seyma;

import java.util.Scanner;

public class alistirma14 {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan bir sayı alın ve
         * bu sayıya kadar olan çift sayıları ekrana yazdıran bir program yazın.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı giriniz....:");
        int sayi = sc.nextInt();

        for (int i = 0; i < sayi; i++) {
            if (i % 2 == 0) {
                System.out.println("Çİft sayı:"+i);
            }

        }




    }
}
