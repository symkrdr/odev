package com.seyma;

import java.util.Scanner;

public class alistirma4 {
    public static void main(String[] args) {
        /**
         * Problem: Kullanıcıdan bir cümle alın ve cümlenin
         * karakter sayısını ekrana yazdıran bir program yazın.
         */

        System.out.println("Bir cümle yazınız....:");
        String cumle= new Scanner(System.in).nextLine();

        int cumleninuzunlugu = cumle.length();

        System.out.println("Karakter sayisi...:"+cumleninuzunlugu);








    }
}
