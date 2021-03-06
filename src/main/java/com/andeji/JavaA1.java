package com.andeji;

import java.util.*;

public class JavaA1 {
    public void a1() {
        String str = "This is a book. That is a pencil.This is good, and that is bad.";

        String a = str.replaceAll("[\\W]", " ");
        String a2 = a.replaceAll("  ", " ");

        a2 = a2.toLowerCase();

        String[] xx = a2.split(" ");


        HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
        for (int i = 0; i < xx.length; i++) {
            xx[i] = xx[i].toUpperCase().charAt(0) + xx[i].substring(1);
            if (hashmap.containsKey(xx[i])) {
                Integer num = (Integer) hashmap.get(xx[i]);
                num++;
                hashmap.put(xx[i], num);
            } else {
                hashmap.put(xx[i], 1);
            }
        }


        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(hashmap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(list.size() - i - 1).getKey() + ":" + list.get(list.size() - i - 1).getValue() + "次");
        }
    }
}
