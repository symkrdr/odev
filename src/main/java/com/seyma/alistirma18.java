package com.seyma;

public class alistirma18 {
    public static void main(String[] args) {
        /**
         * Bir dizi oluşturun ve
         * dizideki elemanları küçükten büyüğe sıralayan bir program yazın
         */

        int sayilar[] = {3, 5, 64, 23, 59, 65, 77, 88,};
        int enk = sayilar[0];
        for (int i = 0; i < sayilar.length; i++) {
            if (enk > sayilar[i])
                enk = sayilar[i];
        }

        System.out.println("En küçük sayı...:" + enk);


    }
    }

