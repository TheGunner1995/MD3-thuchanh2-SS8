package rikkei.academy.test;

import org.junit.jupiter.api.Test;
import rikkei.academy.FizzBuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void testFizz3(){
        int number = 3;
        String expected = "fizz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    void testFizz5(){
        int number = 5;
        String expected = "buzz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    void testFizz6(){
        int number = 6;
        String expected = "fizz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    void testFizz15(){
        int number = 15;
        String expected = "fizz-buzz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);
    }
}
