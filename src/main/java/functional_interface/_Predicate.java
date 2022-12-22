package functional_interface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.regex.Pattern;

/**
 * Predicate<T>
 *
 * Represents a predicate (boolean-valued function) of one argument.
 */
public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isEmailValid("hopechijuka@gmail"));
        System.out.println(isEmailValidPredicate.test("hopechijuka@gmailcom"));

        System.out.println();
        System.out.println(isEmailValidPredicate.or(containsNumber2).test("hope9@gmail.com"));
        System.out.println(isEmailValidPredicate.and(containsNumber2).test("hope9@gmail.com"));
        System.out.println(isEmailValidPredicate.and(containsNumber2).negate().test("hope9@gmail.com"));
        System.out.println();
        System.out.println(isLengthEqual.test("encyclopedia", 9));
    }

    //imperative
    static boolean isEmailValid(String email) {
        return Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", email);
    }

    //declarative
    static Predicate<String> isEmailValidPredicate = email -> Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", email);
    static Predicate<String> containsNumber2 = email -> email.contains("2");

    /**
     * BiPredicate<T,U>
     *
     * Represents a predicate (boolean-valued function) of two arguments.
     * This is the two-arity specialization of Predicate.
     */

    static BiPredicate<String, Integer> isLengthEqual = (name, value) -> name.length() == value;
}
