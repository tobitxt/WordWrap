package com.example.WordWrap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordWrapTest {

    WordWrap wordWrap = new WordWrap();

    @Test
    public void wrapperShouldReturnAnExceptionIfThereIsNoWord() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            wordWrap.wrapper("", 1);
        });
    assertEquals(exception.getMessage(), "give a valid input");
    }

    @Test
    public void wrapperShouldReturnAnExceptionIfThereIsNoWord2() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            wordWrap.wrapper("", -1);
        });
        assertEquals(exception.getMessage(), "give a valid input");
    }

    @Test
    public void wrapperShouldReturnAnExceptionIfThereIsZeroNumberOfColumns() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            wordWrap.wrapper("word", 0);
        });
        assertEquals(exception.getMessage(), "give a valid input");
    }

    @Test
    public void wrapperShouldReturnAnExceptionIfThereIsZeroNumberOfColumnsAndNoWord() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            wordWrap.wrapper("", 0);
        });
        assertEquals(exception.getMessage(), "give a valid input");
    }

    @Test
    public void wrapperShouldReturnSingleUnwrappedWordIfLettersAreLessThanNumber() {
        assertEquals(wordWrap.wrapper("word", 5), "word");
    }

    @Test
    public void wrapperShouldReturnSingleUnwrappedWordIfLettersAreEqualToNumber() {
        assertEquals(wordWrap.wrapper("word", 4), "word");
    }

    @Test
    public void wrapperShouldReturnSingleWrappedWordIfLettersAreMoreThanNumber() {
        assertEquals(wordWrap.wrapper("word", 3), "wor\nd");
    }

    @Test
    public void wrapperShouldReturnSingleWrappedWordIfLettersAreMoreThanNumber2() {
        assertEquals(wordWrap.wrapper("word", 2), "wo\nrd");
    }

    @Test
    public void wrapperShouldReturnSingleWrappedWordIfLettersAreMoreThanNumber3() {
        assertEquals(wordWrap.wrapper("word", 1), "w\no\nr\nd");
    }

    @Test
    public void wrapperShouldReturnMultipleWrappedWordsIfLettersAreMoreThanNumber() {
        assertEquals(wordWrap.wrapper("wordwordword", 4), "word\nword\nword");
    }

    @Test
    public void wrapperShouldReturnMultipleWrappedWordsIfLettersAreMoreThanNumber2() {
        assertEquals(wordWrap.wrapper("wordwordword", 3), "wor\ndwo\nrdw\nord");
    }

    @Test
    public void wrapperShouldReturnMultipleWrappedWordsIfLettersAreMoreThanNumber3() {
        assertEquals(wordWrap.wrapper("wordword", 1), "w\no\nr\nd\nw\no\nr\nd");
    }
}