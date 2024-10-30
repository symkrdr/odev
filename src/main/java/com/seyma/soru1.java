package com.seyma;

import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {
        /**
         * 1-	Bir kişinin öğrencilik süresini alıp hangi okul döneminde olduğunu söyleyen kodu yazınız.
         * <5.   “Elemantary School”
         * 5<= gradle <8  ”Junior School”
         * 8<= gradle <10 “High School”
         * >=10   “College”
         * <0  “NONE”
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Kaç yıldır öğrencisizniz...:");
        int ogr = sc.nextInt();
        if(ogr <0){
            System.out.println("none");
        }
        else if(ogr>=0 && ogr<5){
            System.out.println("Elemantary School");}
        else if(ogr>=5 && ogr<8){
            System.out.println("Junior School");}
        else if(ogr>=8 && ogr<10){
            System.out.println("High School");}
        else if(ogr>=10){
            System.out.println("Collage");


        }

    }
}
