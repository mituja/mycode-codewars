package com.codewars.helpbookseller;

import java.util.HashMap;
import java.util.Map;

public class StockList {

    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {

        Map<Character, Integer> map = groupListsAndPutToMap(lstOfArt);
        String result = buildResultString(map, lstOf1stLetter);

        return result;
    }

    public static Map groupListsAndPutToMap(String[] lstOfArt) {
        Character category;
        Integer amount;
        Map<Character, Integer> map = new HashMap();
        for (int i = 0; i < lstOfArt.length; i++) {
            category = lstOfArt[i].charAt(0);
            amount = Integer.parseInt(lstOfArt[i].replaceAll("[^\\d.]", ""));

            if (map.containsKey(category)) {
                Integer oldAmount = (Integer) map.get(category);
                map.put(category, (oldAmount + amount));
            } else {
                map.put(category, amount);
            }
        }
        return map;
    }

    public static String buildResultString(Map<Character, Integer> map, String[] lstOf1stLetter) {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            for (int i = 0; i < lstOf1stLetter.length; i++) {
                if (lstOf1stLetter[i].equals(String.valueOf(m.getKey()))) {
                    result.append("(" + m.getKey() + " : " + m.getValue() + ")");
                    if (i < lstOf1stLetter.length - 1) {
                        result.append(" - ");
                    }
                }
            }
        }
        return String.valueOf(result);
    }
}
