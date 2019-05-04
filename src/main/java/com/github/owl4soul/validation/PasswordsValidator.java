package com.github.owl4soul.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class PasswordsValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }

    @Override
    public void validate(Object o, Errors errors) {

    }
}
