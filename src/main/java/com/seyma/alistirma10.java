package com.seyma;

import java.util.Scanner;

public class alistirma10 {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan bir ay ismi alın ve o ayın kaç gün
         * çektiğini ekrana yazdıran bir program yazın (şubat için 28 varsayılabilir).
         */
        System.out.println("""
                *****AYLAR *****
                1-Ocak
                2-Şubat
                3-Mart
                4-Nisan
                5-Mayıs
                6-Haziran
                7-Temmuz
                8-Ağustos
                9-Eylül
                10-Ekim
                11-Kasım
                12-Aralık""");

        System.out.println("Bir ay seçiniz....:");
        int ay= new Scanner(System.in).nextInt();
        String gun= "";
        gun =switch(ay){
            case 1,3,5,7,8,10,12 ->"Bu ay 31 gündür.";
            case 4,6,9,11 -> "Bu ay 30 gündür.";
            case 2 -> "Bu ay 28 gündür.";
            default -> " ";
        };
        System.out.println(ay+".Ay ."+gun);






    }
}
