package com.seyma;

import java.util.Scanner;

public class alistirma9 {
    public static void main(String[] args) {
        /**
         *
         *: Kullanıcıdan üç sayı alın ve en büyüğünü ekrana yazdırın.
         */

        int s1,s2,s3,eb;
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Sayıyı giriniz...:");
        s1 = sc.nextInt();

        System.out.println("2.Sayıyı giriniz...:");
        s2 = sc.nextInt();

        System.out.println("3.Sayıyı giriniz...:");
        s3 = sc.nextInt();

        eb=s1;

        if(s1<s2){
            eb=s2;
        }else if(s2<s3){
            eb=s3;

        }
        System.out.println("En büyük sayı"+eb);



    }
}

