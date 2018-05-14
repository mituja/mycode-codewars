package com.codewars.encryption;

public class AlternatingSplit {

    public static String encrypt(final String text, final int n) {

        if (n <= 0) {
            return text;
        }
        if (text == null) {
            return null;
        } else if (text.equals("")) {
            return "";
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < text.length(); i += 2) {
            sb.append(text.charAt(i));
        }
        for (int i = 0; i < text.length(); i += 2) {
            sb.append(text.charAt(i));
        }

        String newText = String.valueOf(sb);

        if (n > 1) {
            return encrypt(newText, n - 1);
        }

        return newText;
    }


    public static String decrypt(final String encryptedText, final int n) {
        if (n <= 0) {
            return encryptedText;
        }
        if (encryptedText == null) {
            return null;
        } else if (encryptedText.equals("")) {
            return "";
        }

        StringBuilder sb = new StringBuilder();

        for (int i = encryptedText.length() / 2; i < encryptedText.length() - 1; i++) {
            sb.append(encryptedText.charAt(i));
            sb.append(encryptedText.charAt(i - (encryptedText.length() / 2)));
        }
        sb.append(encryptedText.charAt(encryptedText.length() - 1));
        if (encryptedText.length() % 2 == 0) {
            sb.append(encryptedText.charAt((encryptedText.length() / 2) - 1));
        }

        String newText = String.valueOf(sb);

        if (n > 1) {
            return decrypt(newText, n - 1);
        }
        return newText;
    }


    public static void main(String[] args) {
        System.out.println("encryption:");
        encrypt("This is a test!", 2);
        System.out.println("Decryption:");
        System.out.println(decrypt("hsi  etTi sats!", 1));
    }
}
