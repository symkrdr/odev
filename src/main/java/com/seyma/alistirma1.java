package com.seyma;

import java.util.Scanner;

public class alistirma1 {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan iki tamsayı alın ve bu sayıların toplamını,
         * farkını, çarpımını ve bölümünü ekrana yazdıran bir program yazın.
         */


        int sayi1, sayi2,toplam,fark,carpim,bolum;
        Scanner input = new Scanner(System.in);

        System.out.print("1.SAYIYI GİRİNİZ....:");
        sayi1 = input.nextInt();
        System.out.print("2.SAYIYI GİRİNİZ.....:");
        sayi2 = input.nextInt();
        toplam = sayi1 + sayi2;
        fark = sayi1 - sayi2;
        bolum = sayi1 * sayi2;
        carpim = sayi1 / sayi2;
        System.out.println("Toplam.... :" + toplam);
        System.out.println("Fark.... :" + fark);
        System.out.println("Carpim... :" + carpim);
        System.out.println("Bolum ...:" + bolum);





    }
}
