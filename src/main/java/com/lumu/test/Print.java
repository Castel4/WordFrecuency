package com.lumu.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.lumu.test.CountWord.countWordFrequency;

public class Print {

    public static void printWordFrequency(String text) {
        String[] words = text.split("\\s+");
        Map<String, Integer> wordFrequency = countWordFrequency(words);
        int characterCount = text.length();
        int totalWords = words.length;

        System.out.println(totalWords + " words");
        System.out.println(characterCount + " characters");

        printWordHistogram(wordFrequency);
    }


    public static void printWordHistogram(Map<String, Integer> wordFrequency) {
        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(wordFrequency.entrySet());
        sortedEntries.sort(
                (entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue())
        );
        for (Map.Entry<String, Integer> entry : sortedEntries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
