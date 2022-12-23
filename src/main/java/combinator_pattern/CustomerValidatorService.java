package combinator_pattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class CustomerValidatorService {
    private boolean isEmailValid(String email) {
        return Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", email);
    }

    private boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.length() == 11;
    }

    private boolean isAdult(LocalDate dob) {
        return Period.between(dob, LocalDate.now()).getYears() > 18;
    }

    public boolean isValid(Customer customer) {
        return isEmailValid(customer.getEmail())
                && isPhoneNumberValid(customer.getPhoneNumber())
                && isAdult(customer.getDob());
    }
}
