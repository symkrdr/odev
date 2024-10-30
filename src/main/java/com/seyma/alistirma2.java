package com.seyma;

import java.util.Scanner;
import java.util.SortedMap;

public class alistirma2 {
    public static void main(String[] args) {

        /**
         * Bir öğrencinin sınav notlarını (vize ve final) kullanıcıdan alın,
         * vize %40, final %60 etkili olacak şekilde ortalamayı hesaplayın.
         *
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Vize notunuz...:");
        int vsinav= sc.nextInt();
        System.out.println("Final notunuz....");
        int fsinav= sc.nextInt();

        int ortalama;
        ortalama= (vsinav*40)/100 + (fsinav*60)/100;
        System.out.println("ORTALAMANIZ..."+ortalama);








    }
}
