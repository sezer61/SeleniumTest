package org.example;

import java.util.Map;

public class map_s {
    public static void main(String[] args) {
        Map<Integer,String> OgrenciMap=MapDepo.ornekMapOlustur();

        System.out.println(OgrenciMap);

        OgrenciMap.put(110,"Fatih-Yan-10-T-MFC");

        OgrenciMap.put(102,"Veli-Dem-12-D-Soz");
        System.out.println(OgrenciMap);

        System.out.println(MapDepo.isimyaz(OgrenciMap, 103));
        OgrenciMap=MapDepo.ogrenciye(OgrenciMap,105,"T");
        System.out.println(OgrenciMap);

    }
}
