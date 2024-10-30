package com.seyma;

import java.util.Scanner;

public class soru5 {
    public static void main(String[] args) {
        /**
         *5-	Elimizde şöyle bir liste var, bu listeden şehir seçildiğinde ilgili şehirin plaka numarasını veren kodu yazınız.
         * 01-	Adana
         * 02-	Adıyaman
         * 03-	Ayfon
         * 10-	Balıkesir
         * 11-	Bilecik
         * 12-	Bingöl
         * 13-	Bitlis
         * 20- Denizli
         * Yukarıda verilen plaka kodlarını kullanacaksınız.
         * Örn:
         * Şehir adını giriniz: ADANA
         * Plaka: 01
         * Örn:
         * Şehir adını giriniz: BiTLis
         * Plaka: 13
         *
         *
         */

        System.out.println("""
                *************************************
                PLAKASINI ÖĞRENMEK İSTEDİĞİNİZ ŞEHRİ SEÇİNİZ
                ********************************************
                01-	Adana
                02-	Adıyaman
                03-	Ayfon
                10-	Balıkesir
                11-	Bilecik
                12-	Bingöl
                13-	Bitlis
                20- Denizli""");
        System.out.println("Bir şehir adı giriniz...:");
        String sehir = new Scanner(System.in).nextLine();

        switch (sehir) {
            case "ADANA": System.out.println("Plaka 01");break;
            case "ADIYAMAN": System.out.println("Plaka 02");break;
            case "AFYON": System.out.println("Plaka 03");break;
            case "BALIKESİR": System.out.println("Plaka 10");break;
            case "BİLECİK": System.out.println("Plaka 11");break;
            case "BİNGÖL": System.out.println("Plaka 12");break;
            case "BİTLİS": System.out.println("Plaka 13");break;
            case "DENİZLİ": System.out.println("Plaka 20");break;



        }








    }
}
