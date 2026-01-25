package com.wjavacorecoding;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastvsFailSafe {

    public static void main(String[] args) {

        Map<String, String> cityCode
                = new HashMap<String, String>();

        cityCode.put("Mumbai", "Maharashtra");
        cityCode.put("Hydrabad", "Andra pradesh");
        cityCode.put("Surat", "Gujrat");
        cityCode.put("Chennai", "Tamil nadu");
        cityCode.put("Banglore", "Karnataka");

        Iterator iterator = cityCode.keySet().iterator();

        while (iterator.hasNext()) {
            System.out.println(cityCode.get(iterator.next()));

            cityCode.put("Madras", "Keral");

        }
    }

}
