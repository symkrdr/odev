package com.seyma;

import java.util.Scanner;

public class alistirma3 {
    public static void main(String[] args) {
        /**
         *Problem: Kullanıcıdan yarıçapı alınan bir dairenin
         * alanını ve çevresini hesaplayan bir program yazın (alan = π * r^2, çevre = 2 * π * r).
         *
         */


        System.out.println("Dairenin yarı çapını giriniz...:");
        int r = new Scanner(System.in).nextInt();

        double alan = (3.14*(r*r));
        System.out.println("Alan...:"+alan);

        double cevre = (2*3.14*r);
        System.out.println("Çevre...:"+cevre);







    }
}
