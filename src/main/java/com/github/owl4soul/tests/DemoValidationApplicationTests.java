package com.github.owl4soul.tests;

import com.github.owl4soul.forms.RegistrationForm;
import com.github.owl4soul.model.User;
import org.junit.Assert;
import org.junit.Test;


import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class DemoValidationApplicationTests {

    // Инициализация Validator
    private static Validator validator;
    static {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        validator = validatorFactory.usingContext().getValidator();
    }

    @Test
    public void testValidators() {
        final RegistrationForm registrationForm = new RegistrationForm("sdssd", "sdsd");

        Set<ConstraintViolation<RegistrationForm>> validates = validator.validate(registrationForm);
        Assert.assertTrue(validates.size() > 0);
        validates.stream().map(v -> v.getMessage())
                .forEach(System.out::println);
    }
}