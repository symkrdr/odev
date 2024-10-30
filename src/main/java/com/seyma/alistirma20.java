package com.seyma;

public class alistirma20 {
    public static void main(String[] args) {

        /**
         * 10 elemanlı bir dizide yalnızca çift sayıları ekrana yazdıran bir program yazın.
         */


        int sayilar[] = {3, 8, 64, 23, 34, 32, 64, 59, 65, 77, 88};
        for (int i = 0; i < sayilar.length; i++) {

            if (sayilar[i] % 2 == 0) {
                System.out.println("Çift sayılar....:" +sayilar[i]);
            }

        }





    }
}
