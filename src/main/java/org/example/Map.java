package org.example;

public class Map {
    public static void main(String[] args) {
        java.util.Map<Integer,String> ogrenci = MapDepo.ornekMapOlustur();
        System.out.println(ogrenci);
        System.out.println(ogrenci.get(105));


        int ogrenciKey=106;

        String isimSoy=MapDepo.isimyaz(ogrenci,ogrenciKey);
        System.out.println(ogrenciKey+ " nolu ogrenci isim ve soyisim: " + isimSoy);
    }
}
