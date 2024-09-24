package com.lumu.test;

import java.io.IOException;

import static com.lumu.test.Print.printWordFrequency;
import static com.lumu.test.ReadFile.readFile;

public class WordFrequencyCounter {

    public static void main(String[] args) {
        String filePath = "src/main/resources/input.txt";
        try {
            String text = readFile(filePath);
            printWordFrequency(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}