package com.example.lab2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testCountCharacters() {
        final String givenString = ("This is a test!");
        final int expectedResult = 15;

        final int actualResult = TextCounter.countCharacters(givenString);

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testCountCharactersGivenEmpty() {
        final String givenString = ("");
        final int expectedResult = 0;

        final int actualResult = TextCounter.countCharacters(givenString);

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testCountWords() {
        final String givenString = "This is a test!";
        final int expectedResult = 4;

        final int actualResult = TextCounter.countWords(givenString);

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testCountWordsGivenWhitespace() {
        final String givenString = "This     is  a      test                !";
        final int expectedResult = 4;

        final int actualResult = TextCounter.countWords(givenString);

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testCountWordsGivenRandomSymbols() {
        final String givenString = "This is a  * >><.,,,,;----++ test!";
        final int expectedResult = 4;

        final int actualResult = TextCounter.countWords(givenString);

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testCountWordsGivenEmpty() {
        final String givenString = "";
        final int expectedResult = 0;

        final int actualResult = TextCounter.countWords(givenString);

        assertEquals(expectedResult, actualResult);
    }
}