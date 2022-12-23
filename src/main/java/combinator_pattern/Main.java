package combinator_pattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Hope",
                "hope@gmail.com",
                "09876543211",
                LocalDate.of(2001,01,26));

        System.out.println(new CustomerValidatorService().isValid(customer));
    }
}
