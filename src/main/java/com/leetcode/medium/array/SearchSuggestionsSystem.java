package com.leetcode.medium.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class SearchSuggestionsSystem {
    public static List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> res = new ArrayList<>();
        TreeMap<String, Integer> map = new TreeMap<>();
        Arrays.sort(products);
        List<String> productsList = Arrays.asList(products);

        for (int i = 0; i < products.length; i++) {
            map.put(products[i], i);
        }

        String key = "";
        for (char c : searchWord.toCharArray()) {
            key += c;
            String ceiling = map.ceilingKey(key);
            String floor = map.floorKey(key + "~");
            if (ceiling == null || floor == null) break;
            res.add(productsList.subList(map.get(ceiling), Math.min(map.get(ceiling) + 3, map.get(floor) + 1)));
        }

        while (res.size() < searchWord.length()) res.add(new ArrayList<>());
        return res;
    }
    public static void main(String[] arages){
      //  String[] products = {"mobile","mouse","moneypot","monitor","mousepad"};
     //   String searchWord = "mouse";
        String[] products = {"havana"};
        String searchWord = "havana";
        System.out.println(suggestedProducts(products,searchWord));

    }
}
