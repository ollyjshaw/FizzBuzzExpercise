package fizz;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class FizzTest {

    @Test
    public void test0To2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        IntStream range = IntStream.range(0, 3);
        assertEquals("0, 1, 2", fizzBuzz.fizz(range));
    }

    @Test
    public void test0To10() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        IntStream range = IntStream.range(0, 11);
        assertEquals("0, 1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz", fizzBuzz.fizz(range));
    }

    @Test
    public void test12To15() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        IntStream range = IntStream.range(12, 16);
        assertEquals("Fizz, 13, 14, FizzBuzz", fizzBuzz.fizz(range));
    }

}
