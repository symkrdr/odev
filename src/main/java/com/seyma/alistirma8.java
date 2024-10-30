package com.seyma;

import java.util.Scanner;

public class alistirma8 {
    public static void main(String[] args) {
        /**
         *Kullanıcıdan doğum yılını alın ve 18 yaşından büyük olup olmadığını kontrol edin.
         *  Büyükse "Reşit", değilse "Reşit değil" yazdırın.
         *
         */

        System.out.println("Yaşınızı giriniz...:");
        int age =new Scanner(System.in).nextInt();
        if (age >=18){
            System.out.println("Reşitsiniz..");
        }else{
            System.out.println("Reşit değilsiniz..");
        }


    }
}
