package com.seyma;

import java.util.Scanner;
import java.util.SortedMap;
import java.util.function.DoubleUnaryOperator;

public class soru4 {
    public static void main(String[] args) {
        /**
         *4-	Kullanıcıdan 0-100 arası bir sayı girmesini isteyeceksiniz.
         * Bu sayılar dışında bir değer girer ise girilen sayı sınır dışında bir sayıdır uyarısı vereceksiniz.
         * Temel kural olarak Kullanıcının girdiği geçerli sayıların toplamı 100 ü geçtiğinde sayı istemeyi durduracaksınız.
         * Kullanıcıdan alınan sayıların en büyük olanı, en küçük olanı ve ortalamasını hesaplayan kodu yazınız.
         * Örn:
         * Sayı gir…: 5
         * Sayı gir…: 12
         * Sayı gir…: 55
         * Sayı gir…: 43
         * Max: 55
         * Min: 5
         * Ort: 28.75
         *
         * Örn:
         * Sayı gir…: 95
         * Sayı gir…: 105
         * Girilen sayı aralık dışı
         * Sayı gir…: 1
         * Sayı gir…: 5
         * Max: 95
         * Min: 1
         * Ort: 33,666666666664
         *
         */


        int sayilar[] = new int[1];
        Scanner sc = new Scanner(System.in);
        int sayi;
        int toplam = 0;
        int enk = sayilar[0];


        do {
            if (toplam < 100)
                for (int i = 1; i < 100; i++) {
                    System.out.println("Bir sayıyı girin...:");
                    sayi = sc.nextInt();
                    toplam += sayi;
                    if (sayi < 0 || sayi > 100) {
                        System.out.println("Sayınız referans dışı");
                    }else if (toplam>100 ) {
                        System.out.println("Toplam"+toplam);
                        System.out.println("Ortalama"+toplam/i);


                    }
                }

        }while (toplam < 100);
        }


    }

    //enk > sayilar[0];
//  sayilar[0] = enk;
//   ystem.out.println("Enk"+enk);


