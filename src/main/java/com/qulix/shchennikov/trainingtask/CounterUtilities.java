package com.qulix.shchennikov.trainingtask;

import java.util.*;

/**
 *  Класс служит для подсчёта числа повторений в списке
 */
public class CounterUtilities {
    /**
     * Функция для получения списка объектов WordsContainer.
     *
     * @param listOfWords список слов
     * @return возвращает список объектов типа WordsContainer
     */
    public static List<WordsContainer> countingRepetitions(List<String> listOfWords){
        Map<String, Integer> mapOfWords = new HashMap<String, Integer>();
        List<WordsContainer> listOfWordContainers =  new ArrayList<WordsContainer>();

        for (String word : listOfWords) {
            if (mapOfWords.containsKey(word)) {
                mapOfWords.put(word, mapOfWords.get(word) + 1);
            }
            else {
                mapOfWords.put(word, 1);
            }
        }
        for (String wordInMap : mapOfWords.keySet()) {
            listOfWordContainers.add(new WordsContainer(wordInMap,mapOfWords.get(wordInMap)));
        }
        Collections.sort(listOfWordContainers , Collections.reverseOrder());
        return listOfWordContainers;
    }

}
