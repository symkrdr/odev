package com.seyma;

import java.util.Scanner;

public class alistirma5 {
    public static void main(String[] args) {
        /** Problem: Kullanıcıdan bir ürünün
        fiyatını alın ve %18 KDV eklenmiş halini ekrana yazdıran bir program yazın.
         */

        System.out.println("Ürünün fiyatını giriniz...:");
        int fiyat = new Scanner(System.in).nextInt();

        int kdv;
        kdv=(fiyat*18)/100;
        fiyat=fiyat+kdv;

        System.out.println("Kdv eklenmiş tutar...:"+fiyat);






    }
}
