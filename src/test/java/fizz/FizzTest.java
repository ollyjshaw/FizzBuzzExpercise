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
    public void test0To20() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        IntStream range = IntStream.range(0, 21);
        assertEquals("0, 1, 2, lucky, 4, buzz, fizz, 7, 8, fizz, buzz, 11, fizz, lucky, 14, fizzbuzz, 16, 17, fizz, 19, buzz",
                fizzBuzz.fizz(range));
    }
}
