package fizz;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {

    public String fizz(IntStream range) {
        return range.mapToObj(i -> intToFizzBuzzed(i)).
                collect(Collectors.joining(", "));
    }

    private String intToFizzBuzzed(int x) {
        if (x == 0) {
            return "0";
        } else if (x % 15 == 0) {
            return "FizzBuzz";
        } else if (x % 5 == 0) {
            return "Buzz";
        } else if (x % 3 == 0) {
            return "Fizz";
        } else {
            return Integer.toString(x);
        }
    }
}
