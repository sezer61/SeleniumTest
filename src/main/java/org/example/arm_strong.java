package org.example;

import java.util.Scanner;

public class arm_strong {
    public static void main(String[] args) {

        Scanner agac = new Scanner(System.in);
        int bas = 0, rakam;
        int toplam = 0;

        System.out.print("Bir sayi giriniz: ");
        int sayi = agac.nextInt();
        int sa = sayi;
        int sa11 = sayi;

        while(sa > 0) {
            sa /= 10;
            bas++;
        }
        while(sayi > 0) {
            rakam = sayi % 10;
            toplam += Math.pow(rakam, bas);
            sayi /= 10;
        }
        if(toplam == sa11) {
            System.out.println(sa11 + " sayisi armstrong bir sayidir.");
        }
        else {
            System.out.println(sa11 + " sayisi armstrong bir sayi degildir.");
        }
    }
}
