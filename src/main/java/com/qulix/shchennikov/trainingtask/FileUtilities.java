package com.qulix.shchennikov.trainingtask;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Класс считывает с файла текст и разбивает на слова
 */
public class FileUtilities {
    /**
     * Функция для получения списка слов.
     *
     * @param filePath пусть к файлу
     * @return Возвращает список слов
     */
    public static List<String> readWords(String filePath) throws FileNotFoundException {
        List<String> listOfWords = new ArrayList<String>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileReader(filePath));
            scanner.useDelimiter("[^\\wа-яёА-ЯЁ']+");
            while (scanner.hasNext()) {
                String word = scanner.next().toLowerCase();
                listOfWords.add(word);
            }
        }
        finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        return listOfWords;
    }
    /** Функция для записи списка в файл.
     *
     * @param filePath пусть к файлу
     * @param listOfWords отсортированный список объектов WordsContainer
     */
    public static void writeWords(String filePath , List<WordsContainer> listOfWords) throws IOException {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(filePath));
            for (WordsContainer wordsContainer : listOfWords) {
                bufferedWriter.write(wordsContainer.toString());
                bufferedWriter.newLine();
            }
        }
        finally{
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
        }
    }
}
