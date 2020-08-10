package com.javarush.task.task08.task0818;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
Только для богачей
*/


public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<String, Integer>();        {
            map.put("Murphy", 599);
            map.put("Sokalsky", 1599);
            map.put("Kovalovic", 434);
            map.put("Shannon", 132);
            map.put("Readdy", 9487);
            map.put("Darren", 732);
            map.put("Governess", 354);
            map.put("Egorcev", 400);
            map.put("Bush", 1932);
            map.put("Washington", 243);
        }
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> copy = new HashMap<String, Integer>(map);
        for (HashMap.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue() < 500)
                map.remove(pair.getKey());
        }
    }


    public static void main(String[] args)
    {
    }

    /*

    public static void main(String[] args)

    {
        Map<String, Integer> map1 = createMap();

        removeItemFromMap(map1);

        System.out.println(Arrays.asList(map1));

        //System.out.println(Collections.singletonList())

    }

    */
}
