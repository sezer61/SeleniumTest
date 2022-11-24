package org.example;

import java.util.HashMap;
import java.util.Map;

public class MapDepo {
    public static Map<Integer,String>ornekMapOlustur(){
        Map<Integer,String> ogrencci=new HashMap<>();
        ogrencci.put(101,"Ali-can-10-h-mf");
        ogrencci.put(102,"veli-vem-11-m-soz");
        ogrencci.put(103,"can-ds-cxdd-xsa-c");
        ogrencci.put(104,"ayse-ds-c34d-xsa-c");
        ogrencci.put(105,"yuya-rs-cwds-x-c");
        ogrencci.put(106,"ysxa-gs-cxds-xxc-c");
        return ogrencci;
    }

    public static String isimyaz(Map<Integer, String> ogrencci, int ogrenciKey) {

        String ogrencivalue=ogrencci.get(ogrenciKey);

        String[] valueArr=ogrencivalue.split("-");

        String isimsoy=valueArr[0] +" "+valueArr[1];
        return isimsoy;
    }

    public static Map<Integer, String> ogrenciye(Map<Integer, String> ogrencimap, int ogrencik,String yeniSuve) {
        if (ogrencimap.containsKey(ogrencik)) {
            String istenenkey = ogrencimap.get(ogrencik);
            String[] istenn = istenenkey.split("-");

            istenn[3] = yeniSuve;
            String istenenq = istenn[0] + "-" +
                    istenn[1] + "-" +
                    istenn[2] + "-" +
                    istenn[3] + "-" +
                    istenn[4];
                    ogrencimap.put(ogrencik, istenenq);


        }
        return ogrencimap;
    }
}
