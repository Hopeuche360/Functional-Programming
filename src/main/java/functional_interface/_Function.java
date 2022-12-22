package functional_interface;

import java.util.function.Function;

/**
 * A function accepts one argument and produces a result.
 *
 * Function<T,R>
 */
public class _Function {
    public static void main(String[] args) {
        System.out.println(increment(13));
        System.out.println(incrementFunction.apply(12));
        System.out.println(incrementFunction.compose(multiplyFunction).apply(3));
        System.out.println(multiplyFunction.compose(incrementFunction).apply(5)); //read from right to left
        System.out.println(incrementFunction.andThen(multiplyFunction).apply(5)); //read from left to right
    }

    static int increment(int number) {
        return number+1;
    }

    static Function<Integer, Integer> incrementFunction = number -> number + 1;
    static Function<Integer, Integer> multiplyFunction = number -> number * 10;
}
