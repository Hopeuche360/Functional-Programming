package functional_interface;

import java.util.function.Consumer;

/**
 * Consumer<T>
 *
 * Represents an operation that accepts a single input argument and returns no result.
 * Unlike most other functional interfaces, Consumer is expected to operate via side-effects.
 */
public class _Consumer {
    public static void main(String[] args) {
        greetCustomer(new Customer("Hope", "245678909876"));
        System.out.println();
        greetCustomerConsumer.accept(new Customer("Anthony", "4567890987654"));
    }

    //imperative
    static void greetCustomer(Customer customer) {
        System.out.printf("Hello %s, thanks for registering %s", customer.name, customer.phoneNumber);
    }

    //declarative
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.printf("Hello %s, thanks for registering %s", customer.name, customer.phoneNumber);

    static class Customer {
        private final String name;
        private final String phoneNumber;

        Customer(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }
    }
}
