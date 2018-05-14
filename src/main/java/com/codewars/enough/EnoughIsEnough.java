package com.codewars.enough;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EnoughIsEnough {

    public static int[] deleteNth(int[] elements, int maxOcurrences) {

        Map<Integer, Integer> valuesMap = new HashMap<Integer, Integer>();
        ArrayList<Integer> resultList = new ArrayList<Integer>();

        if (maxOcurrences == 0) {
            return new int[0];
        }

        //Converting an array to a map with given ocurrences limit
        for (Integer element : elements) {
            if (valuesMap.containsKey(element) && valuesMap.get(element) < maxOcurrences) {
                Integer amount = valuesMap.get(element) + 1;
                valuesMap.put(element, amount);
            } else if (!valuesMap.containsKey(element)) {
                valuesMap.put(element, 1);
            }
        }

        //Printing a list with max ocurrences limit
        for (Integer element : elements) {
            if (valuesMap.get(element) > 0) {
                resultList.add(element);
                Integer amount = valuesMap.get(element);
                valuesMap.put(element, amount - 1);
            }

        }

        //Converting a list into an array
        int[] integers = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            integers[i] = resultList.get(i);
        }

        return integers;
    }
}
