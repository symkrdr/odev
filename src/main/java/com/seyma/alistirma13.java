package com.seyma;

import java.util.Scanner;

public class alistirma13 {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan bir sayı alın ve
         * bu sayının asal olup olmadığını kontrol eden bir program yazın.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int n = sc.nextInt();
        boolean asal=false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                asal=true;
                break;
            }if (!asal) {
                System.out.println("Asal değil.."+i);

            }

        }

        }

    }

