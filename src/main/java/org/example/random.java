package org.example;

import java.util.Random;
import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        System.out.println("Hoşgeldiniz");
        Random r=new Random();
        int num=r.nextInt(100);
        int bul=num;
        System.out.println(num);

        Scanner agac=new Scanner(System.in);
        int coun=1;
        num=1;
        do {
            if (coun == 1) {
                System.out.println("Tahmin et");
            } else if (bul > num) System.out.println("Daha buyuk sayi gir");
            else System.out.println("Daha kucuk");
            num= agac.nextInt();
            if  (num==bul) {
                System.out.println("Doğro Tahmin! " + coun + ". tahminde bulundun");
            }else System.out.println("Yanlıs tahmin Denemeye devam..");


                coun++;
            }while (num!=bul);


        }
    }

