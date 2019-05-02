package com.github.owl4soul.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

public class UserPasswordConstraintValidator implements ConstraintValidator<UserPasswordConstraint, List<String>> {

    @Override
    public void initialize(UserPasswordConstraint constraintAnnotation) {

    }

    @Override
    public boolean isValid(List<String> passwords, ConstraintValidatorContext constraintValidatorContext) {
        String password = passwords.get(0);
        String confirmPassword = passwords.get(1);
        if (password.equals(confirmPassword)) {
            return true;
        } else {
            return false;
        }
    }
}
