package functional_interface;

import java.util.function.BiConsumer;

/**
 * BiConsumer<T,U>
 *
 * Represents an operation that accepts two input arguments and returns no result.
 */
public class _BiConsumer {
    public static void main(String[] args) {
        greetCustomerBi.accept(new Customer("Hope", "783456789"), false);
        System.out.println();
        greetCustomer.accept(new Customer("Zoe", "234567890"), true);
        greetCustomer.andThen(greetCustomerBi).accept(new Customer("Freya", "456789765467"), false);
    }

    static BiConsumer<Customer, Boolean> greetCustomer = (customer, showNumber) ->
            System.out.println("Hello " + customer.name
                    + ", thanks for registering "
                    + (showNumber ? "4567890" : "****"));

    static BiConsumer<Customer, Boolean> greetCustomerBi = ((customer, showPhoneNumber) ->
            System.out.printf("Hello %s, thanks for registering %s", customer.name,
                    showPhoneNumber ? customer.phoneNumber : "******"));

    static class Customer {
        private final String name;
        private final String phoneNumber;

        Customer(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }
    }
}
