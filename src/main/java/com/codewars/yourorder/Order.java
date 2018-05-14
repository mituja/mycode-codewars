package com.codewars.yourorder;

public class Order {

    public static String order(String words) {

        if (words.equals("")){
            return words;
        }

        String[] splitedWords = words.split(" ");
        String[] sortedWords = new String[splitedWords.length];

        for (String splitedWord : splitedWords) {
            sortedWords[(Integer.parseInt(splitedWord.replaceAll("[^\\d.]", ""))) - 1] = splitedWord;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sortedWords.length; i++) {
            sb.append(sortedWords[i]);
            if (i < sortedWords.length - 1) {
                sb.append(" ");
            }
        }

        return String.valueOf(sb);
    }
}
