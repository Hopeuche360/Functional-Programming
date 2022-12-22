package functional_interface;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;

/**
 * Supplier<T>
 *
 * Represents a supplier of results. it takes no arguments and returns a result.
 * There is no requirement that a new or distinct result be returned each time the supplier is invoked.
 *
 * This is a functional interface whose functional method is get().
 */
public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        System.out.println(getConnectionUrl.get());
        System.out.println(getConnectionUrls.get());
    }

    static String getDBConnectionUrl() {
        return "jdbc://localhost/5432/test";
    }

    static Supplier<String> getConnectionUrl = () -> "jdbc://localhost/5432/test";

    static Supplier<List<String>> getConnectionUrls = () -> List.of(
            "jdbc://localhost/5432/test",
            "jdbc://localhost/5432/supplierDB");
}
