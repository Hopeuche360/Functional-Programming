package combinator_pattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;
import combinator_pattern.CustomerRegistrationValidator.ValidationResult;

import static combinator_pattern.CustomerRegistrationValidator.ValidationResult.*;

public interface CustomerRegistrationValidator extends Function<Customer, ValidationResult> {

    static CustomerRegistrationValidator isEmailValid () {
        return customer -> customer.getEmail().matches("^[A-Za-z0-9+_.-]+@(.+)$") ? SUCCESS : EMAIL_NOT_VALID;
    }

    static CustomerRegistrationValidator isPhoneNumberValid () {
        return customer -> customer.getPhoneNumber().length() == 11 ? SUCCESS : PHONE_NUMBER_NOT_VALID;
    }

    static CustomerRegistrationValidator isAdult () {
        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() > 18 ? SUCCESS : NOT_AN_ADULT;
    }



    enum ValidationResult{
        SUCCESS,
        EMAIL_NOT_VALID,
        PHONE_NUMBER_NOT_VALID,
        NOT_AN_ADULT
    }
}
