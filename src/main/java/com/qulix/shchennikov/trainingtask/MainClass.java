package com.qulix.shchennikov.trainingtask;

import java.io.IOException;
import java.util.List;
/**
 * Точка входа в программу
 */
public class MainClass {
    public static void main(String[] args) throws IOException {
        List<String> listOfWords = FileUtilities.readWords("../../src/main/resources/Voina i mir.txt");
        List<WordsContainer> listOfWordContainers = CounterUtilities.countingRepetitions(listOfWords);
        FileUtilities.writeWords("../../results/res.txt", listOfWordContainers);
    }
}
