package com.example.lab2;

public class TextCounter {


    public static int countCharacters(String phrase){

        return phrase.length();
    }

    public static int countWords(String words){

        int wordCount = 0;
        boolean charInWord = false;

        for (int i = 0; i < words.length(); i++) {
            char c = words.charAt(i);

            if (Character.isLetter(c)) {
                charInWord = true;
            } else if (charInWord) {

                //Jeigu sekanti raide nebe raide, tada reiskia kad zodzio pabaiga
                wordCount++;
                charInWord = false;
            }
        }

        //jeigu paskutine raide yra atskirai nuo paskutinio zodzio
        if (charInWord) {
            wordCount++;
        }

        return wordCount;

    }
}
