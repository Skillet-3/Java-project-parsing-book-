package com.qulix.shchennikov.trainingtask;

/**
 * Класс служит для хранения объектов
 */
public class WordsContainer implements Comparable<WordsContainer> {
    /**
     * слово из текста
     */
    private final String word;

    /**
     * число повторений
     */
    private final int repetition;

    public WordsContainer(String word, int repetition) {
        this.word = word;
        this.repetition = repetition;
    }

    public int getRepetition() {
        return repetition;
    }

    @Override
    public int compareTo(WordsContainer word) {
        return Integer.valueOf(repetition).compareTo(word.getRepetition());
    }

    @Override
    public String toString() {
        return word + " - " + repetition;
    }

}
