package com.seyma;

import java.util.Scanner;

public class alistirma6 {
    public static void main(String[] args) {
        /**
         * Problem: Kullanıcıdan bir tamsayı alın ve
         * bu sayının çift mi, tek mi olduğunu belirleyin.
         */

        System.out.println("Bir tam sayı giriniz..:");
        int sayi=new Scanner(System.in).nextInt();
        if(sayi%2==0){
            System.out.println("Sayiniz çift sayi.."+sayi);

        }else if(sayi%2==1){
            System.out.println("Sayınız tek sayı..:"+sayi);
        }



    }
}
