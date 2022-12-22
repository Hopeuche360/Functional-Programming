package functional_interface;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * BiFunction<T,U,R>
 * Represents a function that accepts two arguments and produces a result.
 */
public class _BiFunction {
    public static void main(String[] args) {
        System.out.println(incrementAndMultiply(2, 5));
        System.out.println(incrementAndMultiplyBiFunction.apply(5, 2));
        System.out.println(incrementAndMultiplyBiFunction.andThen(divideByTwo).apply(1, 5));
    }

    //imperative
    static int incrementAndMultiply(int number, int value) {
        return (number+1) * value;
    }

    //declarative
    static BiFunction<Integer, Integer, Integer> incrementAndMultiplyBiFunction =
            (number, value) -> (number+1) * value;

    static Function<Integer, Integer> divideByTwo = number -> number / 2;
}
