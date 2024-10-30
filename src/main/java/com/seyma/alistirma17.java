package com.seyma;

public class alistirma17 {
    public static void main(String[] args) {
        /**
         * Bir dizideki en küçük elemanı ve
         * indeksini bulan bir program yazın.
         */


        int [] sayilar ={32,3,2,4,43,56,87,1,78};
        int enk=sayilar[0];
        for (int i=0;i<sayilar.length;i++){
                if(enk>sayilar[i])
                 enk=sayilar[i];
        }

        System.out.println("En küçük sayı...:" + enk);












    }
}
