package com.seyma;

import java.util.Scanner;

public class alistirma12 {
    public static void main(String[] args) {
        /**
         *Kullanıcıdan bir sayı alın ve bu sayının faktöriyelini hesaplayın.
         *
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı giriniz.....:");
        int sayi = sc.nextInt();
        int faktoriyel=1;

        for (int i=1 ;i<=sayi ;i++) {

            faktoriyel*=i; //????
        }

        System.out.println("Faköriyel...:" +faktoriyel);





    }
}
