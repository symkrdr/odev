package com.seyma;

import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
        /**
         *2-	Bir yolculuk için toplam maliyeti hesaplayan kodu yazınız. Kurallar;
         * -	L: LPG için H: Hibrit için kullanılacaktır.
         * -	Arabanın yaşı ve yolculuğun  KM si için 2 tam sayı değeri alın
         * -	Kullanıcı L veya H girmez ise hata verin
         * -	Toplam maliyet motor tipine göre hesaplanacaktır
         * -	LPG 100km de 3.3lt
         * -	HIBRIT 100km de 4.2lt
         * -	LPG yakıtı 1.6₺  1 litre için
         * -	Aracın yaşı 7 den küçük ve eşit ise toplam maliyeti yazdırmanız yeterli
         * -	Arabanın yaşı 7 den fazla ve 12 ye eşit ve küçük ise maliyet %3 arttırılmalı
         * -	Arabanın yaşı 12 de n büyük ise toplam maliyet %7 arttırılmalıdır.
         *
         */



        String arac;
        System.out.println("Aracı LPG - HİBRİT(L/H)");
        arac = new Scanner(System.in).nextLine();
        int yas,km;
        System.out.println("Aracınızın yaşı...:");
        yas= new Scanner(System.in).nextInt();
        System.out.println("Aracınızın km...:");
        km= new Scanner(System.in).nextInt();
       // 100 * km = (float)3.31;


        if(arac.equals("L")){
            if(yas<=7){
                System.out.println("MALİYET...:"+km*3.31 +"TL");
            }


        }




    }
}
