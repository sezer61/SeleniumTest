package org.example;

import java.util.Map;

public class maps {
    public static void main(String[] args) {
        Map<Integer,String>ogrencimap=MapDepo.ornekMapOlustur();

        ogrencimap.put(105,"Hasan-Can-11-K-MF");
        ogrencimap.put(108,"Hikmet-Wab-12-W-MK");
        System.out.println(ogrencimap);
        /*
        101=Ali-can-10-h-mf,
        102=veli-vem-11-m-soz,
        103=can-ds-cxdd-xsa-c,
        104=ayse-ds-c34d-xsa-c,
        105=Hasan-Can-11-K-MF,
        106=ysxa-gs-cxds-xxc-c,
        108=Hikmet-Wab-12-W-MK
         */
        System.out.println(MapDepo.isimyaz(ogrencimap,108));
        int ogrencik=105;
        String yeniSu="N";
        ogrencimap=MapDepo.ogrenciye(ogrencimap,ogrencik,yeniSu);
    }
}
