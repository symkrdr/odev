package com.seyma;

import java.util.Scanner;

public class alistirma19 {
    public static void main(String[] args) {

        /**
         * Kullanıcıdan bir dizi alın ve dizide tekrar eden elemanları bulun.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Dizi boyutu...:");
        int boyut = sc.nextInt();

        int sayilar [] =new int[boyut];

        System.out.println("Sayıları giriniz....:");
        for(int i =0 ; i<sayilar.length ;i++) {
            System.out.println((i + 1) + ".sayıyı girin...:");
            int sayi = sc.nextInt();
        }











    }



}
