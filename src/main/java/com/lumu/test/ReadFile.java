package com.lumu.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static String readFile(String filePath) throws IOException {
        StringBuilder textBuilder = new StringBuilder();
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                textBuilder.append(line).append(" ");
            }
        }
        return textBuilder.toString().trim();
    }

}
