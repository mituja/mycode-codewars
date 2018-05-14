package com.codewars.complementarydna;

public class DnaStrand {
    public static String makeComplement(String dna) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < dna.length(); i++) {
            sb.append(swapLetter(dna.charAt(i)));
        }

        return String.valueOf(sb);
    }

    static char swapLetter(char letterToSwap) {
        char swappedLetter;
        if (letterToSwap == 'T') {
            swappedLetter = 'A';
        } else if (letterToSwap == 'A') {
            swappedLetter = 'T';
        } else if (letterToSwap == 'C') {
            swappedLetter = 'G';
        } else if (letterToSwap == 'G') {
            swappedLetter = 'C';
        } else swappedLetter = letterToSwap;
        return swappedLetter;
    }

}

//T -> A
//A -> T
//C -> G
//G -> C