package com.seyma;

import java.util.Scanner;

public class alistirma16 {
    public static void main(String[] args) {
        /**
         *5 elemanlı bir dizi oluşturun,
         * kullanıcıdan elemanları alın ve bu dizinin ortalamasını hesaplayın.
         *
         */
        int sayilar [] =new int[5];
        Scanner sc = new Scanner(System.in);
        int sayi;
        int toplam=0;

        for(int i =0 ; i<5 ;i++){
            System.out.println((i+1)+".sayıyı girin...:");
            sayi = sc.nextInt();
            sayilar[i] =sayi;
            toplam += sayilar[i];

        }
        System.out.println("Ortalama...:"+toplam/5);



    }
}
